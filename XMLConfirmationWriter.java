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
public class XMLConfirmationWriter extends XMLWriter
{
	private static String theFilename = ""; 
	private static Document theDoc;
	
	public XMLConfirmationWriter()
	{
		
		try {		
			
			theFilename = "H:\\eclipse\\workspace\\Week1\\Assignment2_TextBased\\Confirmation.xml";// declares file path
			theDoc = Reader(theFilename);
			System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
			NodeList nList = theDoc.getElementsByTagName("Cid");// get root
					
			System.out.println("----------------------------");
	
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
	
				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
	
					Element eElement = (Element) nNode;
	
					System.out.println("Confirmation id: " + eElement.getAttribute("N"));
					System.out.println("Confirmation FirstName: " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
					System.out.println("Confirmation LastName: " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
					System.out.println("Confirmation No. Max Guests: " + eElement.getElementsByTagName("Guests").item(0).getTextContent());
					System.out.println("Confirmation Available Starting: " + eElement.getElementsByTagName("StartDate").item(0).getTextContent());
					System.out.println("Confirmation Available Ending: " + eElement.getElementsByTagName("EndDate").item(0).getTextContent());
					System.out.println("Confirmation Apartment Name: " + eElement.getElementsByTagName("ApartmentName").item(0).getTextContent());
					System.out.println("Confirmation No. Bedrooms: " + eElement.getElementsByTagName("Bedrooms").item(0).getTextContent());
					System.out.println("Confirmation  Living Room? " + eElement.getElementsByTagName("LivingRoom").item(0).getTextContent());	
					System.out.println("Confirmation No. Bathrooms: " + eElement.getElementsByTagName("Bathrooms").item(0).getTextContent());
					System.out.println("Confirmation  Catering or not? " + eElement.getElementsByTagName("Catering").item(0).getTextContent());	
					System.out.println("Confirmation  Price? " + eElement.getElementsByTagName("Price").item(0).getTextContent());	
				}
			}
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
	}

	private Document Reader(String theFilename2) {
		// TODO Auto-generated method stub
		return null;
	}
}
