/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class ClientLogin extends Login
{
	private static String clientName = ""; //Declares the name and password to be able to read client name and password
	private static String clientPassword = "";
	
	public String getUserName()
	{
		return clientName;
	}
	
	public void setUserName(String aClientName)
	{
		clientName = aClientName;
	}
	
	public String getPassword()
	{
		return clientPassword;
	}
	
	public void setPassword(String aClientPassword)
	{
		clientPassword = aClientPassword;
	}
	

}
