package orangehrmtestng;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class orangehrmtest extends orangehrmclass {
	
	@BeforeSuite
	public void openapp() throws IOException
	{
	   openbrowserwithapp() ;
	   System.out.println("I am open app");

	}

	@BeforeMethod
	public void Login() throws IOException
	{
		login();	
		System.out.println("enter user name and password and click on login btn");
	}

	@Test(priority  = 1)
	public  void homepage() throws IOException
	{
		adminpage();
		System.out.println("I am going to admin page and add user(fill form)");

	}
	@Test(priority  = 2)
	public void Rocord_delete() throws IOException {
		delete_record();
		System.out.println("  I am deleted one record from user");
	}

	@AfterMethod
	public  void Logout() throws IOException 
	{
		Logoutpage();
		System.out.println("I am logout from orangehrm");

	}
	@AfterSuite
	public void Browserclose()
	{
		closebrowser();
		System.out.println("I am closing browser");
	}

}
