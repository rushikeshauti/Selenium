package TestNCuc;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTestNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  
	 // System.out.println("This is the test");
 
	  Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		 Thread.sleep(1000);
		boolean dashboard = driver.findElement(By.linkText("Dashboard")).isDisplayed();
		
		assertEquals(dashboard, true);
		System.out.println("dashboared is here : "+dashboard);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the before method");
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the after method");
 // driver.quit();
  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Admin","admin123"},
      new Object[] {"rahul","boo"},
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is the Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is the Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the Aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the AfterSuite");
  }

}
