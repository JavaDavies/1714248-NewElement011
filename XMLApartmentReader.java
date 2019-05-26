/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

@SuppressWarnings("unused")
public class XMLApartmentReader extends XMLReader
{
	private static String theFilename = ""; // declares
	private static Document theDoc;
	
	public XMLApartmentReader()
	{
		
		try {		
			
			theFilename = "H:\\eclipse\\workspace\\Week1\\Assignment2_TextBased\\Apartments.xml";// declare the path to the file
			theDoc = Reader(theFilename);
			System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
			NodeList nList = theDoc.getElementsByTagName("Apartment");
					
			System.out.println("----------------------------");
	
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
	
				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
	
					Element eElement = (Element) nNode;
	
					System.out.println("Apartment id: " + eElement.getAttribute("id"));
					System.out.println("Apartment Name: " + eElement.getElementsByTagName("Name").item(0).getTextContent());
					System.out.println("Apartment Price: " + eElement.getElementsByTagName("Price").item(0).getTextContent());
					System.out.println("Apartment Available Starting: " + eElement.getElementsByTagName("AStartDate").item(0).getTextContent());
					System.out.println("Apartment Available Ending: " + eElement.getElementsByTagName("AEndDate").item(0).getTextContent());
					System.out.println("Apartment No. Max Guests: " + eElement.getElementsByTagName("MaxGuests").item(0).getTextContent());
					System.out.println("Apartment No. Bedrooms: " + eElement.getElementsByTagName("Bedrooms").item(0).getTextContent());
					System.out.println("Apartment No. Bathrooms: " + eElement.getElementsByTagName("Bathrooms").item(0).getTextContent());
					System.out.println("Apartment Has a Living Room? " + eElement.getElementsByTagName("LivingRoom").item(0).getTextContent());	
				}
			}
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
	}
}//end XML CLASS	
