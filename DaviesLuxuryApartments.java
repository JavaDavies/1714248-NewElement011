/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Task: Case Study Scenario (Design, Implementation, Testing)           																						
 x Description: Demonstrate an in-depth understanding of how object-oriented concepts are applied in the design and 
 X development of software products using a current object-oriented programming language.
 x Date:  24/5/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
import javax.swing.JOptionPane; 
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane; 
public class DaviesLuxuryApartments 
{
	
	private static int loginOption = -1;
	private static int counterLoginOption = 0;
	private static int clientMenuOption = -1;
	private static Client aClient;
	private static String theClientName = "";
	private static String theClientPassword = "";
	private static ClientLogin aClientLogin  = new ClientLogin();
	public static String FirstName;
	public static String LastName;
	public static String ApartmentOption;
	public static String Email;
		
	private static int managerMenuOption = -1;
	private static Manager aManager;
	private static String theManagerName = "";
	private static String theManagerPassword = "";
	private static ManagerLogin aManagerLogin  = new ManagerLogin();
	
	private static JFrame aFrame = new JFrame();
	
	private static XMLApartmentReader anXMLAptReader;
	public static XMLBookingReader anXMLBkgReader;
	public static XMLConfirmationWriter anXMLCmtWriter;
	//-------------------------------------------------------------------------------------------------//
	
	
	public static void displayClientMenu() //Client login option
	{
		System.out.println("-------------------------------------");
		System.out.println("          CLIENT OPTIONS             ");
		System.out.println("-------------------------------------");
		System.out.println("         1. Do a Booking             ");
		System.out.println("         2. Manage your Booking      ");
		System.out.println("         3. EXIT                     ");
		System.out.println("-------------------------------------");
	}
	
	public static void displayManagerMenu()// Manager login option
	{
		System.out.println("-------------------------------------");
		System.out.println("          MANAGER OPTIONS             ");
		System.out.println("-------------------------------------");
		System.out.println("         1. View ALL the Bookings    ");
		System.out.println("         2. Manage a Booking         ");
		System.out.println("         3. EXIT                     ");
		System.out.println("-------------------------------------");
	}
	
	@SuppressWarnings("static-access")
	public static <anXMLCmtWriter> void main(String[] args)
	{
		//Hotel Home Page
		System.out.println("*************************************");
		System.out.println("    Davies Luxury Apartments        *");
		System.out.println("*************************************");
		
		System.out.println("-------------------------------------");
		System.out.println("          LOGIN                      ");
		System.out.println("-------------------------------------");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter 1 for Client Login or 2 for Manager Login: ");
		loginOption = Integer.parseInt(input.next());
		
		while (counterLoginOption<3)
		{
			// counter controlled loop to set the max number of tries
			if (loginOption==1)
			{
				System.out.println("Please, enter a Client username: ");
				aClientLogin.setUserName(input.next());
				theClientName = aClientLogin.getUserName();
				//debugging output
				//System.out.println(theClientName);
				
				System.out.println("Please, enter a Client password: ");
				aClientLogin.setPassword(input.next());
				theClientPassword = aClientLogin.getPassword();
				//debugging output
				//System.out.println(theClientPassword);
				
				aClient = new Client();
				
				// create a counter controlled loop for setting the max login times
				aClient.doLogin(theClientName, theClientPassword);		
				counterLoginOption = 3;
				
			if (aClient.getClientLogged()==true) //If the condition is true then execute the functions
			{
				displayClientMenu();
				System.out.println("Please, enter a Client Menu Option: ");
				clientMenuOption = Integer.parseInt(input.next());
							
			if (clientMenuOption==3)// if the client enter option 3 then they are logged out and start new option.
					{
				System.out.println("Eixts, You are logged out: ");
				System.out.println("Enter a client Menu Option: ");
				displayClientMenu();
				clientMenuOption = Integer.parseInt(input.next());
					}
			if (clientMenuOption==1) //First, display all the apartment then allow client do the booking
					{
						anXMLAptReader = new XMLApartmentReader();
						System.out.println("Booking Name"); //Ask user to input booking name and the apartment name via a dialog box and display the booking name
						FirstName = JOptionPane.showInputDialog("Please Enter FirstName to start Booking:");
						LastName = JOptionPane.showInputDialog("LastName of Client:");
						ApartmentOption = JOptionPane.showInputDialog("Please Enter Your Prefere Apartment name (e.g Lion or Tigar) :");
						Email = JOptionPane.showInputDialog("Enter Your email address:");
						JOptionPane.showMessageDialog(null, "Thanks for your booking:Payment will be paid on arrival: A comfirmation email will be send to you soon");
						JOptionPane.showMessageDialog(null, "Apartment Name chosen is: " +ApartmentOption);
						
					}
			}
			}
			else if (loginOption==2)
				{ //If option are true, allow the Manager to login
					
				System.out.println("Please, enter a Manager username: ");
					aManagerLogin.setUserName(input.next());
					theManagerName = aManagerLogin.getUserName();
				
					System.out.println("Please, enter a Manager password: ");
					aManagerLogin.setPassword(input.next());
					theManagerPassword = aManagerLogin.getPassword(); //Verifying Manager Password
				
					aManager = new Manager();
				
					aManager.doLogin(theManagerName, theManagerPassword);	
				
					counterLoginOption = 3;
				}
				
				if (aManager.getManagerLogged()==true) //If manager details are correct allow option menu
				{
					displayManagerMenu();
				
					System.out.println("Please, enter a Manager Menu Option: ");
					managerMenuOption = Integer.parseInt(input.next());
				
					
				if (managerMenuOption==1)//Allow manager to view all booking
					{
						anXMLBkgReader = new XMLBookingReader();
						
				}
				if (managerMenuOption==2){
					anXMLCmtWriter = new XMLConfirmationWriter();
				}
				else if (managerMenuOption==3){
					System.out.println("Eixts, You are logged out: ");// If the manager option is 3 then log manager out and return manager to the menu option
					displayManagerMenu();
					System.out.println("Enter a Manager Menu Option: ");
					managerMenuOption = Integer.parseInt(input.next());
					anXMLBkgReader = new XMLBookingReader();
					
				}
			   else
			   {
				JOptionPane.showMessageDialog(aFrame, "Invalid login option!");		//display an error message when login details are wrong		
				counterLoginOption = counterLoginOption+1;
				loginOption = Integer.parseInt(JOptionPane.showInputDialog(aFrame, "Please, enter 1 for Client Login or 2 for Manager Login: "));
				
			   }
		}//end while
		
			}
			}//end while
			
			
			}
			
