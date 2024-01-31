package Day1selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class lab5registration {



			public static void main(String[] args) throws InterruptedException {
				
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				
				driver.manage().window().maximize();
				driver.get("http://demo.opencart.com/");
				driver.findElement(By.linkText("My Account")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Register")).click();
				
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shubham");
				
				driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("jadhav");
				
				driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("shubham123@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Shubham@123");
		
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				
				driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
			
				driver.findElement(By.xpath("//input[@name='agree']")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
			//	driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(1000);
				System.out.println(" page title : "+driver.getTitle());
				
				System.out.println(" Successfully registered ");
			
	}

}
