package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORH_POM {

	WebDriver driver;
	
	By uname=By.name("username");
	
	By pword =By.name("password");
	
	By loginbutton=By.xpath("//button[@type='submit']");
	
	public ORH_POM(WebDriver driver2) {
		this.driver =driver2;
	}

	
	
	public void enterusername(String username1)
	{
		driver.findElement(uname).sendKeys(username1);
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
