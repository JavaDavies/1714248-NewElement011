/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
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

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



@SuppressWarnings("unused")
public class XMLBookingWriter extends XMLWriter {
	
	public static void main(String argv[]) throws SAXException, IOException {


	 try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Confirmation");
			doc.appendChild(rootElement);

			// staff elements
			Element Cid = doc.createElement("Cid");
			rootElement.appendChild(Cid);

			// set attribute to Cid element
			Attr attr = doc.createAttribute("N");
			attr.setValue("0001");
			Cid.setAttributeNode(attr);

			// shorten way
			// Cid.setAttribute("id", "0001");

			// firstname elements
			Element FirstName = doc.createElement("FirstName");
			FirstName.appendChild(doc.createTextNode("Omotosho"));
			Cid.appendChild(FirstName);

			// lastname elements
			Element LastName = doc.createElement("LastName");
			LastName.appendChild(doc.createTextNode("Daniel"));
			Cid.appendChild(LastName);

			//Guests elements
			Element Guests = doc.createElement("Guests");
			Guests.appendChild(doc.createTextNode("3"));
			Cid.appendChild(Guests);

			// StartDate elements
			Element StartDate = doc.createElement("StartDate");
			StartDate.appendChild(doc.createTextNode("200519"));
			Cid.appendChild(StartDate);
			
			// EndDate elements
			Element EndDate = doc.createElement("EndDate");
			EndDate.appendChild(doc.createTextNode("300519"));
			Cid.appendChild(EndDate);
						
			// ApartmentName elements
			Element ApartmentName = doc.createElement("ApartmentName");
			ApartmentName.appendChild(doc.createTextNode("Night"));
			Cid.appendChild(ApartmentName);
			
			// Bedrooms elements
			Element Bedrooms = doc.createElement("Bedrooms");
			Bedrooms.appendChild(doc.createTextNode("2"));
			Cid.appendChild(Bedrooms);
			
			// LivingRoom elements
			Element LivingRoom = doc.createElement("LivingRoom");
			LivingRoom.appendChild(doc.createTextNode("Yes"));
			Cid.appendChild(LivingRoom);
						
			// Bathrooms elements
			Element Bathrooms = doc.createElement("Bathrooms");
			Bathrooms.appendChild(doc.createTextNode("3"));
			Cid.appendChild(Bathrooms);

			// Catering elements
			Element Catering = doc.createElement("Catering");
			Catering.appendChild(doc.createTextNode("Yes"));
			Cid.appendChild(Catering);
						
			// Price elements
			Element Price = doc.createElement("Price");
			Price.appendChild(doc.createTextNode("300"));
			Cid.appendChild(Price);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("H:\\eclipse\\workspace\\Week1\\Assignment2_TextBased\\Confirmation.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");
			

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  

		  }
		
	 }
}//end class


			
			
			
			
