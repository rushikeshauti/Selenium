package Day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.opencart.com/");
		
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		
driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("rahul@123.gmail.com");//.sendkeys("rahul@123.gmail.com");

driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();


	}

}
