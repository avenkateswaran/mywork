/**
 * 
 */
package resources;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author CG16271
 *
 */
public class xmlRead {
	
	public static String readXmlFile(String xmlfilename,String tagname,String subtagName){
		
		String tagval=null;
	
		//read the xml file 
		
		try{
		File xmlfile=new File(xmlfilename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlfile); 
		
		doc.getDocumentElement().normalize();

//		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName(tagname);

		System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
	
				Node nNode = nList.item(temp);
	
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
	
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	
					Element eElement = (Element) nNode;
					
					tagval=eElement.getElementsByTagName(subtagName).item(0).getTextContent();
					System.out.println(tagval);
					
	
				}
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return tagval;
	
		
		
	}

}
