package orangehrmtestng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import myntratestng.commonScreenshot;



public class orangehrmclass  extends commonScreenshot{
	/*feature for orangehrm
	 * 1 login
	 * 2 create form
	 * 3 create any row
	 * 4 goto tab
	 * 5 delete any row
	 * 6 logout */
		WebDriver driver;

	public  void openbrowserwithapp() throws IOException
		{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		 //open app
	     driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/loginpage.png");
		}


	public  void login() throws IOException
		{
		//2 enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 // login and go to admin page
		driver.findElement(By.id("btnLogin")).click();
		
		}

	public  void adminpage() throws IOException
		{
		 // 2 create form

		// move to admin
	
		 WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(admin).build().perform();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 // move to user_management
		 WebElement usermanagement=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		 action.moveToElement(usermanagement).build().perform();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 // move to user and click on user
		 WebElement user=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		 action.moveToElement(user).click().build().perform();
		 commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/adminpage.png");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 // click on add
		 WebElement add=driver.findElement(By.xpath("//input[@id='btnAdd']"));
		 add.click();
		 commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/adduser.png"); 
		//For User Role
		 Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		 dropdown.selectByVisibleText("ESS");
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 //For employee Name
		 WebElement employeename=driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
		 employeename.sendKeys("Dominic Chase");
		 employeename.click();
		// rb.keyPress(KeyEvent.VK_ENTER);
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		 //For User Name
		 WebElement username=driver.findElement(By.xpath("//input[@id='systemUser_userName']"));
		 username.sendKeys("Ankushmh1");
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //For status
		 Select dropdown1=new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		 dropdown1.selectByVisibleText("Enabled");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //For password
		 WebElement password=driver.findElement(By.xpath("//input[@id='systemUser_password']"));
		 password.sendKeys("Ankush1111@");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //For confirm password
		 WebElement confirmkpassword=driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
		 confirmkpassword.sendKeys("Ankush1111@");
		
		 //save data
		WebElement savebtn = driver.findElement(By.xpath("//input[@id='btnSave']"));
		action.moveToElement(savebtn).build().perform();
		commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/userdatafill.png");
	    savebtn.click();
	   
	    System.out.println("data is add");

	   }

public  void delete_record() throws IOException
	   {
		//return back to admin
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		//select checkbox of user
		driver.findElement(By.xpath("//a[text()='Anthony.Nolan']")).click();
		//driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_18']]")).click();//input[@id='ohrmList_chkSelectRecord_48']
		//WebElement anthony=driver.findElement(By.xpath("//a[text()='Anthony.Nolan']"));
		//anthony.click();
		commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/selectuserdel.png");
		// click on delete btn
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		
		//confirm to deleted
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/deleteuser.png");
	   }
	
	
public  void Logoutpage() throws IOException 
	  {
	    // 2 logout
		//click on welcome
	  driver.findElement(By.id("welcome")).click(); 
      Actions action = new Actions(driver);
   	  WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
	  action.moveToElement(logout).build().perform();
	  commonScreenshot.Screenshot(driver, "../Newproject/sreenshots/orangescreen/logout.png");
	  logout.click();
	  
	
     }

public  void closebrowser()
    {
      driver.close();
      System.out.println("test is comlete");
	}
}
