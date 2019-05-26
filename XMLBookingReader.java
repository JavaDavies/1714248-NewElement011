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
public class XMLBookingReader extends XMLReader
{
	private static String theFilename = ""; 
	private static Document theDoc;
	
	public XMLBookingReader()
	{
		
		try {		
			
			theFilename = "H:\\eclipse\\workspace\\Week1\\Assignment2_TextBased\\Bookings.xml";
			theDoc = Reader(theFilename);
			System.out.println("Root element :" + theDoc.getDocumentElement().getNodeName());
			
			NodeList nList = theDoc.getElementsByTagName("Booking");
					
			System.out.println("----------------------------");
	
			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
	
				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
	
					Element eElement = (Element) nNode;
	
					System.out.println("Booking id: " + eElement.getAttribute("id"));
					System.out.println("Booking First Name: " + eElement.getElementsByTagName("FirstName").item(0).getTextContent());
					System.out.println("Booking Last Name: " + eElement.getElementsByTagName("LastName").item(0).getTextContent());
					System.out.println("Booking Guests: " + eElement.getElementsByTagName("Guests").item(0).getTextContent());
					System.out.println("Booking Available Start: " + eElement.getElementsByTagName("StartDate").item(0).getTextContent());
					System.out.println("Booking Available Ending: " + eElement.getElementsByTagName("EndDate").item(0).getTextContent());
					System.out.println("Booking Catering: " + eElement.getElementsByTagName("Catering").item(0).getTextContent());	
				}
			}
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
	}
}// end xmlbookingreader
