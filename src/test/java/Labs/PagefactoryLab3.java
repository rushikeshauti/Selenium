package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PagefactoryLab3 {

	WebDriver driver1;
	
	@FindBy(linkText="Desktops")
	WebElement Desk;
	
	@FindBy(linkText="Mac (1)")
	WebElement Mac11;
	
	@FindBy(xpath="//select[@id='input-sort']")
	WebElement drp1;
	
	@FindBy(xpath="//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]")
	WebElement addcart;
	
	
	public void clickondesktops()
	{
		Actions op= new Actions(driver1);
		op.moveToElement(Desk).perform();
	}
	public void clickonmac()
	{
	Mac11.click();
	}
	public void clickondropdown() throws InterruptedException
	{
		Select drop=new Select(drp1);
		Thread.sleep(1000);
		drop.selectByIndex(1);
	}
	
	public void clickonaddcart()
	{
	addcart.click();
	}
	
}
