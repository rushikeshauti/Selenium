package TestNCuc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab8Cucumber_Lab3 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
		driver.get("http://demo.opencart.com");
  }

  @AfterMethod
  public void afterMethod() {
	  
	// System.out.println("This is the after method");
	//  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Validate opencart is working properly.");
  }
  
  @Test
  public void Test() throws InterruptedException {
	    
	LAB3POM obj=new LAB3POM (driver);
		
		obj.clickOnDeskstops();
		obj.clickOnMac();
	obj.handledropdown();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		obj.clickonaddcart();
	   
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" opencart is working properly.");
	   driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
