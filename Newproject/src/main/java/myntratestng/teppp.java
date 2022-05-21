package myntratestng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class teppp {
	public static WebDriver driver;

public static void main(String[] args) {

		/*go to myntra app
		 * select item -men t-shirt
		 * add to my bag
		 * check atom add to my bag
		 *
		 */

	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();

	 //open app
     driver.get("https://www.myntra.com/");
	 driver.manage().window().maximize();

	// Actions action = new Actions(driver);
//	 //goto profile
//	 WebElement profile=driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']"));
//	 action.moveToElement(profile).build().perform();
//	 action.moveToElement(profile);
//	 //click on login
//	 driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
//	 //enter mobile no
//	 driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("7620013916");
//	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	 //continue to login
//	 driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
//	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 //go to men button
	 //driver.findElement(By.xpath("//a[@data-group='men']"));
	  //go to men
	  Actions action = new Actions(driver);
	  WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
	  action.moveToElement(men).build().perform(); 
	  //go to item
	    WebElement tshirt= driver.findElement(By.xpath("//a[text()='T-Shirts']"));
	    action.moveToElement(tshirt).build().perform();
	    tshirt.click();
	   // click on selected itom
	    driver.findElement(By.xpath("//a[@href=\"tshirts/hrx-by-hrithik-roshan"
	       		+ "/hrx-by-hrithik-roshan-men-yellow-printed-cotton-pure-cotton-t-shirt/1700944/buy\"]")).click();
	
	    
	    
	   //new tab open ,this is handle as
	  ArrayList<String> tab   = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  //choose size of item(t-shirt)
	    WebElement sizeM = driver.findElement(By.xpath("//p[text()='M']"));
	    action.moveToElement(sizeM).build().perform();
	    sizeM.click();   
	  //add to mybag  
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
	 
	    
	    
	 //check the added item in mybag
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
}}
