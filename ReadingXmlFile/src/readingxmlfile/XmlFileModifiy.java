
package readingxmlfile;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.transform.*;

public class XmlFileModifiy {

	public static void main(String argv[]) {

	   try {
		String filepath = "C:\\Users\\waxxan\\Documents\\NetBeansProjects\\ReadingXmlFile\\src\\readingxmlfile\\StuTestFile.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);

		// Get the root element
		Node company = doc.getFirstChild();

		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		// Node staff = company.getFirstChild();

		// Get the staff element by tag name directly
		Node staff = doc.getElementsByTagName("class").item(0);

		// update staff attribute
		NamedNodeMap attr = staff.getAttributes();
		Node nodeAttr = attr.getNamedItem("table");
		nodeAttr.setTextContent("rehman");

		
                doc.getDocumentElement().normalize();
		// loop the staff child node
		NodeList list = staff.getChildNodes();

		
                  TransformerFactory transformerFactory = TransformerFactory.newInstance();
                  Transformer transformer = transformerFactory.newTransformer();
                  transformer.setOutputProperty(OutputKeys.INDENT, "no");
                  transformer.setOutputProperty(
                        "{http://xml.apache.org/xslt}indent-amount", "4");
                  DOMSource source = new DOMSource(doc);
                  StreamResult result = new StreamResult(new File(filepath));
		  transformer.transform(source, result);

		  System.out.println("Done");

	   } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   } catch (TransformerException tfe) {
		tfe.printStackTrace();
	   } catch (IOException ioe) {
		ioe.printStackTrace();
	   } catch (SAXException sae) {
		sae.printStackTrace();
	   }
	}
}