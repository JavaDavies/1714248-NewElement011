/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
public class ManagerLogin extends Login
{
	private static String managerName = "";
	private static String managerPassword = "";
	
	public String getUserName()
	{
		return managerName;
	}
	
	public void setUserName(String aManagerName)//declares manager name
	{
		managerName = aManagerName;
	}
	
	public String getPassword()
	{
		return managerPassword;
	}
	
	public void setPassword(String aManagerPassword)// declares manager password
	{
		managerPassword = aManagerPassword;
	}

}//end managerlogin
