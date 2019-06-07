package parserDOM;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.SAXParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;

public class Main {
	private enum fields {lettera, mittente, data, destinatario, saluto, corpo, paragrafo, chiusura, firma}

	private static class ErrorsHandler implements ErrorHandler {
		@Override
		public void warning(SAXParseException e) {
			System.out.println("Parsing Warning: " + e.getMessage());
		}

		@Override
		public void error(SAXParseException e) {
			System.out.println("XML document NOT valid");
			System.out.println("Parsing Error: " + e.getMessage());
		}

		@Override
		public void fatalError(SAXParseException e) {
			System.out.println("XML document NOT well-formed");
			System.out.println("Parsing Fatal Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory DOMFactory = DocumentBuilderFactory.newInstance();
			DOMFactory.setValidating(true);
			DOMFactory.setNamespaceAware(true);
			String schemaFeature = "http://apache.org/xml/features/validation/schema";
			String ignorableWhitespace = "http://apache.org/xml/features/dom/include-ignorable-whitespace";
			DOMFactory.setFeature(schemaFeature, true);
			DOMFactory.setFeature(ignorableWhitespace, true);
			DocumentBuilder builder = DOMFactory.newDocumentBuilder();
			builder.setErrorHandler(new ErrorsHandler());

			for (String arg : args) {
				Document document = builder.parse(new File(arg));
				document.getDocumentElement().normalize();
				for (String s : getLettera(document)) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static ArrayList<String> getLettera(Document d) {
		ArrayList<String> res = new ArrayList<String>();
		NodeList lettersList = d.getElementsByTagName("lettera");
		
		for(int i = 0; i < lettersList.getLength(); i++) {
			Node n = lettersList.item(i);
			NodeList childs = n.getChildNodes();
			
			for(int j = 0; j < childs.getLength(); j++) {
				Node nn = childs.item(j);
				if(Arrays.stream(fields.values()).anyMatch((t) -> t.name().equals(nn.getNodeName()))) {
					res.add(nn.getNodeName() + " " + nn.getTextContent());
				}
			}
		}
		return res;
	}
}