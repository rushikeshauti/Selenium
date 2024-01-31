package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabDemo6 {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://demo.opencart.com/");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath(" //span[contains(text(),\"My Account\" )]")).click();
			driver.findElement(By.linkText("Login")).click();

			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Rahul123");
			
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Rahul@123");
			
			driver.findElement(By.tagName("button")).click();
			
			WebElement ele=driver.findElement(By.linkText("Components"));
			Actions ac = new Actions(driver);
			ac.moveToElement(ele).perform();
			driver.findElement(By.linkText("Monitors (2)")).click();
			
		Select sl=new Select (driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
				Thread.sleep(1000);
				sl.selectByIndex(1);
			//	sl.selectByVisibleText("Name (A - Z)");
				//span[contains(text(),\"Apple Cinema 30"\" )]
			//	Apple Cinema 30"
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,800)");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[2]/button[1]")).click();
				
				Thread.sleep(1000);
				js.executeScript("window.scrollBy(0,500)");
				
				Thread.sleep(1000);
			//	driver.findElement(By.xpath("//a[@id=\"specification-tab\"]")).click();
				
	
				driver.findElement(By.xpath("//input[@name=\"option[218]\"]")).click();
			//	driver.findElement(By.xpath(" //*[@id=\"input-option-value-9\"] ")).click();
				
			
				driver.findElement(By.linkText("Specification")).click();
				
	}

}
