package parserSAX;

import java.time.LocalDate;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.ErrorHandler;


public class Main {
	private enum fields {lettera, mittente, data, destinatario, saluto, corpo, paragrafo, chiusura, firma}
	
	private static class ErrorsHandler implements ErrorHandler {		
		@Override
		public void warning (SAXParseException e) { System.out.println("Parsing Warning: "+e.getMessage()); }
		
		@Override
		public void error (SAXParseException e) {
			System.out.println("XML document NOT valid");
			System.out.println("Parsing Error: "+e.getMessage());
		}
		
		@Override
		public void fatalError (SAXParseException e) {
			System.out.println("XML document NOT well-formed");
			System.out.println("Parsing Fatal Error: "+e.getMessage());
		}
	}
	
	private static class LetteraHandler extends DefaultHandler {
		private String mittente, destinatario, saluto, chiusura, firma, paragrafo;
		private LocalDate data;
		private boolean[] inElement = new boolean[fields.values().length];
		
		public void startElement (String namespaceURI, String localName, String rawName, Attributes atts) {
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
		}

		public String getResultAsString() {
			return "Mittente: " + mittente + ";\t" + 
					"Destinatario: " + destinatario + ";\t" +
					"Data: " + data.toString() + ";\t" +
					"Saluto: " + saluto + ";\t" + 
					"Paragrafo: " + paragrafo + ";\t" + 
					"Chiusura: " + chiusura + ";\t" + 
					"Firma: " + firma;
		}
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		try {
			SAXParserFactory SAXPFactory = SAXParserFactory.newInstance();
			SAXPFactory.setValidating(true);
			SAXPFactory.setNamespaceAware(true);
			var parser = SAXPFactory.newSAXParser();
			var reader = parser.getXMLReader();
			String schemaFeature = "http://apache.org/xml/features/validation/schema";
			String ignorableWhitespace = "http://apache.org/xml/features/dom/include-ignorable-whitespace";
			var handler = new LetteraHandler();
			reader.setContentHandler(handler);
			reader.setErrorHandler(new ErrorsHandler());
			reader.setFeature(schemaFeature, true);
			for(var arg : args) {
				reader.parse(arg);
				System.out.println(handler.getResultAsString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}