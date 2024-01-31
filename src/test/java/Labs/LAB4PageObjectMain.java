package Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB4PageObjectMain {		

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			
			
			LAB4POM obj = new LAB4POM(driver);
			obj.clickondesktop();
			obj.clickonmac();
			obj.HandleDropdown();
			obj.Mainsearchbutton();
			obj.searchEntervalue("Mobile");
			Thread.sleep(2000);
			obj.childsearchicon();
			obj.clickonsearchbutton();
			
System.out.print("Test case working");
	}

}
