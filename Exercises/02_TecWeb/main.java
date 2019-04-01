package parserSAX;

import java.time.LocalDate;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class main {
	private enum fields {lettera, mittente, data, destinatario, saluto, corpo, paragrafo, chiusura, firma}
	
	private static class letteraHandler extends DefaultHandler {
		private String mittente, destinatario, saluto, chiusura, firma, paragrafo;
		private LocalDate data;
		private boolean[] inElement = new boolean[fields.values().length];
		
		public void startElement (String namespaceURI, String localName, String rawName) {
			for(var e : fields.values()) {
				if(localName.equals(e.name())) inElement[e.ordinal()] = true;
			}
		} 
		
		public void characters (char ch[], int start, int length) {
			if(inElement[fields.valueOf("mittente").ordinal()]) mittente= new String(ch, start, length);
			if(inElement[fields.valueOf("data").ordinal()]) data = LocalDate.parse(new String(ch, start, length));
			if(inElement[fields.valueOf("destinatario").ordinal()]) destinatario = new String(ch, start, length);
			if(inElement[fields.valueOf("saluto").ordinal()]) saluto = new String(ch, start, length);
			if(inElement[fields.valueOf("chiusura").ordinal()]) chiusura = new String(ch, start, length);
			if(inElement[fields.valueOf("firma").ordinal()]) firma = new String(ch, start, length);
			if(inElement[fields.valueOf("paragrafo").ordinal()]) paragrafo = new String(ch, start, length);
		} 
		
		public void endElement(String namespaceURI, String localName, String qName) {
			for(var e : fields.values()) {
				if(localName.equals(e.name())) inElement[e.ordinal()] = false;
			}
			if (localName.equals("lettera"))
				System.out.println("[LETTERA]: " + mittente + "; " + destinatario + "; " + saluto + "; " + paragrafo + "; " + chiusura + "; " + firma);
		}
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		try {
			SAXParserFactory SAXPFactory = SAXParserFactory.newInstance();
			SAXPFactory.setValidating(true);
			var parser = SAXPFactory.newSAXParser();
			var reader = parser.getXMLReader();
			reader.setContentHandler(new letteraHandler());
			for(var arg : args) {
				reader.parse(arg);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}