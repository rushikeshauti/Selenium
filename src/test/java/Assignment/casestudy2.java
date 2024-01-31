package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
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

public class casestudy2 {
  
	WebDriver driver;
	  @Test    (dataProvider = "data")
	  public void Test(String fname, String lname,String email, String pass, String upass, String loginemail, String loginpass ) throws InterruptedException, IOException {
		  long timestamp =new Date().getTime();
		  System.out.println("The time is: "+timestamp);
			simple1POM obj = new simple1POM(driver);

			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		    String browserName = cap.getBrowserName().toLowerCase();
		    System.out.println(browserName);
			
			
			
			
			 ExtentReports extent=new ExtentReports();
				ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"Assignment2.html");
				extent.attachReporter(spark);
				ExtentTest test=extent.createTest("Verify the Title of simple1");
				String title=driver.getTitle();
				System.out.println("Title: "+title);
			
			//1
				 if(title.equals("Create Customer Account"))
					{
						test.pass("simple1 title is displayed");	
					}
					else
					{
						Thread.sleep(3000);
						File sfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dfile = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\Assignment2title.png");
						FileUtils.copyFile(sfile, dfile);
						String path = dfile.getAbsolutePath();
						test.fail("simple1 title is not displayed : Expected Create New Customer Account"
								,MediaEntityBuilder
								.createScreenCaptureFromPath(path)
								.build()
								);
						
					} 
				 
			//2
				 ExtentTest test1=extent.createTest("Verify the username");
					if(obj.Verifyusername())
					{
						test1.pass("simple1 User is displayed");
						
					}
					else
					{
						Thread.sleep(3000);
						File sfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dfile1 = new File("ass2userverify.png");
						FileUtils.copyFile(sfile1, dfile1);
						String path1 = dfile1.getAbsolutePath();
						test1.fail("Username is not displayed"
								,MediaEntityBuilder
								.createScreenCaptureFromPath(path1)
								.build());
					}
			//3
					ExtentTest test2=extent.createTest("Verify the lastname");
					if(obj.verifylastname())
					{
						test2.pass("lastname is displayed");
						
					}
					else
					{
						Thread.sleep(3000);
						File sfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dfile2 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Assignment2lastnameverify.png");
						FileUtils.copyFile(sfile2, dfile2);
						String path2 = dfile2.getAbsolutePath();
						test2.fail("lastname is not displayed"
								,MediaEntityBuilder
								.createScreenCaptureFromPath(path2)
								.build());
					}
					
					
					ExtentTest test3=extent.createTest("Verify the logout and registration");
					if(obj.verifyregistration())
					{
						test2.pass("registration is working properly & it displayed");
						
					}
					else
					{
						Thread.sleep(3000);
						File sfile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dfile3 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\ass2registrationverify.png");
						FileUtils.copyFile(sfile3, dfile3);
						String path3 = dfile3.getAbsolutePath();
						test3.fail("registration is not working properly displayed."
								,MediaEntityBuilder
								.createScreenCaptureFromPath(path3)
								.build());
					}
					
					
					
				JavascriptExecutor js=(JavascriptExecutor)driver;
		obj.Enterusername(fname);
		obj.Enterlastname(lname);
		obj.enteremail(email);
	Thread.sleep(1000);
	obj.enterpword(pass);
	obj.confirmpass(upass);
	obj.clickoncreatebtn();
	driver.findElement(By.linkText("Sign In")).click();
	obj.signinusername(loginemail);
	obj.signinuserpassword(loginpass);
  driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
  obj.Menmousehover();
  obj.bottomwaremouseover();
  Thread.sleep(1000);
  obj.clickonyogapant();
  Thread.sleep(1000);
  obj.verifypantsize();
  obj.verifypantcolour();
  Thread.sleep(1000);
  obj.clickonaddcartbuttom();
  Thread.sleep(3000);
  js.executeScript("window.scrollBy(0,500)");
  obj.clickonaddtocartlink();
  obj.clickoncheckout();
	
	

	extent.flush();
		  
		 	  
	  }
		  
	  @Parameters("Browser")
	  @BeforeMethod
	  public void beforeMethod(String browser) {
		//  WebDriverManager.chromedriver().setup();
		//	 driver=new ChromeDriver();
		//	driver.manage().window().maximize();
		//	driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	
		  System.out.println("The browser is : "+browser);
			 if(browser.equalsIgnoreCase("chrome")) 
			 {
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
				 driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
				 
			 }
			 else if(browser.equalsIgnoreCase("edge"))
			 {
				 WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
				 driver.get("https://magento.softwaretestingboard.com/customer/account/create/"); 
			 }
			 else if(browser.equalsIgnoreCase("firefox"))
			 {
				 WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				 driver.get("https://magento.softwaretestingboard.com/customer/account/create/");		
			 }
		  else
			 {
				 System.out.println("Browser is not  not Matching");
			 }
		  
		  }
	  
	  
	  
	  
	 

	  @AfterMethod
	  public void afterMethod() {
		 driver.quit();
	  }


	  @DataProvider
	  public Object[][] data() throws Exception {
		  File f1 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Assignment\\casestudy2data.xlsx");
	      FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[2][7];
			
			for(int i=0;i<rowCount;i++) {
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
				data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
				data[i][4]=sheet.getRow(i).getCell(4).getStringCellValue();
				data[i][5]=sheet.getRow(i).getCell(5).getStringCellValue();
				data[i][6]=sheet.getRow(i).getCell(6).getStringCellValue();
				String fname = data[i][0];
				String lname = data[i][1];
				String email = data[i][2];
				String pass = data[i][3];
				String upass = data[i][4];
				String loginemail = data[i][5];
				String loginpass = data[i][6];
				System.out.println("Firstname: "+fname);
				System.out.println("Lastname: "+lname);
				System.out.println("Email: "+email);
				System.out.println("Password: "+pass);	
				System.out.println("Confirm Password: "+upass);
				System.out.println("Login Email: "+loginemail);	
				System.out.println("Login password: "+loginpass);
			}
			return data;
	  }
	  @BeforeClass
	  public void beforeclass() {
//		  WebDriverManager.chromedriver().setup();
//			
//			 driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
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