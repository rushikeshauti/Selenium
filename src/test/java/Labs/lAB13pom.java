package Labs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class lAB13pom {

		WebDriver driver;
		
		
		By email= By.name("email");
		By pword = By.name("password");
		By loginbutton = By.tagName("button");
		
		public lAB13pom(WebDriver driver2) {
			this.driver = driver2;
		}

		public void enteremail(String email1)
		{
			driver.findElement(email).sendKeys(email1);
		}
		public void enterpassword(String password1)
		{
			driver.findElement(pword).sendKeys(password1);
		}
		
		public void clickonlogin()
		{
			driver.findElement(loginbutton).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

