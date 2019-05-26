/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class User 
{	// declares name and password
	private static String username = "";
	private static String password = "";
	
	public static void doLogin(String aName, String aPassword)
	{
		username = aName;
		password = aPassword;
		
		// for this version is now hardcoded the username and password
		// TODO- extend to be read from an XML file
		if (username =="Davies" && password == "1234")
		{
			System.out.println("Success!  ");//display login succes if name and password are correct
		}
		else
		{
			System.out.println("No access! ");
		}
	}
	
	public static void viewBooking(String aptname, double price, int start, 
			int end, int maxNumGuests, int numBeds, boolean livingroom, boolean catering, int numBaths)// allows easy reading
	{
		
	}

}//end user

