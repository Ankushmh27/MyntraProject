package myntratestng;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myntratest extends myntraraclass {


	@BeforeSuite
	public  void browser_open()
	{
		openapp();
	    System.out.println("I am open myntra app in browser");
	}
	
	@BeforeTest
	public void select_Item() throws IOException
	{
		selct_itom();
		System.out.println("I am select Item for men(t_shirt)");
	}
	
	@Test(priority = 1 )
	public void add_to_bag() throws IOException
	{
		add_to_mybag();
		System.out.println(" item adding to myBag");
	}
	@Test(priority = 2 )
	public  void Checking_item() throws IOException
	{
		check_mybag();
		System.out.println("check the item add or not in mybag");
	}
	@AfterSuite
	public void Browserclose()
	{
		browserclose();
		System.out.println("I am closing browser");
	}

}
