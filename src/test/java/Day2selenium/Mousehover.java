package Day2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.opencart.com/");

		WebElement ele=driver.findElement(By.linkText("Components"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		
		
		
	}

}
