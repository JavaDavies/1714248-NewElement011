/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class Manager extends User
{
	private static String managerName = "";
	private static String managerPassword = "";
	private static boolean managerLogged = false;
	
	public static void doLogin(String aManagerName, String aManagerPassword)
	{
		managerName = aManagerName;
		managerPassword = aManagerPassword;
	
		// for this version is now hardcoded the username and password
		// TODO- extend to be read from an XML file
		if (managerName.equals("Anu") && managerPassword.equals("4321"))
		{
			System.out.println("Successful Manager Login!  ");
			managerLogged = true;
		}
		else
		{
			System.out.println("No access to Manager! ");
		}
	}
	
	
	public static boolean getManagerLogged()
	{
		return managerLogged;
	}

}//end manager
