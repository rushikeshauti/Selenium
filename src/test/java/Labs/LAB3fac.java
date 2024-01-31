package Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Day3selenium.Pagefactory_Orhm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB3fac {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://demo.opencart.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


PagefactoryLab3 obj=PageFactory.initElements(driver,PagefactoryLab3.class);

obj.clickondesktops();
obj.clickonmac();
obj.clickondropdown();
obj.clickonaddcart();
	}

}
