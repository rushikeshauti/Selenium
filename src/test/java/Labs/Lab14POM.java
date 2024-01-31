package Labs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Lab14POM {
		
		WebDriver driver;
		By uname = By.name("firstname");
		By lname = By.name("lastname");
		By email = By.name("email");
		By pwd = By.name("password");
		
		 By rdobtn = By.id("input-newsletter-yes");
		 By check = By.xpath("//input[@type='checkbox']");
		 By btn = By.xpath("//button[@type='submit']");
		
		

		public Lab14POM(WebDriver driver2) {
			this.driver=driver2;
		}

		//firstname
		public void enterfirstname(String firstname1) {
			driver.findElement(uname).sendKeys(firstname1);
		}
		
		public boolean verifyfirstname_isdisplayed(String firstname1) {
			boolean firstname_isdisplayed = driver.findElement(uname).isDisplayed();
		return firstname_isdisplayed;
		
		}
		
		//lastname
		public void enterlastname(String enterlastname1) {
			driver.findElement(lname).sendKeys(enterlastname1);
		}
		
		public boolean verifylastname_isdisplayed(String enterlastname1) {
			boolean lastname_isdisplayed = driver.findElement(lname).isEnabled();
		return lastname_isdisplayed;
		
		}
		
		
		
		
		public void enteremail(String email1) {
			driver.findElement(email).sendKeys(email1);
		}
		
		public void enterpassword(String password1) {
			driver.findElement(pwd).sendKeys(password1);
		}

		public void enterradioButton() {
			driver.findElement(rdobtn).click();
		}
		
		public void click() {
			driver.findElement(check).click();
		}
		
		public void submit() {
			driver.findElement(btn).click();
		}	
	}

	
	
	
	
	

