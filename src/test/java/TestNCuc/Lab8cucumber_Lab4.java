package TestNCuc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab8cucumber_Lab4 {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void Test() throws Exception {
		LAB4POM obj = new LAB4POM(driver);
		obj.clickondesktop();
		obj.clickonmac();
		obj.HandleDropdown();
		obj.Mainsearchbutton();
		obj.searchEntervalue("Mobile");
		Thread.sleep(2000);
		obj.childsearchicon();
		obj.clickonsearchbutton();	
System.out.print("Test case working");	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
