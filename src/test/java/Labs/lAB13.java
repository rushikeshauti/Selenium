package Labs;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;
public class lAB13 {

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
			
		
	        
	        lAB13pom obj = new lAB13pom(driver);
	    	driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			obj.enteremail(email);
			obj.enterpassword(pword);
			obj.clickonlogin();
			driver.quit();

		}

	 }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

