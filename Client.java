/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class Client extends User 
{
	private static String clientName = "";
	private static String clientPassword = "";
	private static boolean clientLogged = false;
	
	public static void doLogin(String aClientName, String aClientPassword)
	{
		clientName = aClientName;
		clientPassword = aClientPassword;
	
		// for this version is now hardcoded the username and password
		// extend to be read from an XML file
		// Result is true if and only argument is not null
		if (clientName.equals("Davies") && clientPassword.equals("1234"))
		{
			System.out.println("Successful Client Login!  ");//Display client successful login if Name and password are correct
			clientLogged = true;
		}
		else
		{
			System.out.println("No access to Client! ");// Login access denied if login requirement are not meet
		}
	}
	
	public static boolean getClientLogged()
	{
		return clientLogged;
	}

}
