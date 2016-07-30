/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingxmlfile;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.FactoryConfigurationError; 
import javax.xml.parsers.ParserConfigurationException; 
import org.xml.sax.SAXException; 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException; 
import org.w3c.dom.Document;
import org.w3c.dom.DOMException;
import javax.xml.transform.dom.DOMSource; 

import javax.xml.transform.stream.StreamResult; 
import org.w3c.dom.Document;
import org.w3c.dom.DOMException;

import java.io.*;

public class TransformationApp 
{
  static Document document; 

  public static void main(String argv[])
  {
//    if (argv.length != 1) {
//      System.err.println (
//        "Usage: java TransformationApp filename");
//      System.exit (1);
//    }

    DocumentBuilderFactory factory =
      DocumentBuilderFactory.newInstance();
    //factory.setNamespaceAware(true);
    //factory.setValidating(true); 

    try {
      File f = new File("C:\\Users\\waxxan\\Documents\\NetBeansProjects\\ReadingXmlFile\\src\\readingxmlfile\\StudentPersonalInfo.hbm.xml");
      DocumentBuilder builder =
        factory.newDocumentBuilder();
      document = builder.parse(f);
      
       // Get the first <slide> element in the DOM
        NodeList list = document.getElementsByTagName("slide");
        Node node = list.item(0); 
        
        DOMSource source = new DOMSource(document);
        DOMSource source = new DOMSource(node);
        StreamResult result = new StreamResult(System.out);
t       ransformer.transform(source, result); 
  
    } catch (SAXParseException spe) {
      // Error generated by the parser
      System.out.println("\n** Parsing error"
        + ", line " + spe.getLineNumber()
        + ", uri " + spe.getSystemId());
      System.out.println("  " + spe.getMessage() );
  
      // Use the contained exception, if any
      Exception x = spe;
      if (spe.getException() != null)
        x = spe.getException();
      x.printStackTrace();

    } catch (SAXException sxe) {
      // Error generated by this application
      // (or a parser-initialization error)
      Exception x = sxe;
      if (sxe.getException() != null)
        x = sxe.getException();
      x.printStackTrace();

    } catch (ParserConfigurationException pce) {
      // Parser with specified options can't be built
      pce.printStackTrace();

    } catch (IOException ioe) {
      // I/O error
      ioe.printStackTrace();
    }
  } // main 
} 