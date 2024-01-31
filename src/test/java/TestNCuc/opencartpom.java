package TestNCuc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class opencartpom {

		WebDriver driver;
		
		
		By email= By.name("email");
		By pword = By.name("password");
		By loginbutton = By.tagName("button");
		
		public opencartpom(WebDriver driver2) {
			this.driver = driver2;
		}

		public void enteremail(String email1)
		{
			driver.findElement(email)
			.sendKeys(email1);
		}
		
		public boolean verifymail(String email1)
		{
			boolean isdisplyedmail = driver.findElement(email).isDisplayed();
		return isdisplyedmail;
			
		}
		
		
		
		public void enterpassword(String password1)
		{
			driver.findElement(pword).sendKeys(password1);
		}
		
		
		public boolean verifypassword()
		{
			boolean ispassword_displayed=driver.findElement(pword).isDisplayed();
			return ispassword_displayed;
		}
		
		
		
		
		
		
		
		
		public void clickonlogin()
		{
			driver.findElement(loginbutton).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

