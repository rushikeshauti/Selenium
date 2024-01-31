package Labs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab14withTestNG {
	WebDriver driver;
  @SuppressWarnings("resource")
@Test(dataProvider = "data")
  public void Test(String fname, String lname , String email , String pass) throws InterruptedException, IOException {
	  long timestamp=new Date().getTime();
	  System.out.println("Time is :"+timestamp);
	
			driver.findElement(By.linkText("My Account")).click();
			
			WebElement ele= driver.findElement(By.linkText("My Account"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			driver.findElement(By.linkText("Register")).click();
			
			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		    String browserName = cap.getBrowserName().toLowerCase();
		    System.out.println(browserName);
					
			Lab14POM obj = new Lab14POM(driver);
		
			
			String title= driver.getTitle();
			//Assert.assertEquals(title, "Register Account");
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"reportnew33janTestNg.html"); 
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the Title of opencart"+browserName);
			if(title.equals("Register A"))
			{
				test.pass("opencart title is displyed");
			}
			else
			{
				Thread.sleep(3000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile=new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\photo.png");
				FileUtils.copyFile(sfile, dfile);
				String path=dfile.getAbsolutePath();
				test.fail("opencart is not displayed",
						MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build()	
			);
				test.addScreenCaptureFromPath(path);
			}
	//			extent.flush();
			
				
			obj.enterfirstname(fname);
			
			
			
			ExtentTest test1=extent.createTest("Verify the first name of opencart");
			if(obj.verifyfirstname_isdisplayed(fname))
			{
				test1.pass("opencart first name is displyed");
			}
			else
			{
				Thread.sleep(3000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile=new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\photo.png");
				FileUtils.copyFile(sfile, dfile);
				String path=dfile.getAbsolutePath();
				test.fail("opencartfirst name  is not displayed",
						MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build()	
			);
				test1.addScreenCaptureFromPath(path);
			}
			
			// lastname
			obj.enterlastname(lname);
			
			
//			ExtentTest test2=extent.createTest("Verify the last name of opencart");
//			if(obj.verifylastname_isdisplayed(lname))
//			{
//				Thread.sleep(3000);
//				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				File dfile=new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\photo2.png");
//				FileUtils.copyFile(sfile, dfile);
//				String path=dfile.getAbsolutePath();
//				test2.fail("opencartfirst last name  is not displayed",
//						MediaEntityBuilder
//						.createScreenCaptureFromPath(path)
//						.build()	
//						);
//				test1.addScreenCaptureFromPath(path);
//			}
//			else
//			{
//				test2.pass("opencart last name is displyed");
//			
//			}
			ExtentTest test2=extent.createTest("Verify the Last name of opencart");
			if(obj.verifylastname_isdisplayed(lname))
			{
				test2.pass("opencart last name is displyed");
			}
			else
			{
				Thread.sleep(3000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile=new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\photo.png");
				FileUtils.copyFile(sfile, dfile);
				String path=dfile.getAbsolutePath();
				test2.fail("opencart last name  is not displayed",
						MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build()	
			);
				test1.addScreenCaptureFromPath(path);
			}
			
			
			
			
			
			
			
			obj.enteremail(email);
			obj.enterpassword(pass);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			Thread.sleep(3000);
			obj.enterradioButton();
			obj.click();
			obj.submit();
			
			extent.flush();  //save the file
			//driver.close();
		//	driver.quit();
		}
	  @Parameters("Browser")
  @BeforeMethod
  //@Parameters("Browser")
  public void beforeMethod(String browser) throws IOException {
		  
//		  File input1 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Labs\\Lab14.xlsx");
//		  Properties prob=new Properties();
//			prob.load(input1);
	//  WebDriverManager.chromedriver().setup();
	//	 driver = new ChromeDriver();	
	//	driver.get("https://demo.opencart.com/");

		
		 System.out.println("The browser is : "+browser);
		 if(browser.equalsIgnoreCase("chrome")) 
		 {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://demo.opencart.com/");
			 
		 }
//		 else if(browser.equalsIgnoreCase("edge"))
//		 {
//			 WebDriverManager.edgedriver().setup();
//			 driver=new EdgeDriver();
//			 driver.get("https://demo.opencart.com/"); 
//		 }
//		 else if(browser.equalsIgnoreCase("firefox"))
//		 {
//			 WebDriverManager.firefoxdriver().setup();
//			 driver=new FirefoxDriver();
//			 driver.get("https://demo.opencart.com/");		
	//	 }
	  else
		 {
			 System.out.println("Browser is not  not Matching");
		 }
	  
	  }

  
  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] data() throws IOException {
   // return new Object[][] {
    	File f1 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Labs\\Lab14.xlsx");
 		FileInputStream fis = new FileInputStream(f1);
 		XSSFWorkbook workbook = new XSSFWorkbook(fis);
 		XSSFSheet sheet = workbook.getSheetAt(0);
 		
 		int rowcount = sheet.getPhysicalNumberOfRows();
 		System.out.println("Row Count: "+rowcount);
 		
    	String[][] data = new String[2][4];
    	for(int i=0;i<rowcount;i++) {
			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
			data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
			
			String fname = data[i][0];
			String lname = data[i][1];
			String email = data[i][2];
			String pwd = data[i][3];
			
			 System.out.println("First Name: "+fname);
				System.out.println("Last Name: "+lname);
				System.out.println("Email : "+email);
				
    	}
    	 return data;
    	  
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
