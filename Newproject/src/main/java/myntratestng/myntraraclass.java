package myntratestng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class myntraraclass extends commonScreenshot{
	public static WebDriver driver;
	
	public  void openapp()
	{
		/*1 go to myntra
		 *2 select item 
		 *3 select size of t_shirt
		 *4 add to my bag
		 *5 check mybag
		 */
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();

	 //open app
     driver.get("https://www.myntra.com/");
	 driver.manage().window().maximize();
	}

	public void selct_itom() throws IOException 
	{
	   //go to men
	   Actions action = new Actions(driver);
	   WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
	   action.moveToElement(men).build().perform(); 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //go to item
	   WebElement tshirt= driver.findElement(By.xpath("//a[text()='T-Shirts']"));
	   action.moveToElement(tshirt).build().perform();
	   
	   tshirt.click();
	   Screenshot(driver, "../Newproject/sreenshots/myntrasceen/item.png");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
       // click on selected itom
	   driver.findElement(By.xpath("//a[@href=\"tshirts/hrx-by-hrithik-roshan"
		+ "/hrx-by-hrithik-roshan-men-yellow-printed-cotton-pure-cotton-t-shirt/1700944/buy\"]")).click();	
	}
       
	public void add_to_mybag() throws IOException
	{     
	    Actions actions=new Actions(driver);
	    //new tab open ,this is handle as
	    ArrayList<String> tab   = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab.get(1));
	    //choose size of item(t-shirt)
	    
	    WebElement sizeM = driver.findElement(By.xpath("//p[text()='M']"));
	    actions.moveToElement(sizeM).build().perform();
	    sizeM.click();

	    //add to mybag  
	   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
	    Screenshot(driver, "../Newproject/sreenshots/myntrasceen/addtobag.png");
	    
	}	
	
    public void check_mybag() throws IOException
	{ 	
        ArrayList<String> tab   = new ArrayList<String>(driver.getWindowHandles());
 	    driver.switchTo().window(tab.get(1)); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //check the added item in mybag
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();	
	    Screenshot(driver, "../Newproject/sreenshots/myntrasceen/check_item.png");
	}
	
	public  void browserclose() 
	{
		 ArrayList<String> tab   = new ArrayList<String>(driver.getWindowHandles());
	 	 driver.switchTo().window(tab.get(1)); 
	     driver.close();
	     driver.switchTo().window(tab.get(0)); 
	     driver.close();
	    
	     System.out.println("test is complete");
	}

}
