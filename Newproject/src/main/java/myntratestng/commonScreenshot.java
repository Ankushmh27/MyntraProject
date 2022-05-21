package myntratestng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class commonScreenshot 
{    
	public static WebDriver driver;
    public static void Screenshot(WebDriver driver, String dest ) throws IOException
   {
    	
	TakesScreenshot tc =  (TakesScreenshot)  driver;
	
	File source =tc.getScreenshotAs(OutputType.FILE);
	
	//File destination = new File(dest);  
	File destination=new File(dest) ;     
	
	FileUtils.copyFile(source, destination);
	
    }


}
