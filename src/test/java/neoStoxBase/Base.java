package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxPOMClasses.Utility;
public class Base
{ 
	protected WebDriver driver;

	public void lanuchBrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium folder\\chromedriver\\chromedriver.exe");
	      
	      driver= new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://neostox.com/");
	      
	      //driver.get(Utility.readDataFromPropertyFile("urlqa"));
	   
	      Utility.implicitWait(1000, driver);
	      
	      Reporter.log("Launching lanuchNeoStoxApp",true);
	      
	  }
}
				
		 
	  

