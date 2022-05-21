import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import myntratestng.myntraraclass;

public class myntra_stepdefination {
	public static WebDriver driver;
	
	@Given("^myntra app$")
	public void myntra_app() 
	{
	System.out.println("open myntra app");   
	}

	
	@Then("^select item size$")
	public void select_item_size() 
	{
	  System.out.println("select item");  
	}

	

	@Then("^add to bag$")
	public void add_to_bag() 
	{
	 System.out.println("item added to mybag");   
	}


	@Then("^check item will add or not$")
	public void check_item_will_add_or_not() 
	{
	 System.out.println("check the added item in mybag");  
	}

	
	@Then("^Closebrowser$")
	public void closebrowser()
	{
	 System.out.println("after test comleted close browser");  
	}

	
}
