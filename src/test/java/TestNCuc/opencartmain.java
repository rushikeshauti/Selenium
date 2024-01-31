package TestNCuc;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class opencartmain {

		public static void main(String[] args) throws InterruptedException, IOException, SAXException, ParserConfigurationException, DOMException {

			File xmlfile = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Labs\\LAB13file.xml");
	        DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
	        DocumentBuilder dbuilder=DBFactory.newDocumentBuilder();
	        Document doc = dbuilder.parse(xmlfile);
	        NodeList n1 =doc.getChildNodes();
	        Node n =n1.item(0);
	        Element ele=(Element)n;
	        String url=ele.getElementsByTagName("url").item(0).getTextContent();
	        String email=ele.getElementsByTagName("email").item(0).getTextContent();
	        String pword=ele.getElementsByTagName("password").item(0).getTextContent();
				
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			System.out.println(driver.getTitle());
			driver.navigate().refresh();
			driver.navigate().refresh();
	        
			
			
	        opencartpom obj = new opencartpom(driver);
	    	driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			obj.enteremail(email);
			
			
			
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter("reportopencart.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the email of opencart");
			if(obj.verifymail(email))
			{
				test.pass("opencart email is displyed");
			}
			else
			{
				Thread.sleep(3000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile=new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\Emailopencart.png");
				FileUtils.copyFile(sfile, dfile);
				String path=dfile.getAbsolutePath();
				test.fail("email is not displayed",
						MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build()	
			);
			
			test.addScreenCaptureFromPath(path);
		}
			extent.flush();
			
			
			obj.enterpassword(pword);
			obj.clickonlogin();
		//	driver.quit();

		}

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

