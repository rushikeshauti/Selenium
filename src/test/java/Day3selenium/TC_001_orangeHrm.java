package Day3selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_orangeHrm {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
ORH_POM obj=new ORH_POM (driver);
obj.enterusername("Admin");
obj.enterpassword("admin123");
obj.clickonlogin();


//driver.findElement(By.name("username")).sendKeys("Admin");
//driver.findElement(By.name("password")).sendKeys("admin123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();




	}

}
