package Day1selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				
				driver.manage().window().maximize();
				driver.get("http://demo.opencart.com/");
				driver.findElement(By.linkText("My Account")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Register")).click();
				
				
		//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shubham");
				
				
				driver.manage().window().maximize();
	
	List<WebElement> l1=	driver.findElements(By.xpath("//input[@class='form-control']"));
	
	System.out.print(l1.size());
	
	
			}
	
}
