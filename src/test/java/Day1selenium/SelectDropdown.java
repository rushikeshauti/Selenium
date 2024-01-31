package Day1selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		
		driver.findElement(By.linkText("Desktops")).click();
		
		driver.findElement(By.linkText("Mac (1)")).click();
	
		Select ele=new Select (driver.findElement(By.xpath("//select[@id='input-sort']")));
		
		List<WebElement> l1=ele.getOptions();
		
		for(int i=0; i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}
		
		
	//	Select sl=new Select (driver.findElement(By.xpath("//select[@id='input-sort']")));
	//	Thread.sleep(1000);
	//	sl.selectByIndex(3);
	//	sl.selectByVisibleText("Name (A - Z)");
		
		
		
		
		
		
	
	}
}
