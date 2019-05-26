/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class Login 
{
	private static String name = "";
	private static String password = "";
	
	public String getUserName()
	{
		return name;
	}
	
	public void setUserName(String aUserName)//declares name
	{
		name = aUserName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String aPassword)//declare password
	{
		password = aPassword;
	}
}//end login
