package Day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//control+ shift+ o to save driver dependencies
		driver.get("http://www.google.com/");
	
	System.out.println("Google page title : "+driver.getTitle());
	
 WebElement search = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
 Thread.sleep(2000);
 search.sendKeys("Automation Testing Tools");
 search.submit();
 System.out.print(" New page Title : "+driver.getTitle());
 
driver.navigate().to("https://www.Amazon.com/");
System.out.println(" New page Title : "+driver.getTitle());
Thread.sleep(1000);
driver.navigate().back();
System.out.println(" After backword : "+driver.getTitle());
System.out.println(" After backword url : "+driver.getCurrentUrl());
Thread.sleep(1000);
driver.navigate().forward();
System.out.println(" After forword : "+driver.getTitle());
System.out.println(" After forword url : "+driver.getCurrentUrl());
System.out.println(" After forword url contain pagesource : "+driver.getPageSource().contains("Automation"));
Thread.sleep(1000);
 
 driver.close();
	}

}
