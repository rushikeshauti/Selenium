package Day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manualtab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		
		System.out.println("verify Account"+driver.findElement(By.linkText("My Account")).isDisplayed());
		
		System.out.println("verify Account : "+	driver.findElement(By.linkText("My Account")));
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys("fati@yahoo.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("welcome");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER);
		
		
		
		act.perform();

	}

}
