package Day3selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC002Fac_orangeHrm {


		public static void main(String[] args) {
			 WebDriverManager.chromedriver().setup();
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	
	Pagefactory_Orhm obj=PageFactory.initElements(driver,Pagefactory_Orhm.class);
	obj.enterusername("Admin");
	obj.enterpassword("admin123");
obj.clickonlogin();


	//driver.findElement(By.name("username")).sendKeys("Admin");
	//driver.findElement(By.name("password")).sendKeys("admin123");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();




		}

	}

