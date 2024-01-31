package Day3selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagefactory_Orhm {

	WebDriver driver;
	
	@FindBy(name="username")
	WebElement uname;
	
	
	@FindBy(name="password")
	WebElement pword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	
	public void enterusername(String username1)
	{
		uname.sendKeys(username1);
	}
	public void enterpassword(String password1)
	{
	pword.sendKeys(password1);
	}
	
	public void clickonlogin()
	{
	loginbutton.click();
	}
	
	
	
}
