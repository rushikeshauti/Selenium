package Day3selenium;
import java.io.IOException;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;

import io.github.bonigarcia.wdm.WebDriverManager;
public class byusingxmlfile {

				public static void main (String[] args) throws IOException, InterruptedException, ParserConfigurationException, SAXException {		
					
				File xmlfile = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Day3selenium\\logindata.xml");
		DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder=DBFactory.newDocumentBuilder();
		Document doc=dbuilder.parse(xmlfile);
		NodeList n1=doc.getChildNodes();
		Node n=n1.item(0);
		Element ele=(Element)n;
		String url=ele.getElementsByTagName("url").item(0).getTextContent();
		String uname=ele.getElementsByTagName("username").item(0).getTextContent();
		String pword=ele.getElementsByTagName("password").item(0).getTextContent();
				
					WebDriverManager.chromedriver().setup();
							
							WebDriver driver=new ChromeDriver();
							
						 	driver.get(url);
							Thread.sleep(1000);
						WebElement username  =	driver.findElement(By.xpath("//input[@placeholder='Username']"));
						username.sendKeys(uname);
							Thread.sleep(1000);
							driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
							Thread.sleep(1000);
							driver.findElement(By.xpath("//button[@type='submit']")).click();
							driver.close();	
				}
				}



	
	
	
	
	
	
	
	
	

