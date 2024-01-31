package TestNCuc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LAB4POM {

	WebDriver driver;
	By Desk = By.linkText("Desktops");
	By mac = By.linkText("Mac (1)");
	By Drop = By.xpath("//*[@id=\"input-sort\"]");
	By Mainsearch = By.xpath("//*[@id=\"search\"]/button");
	By childsearch = By.xpath("//*[@id=\"input-search\"]");
	By searchicon = By.xpath("//*[@id=\"input-description\"]");
	By searchbutton = By.xpath("//*[@id=\"button-search\"]");
	
	public LAB4POM(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void clickondesktop() throws Exception {
		WebElement ele = driver.findElement(Desk);
	    Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void clickonmac() {
		driver.findElement(mac).click();
	}
	
	public void HandleDropdown() throws Exception {
		driver.findElement(Drop).click();
		Select sort = new Select(driver.findElement(Drop));
		Thread.sleep(3000);
		sort.selectByIndex(1);
	}
	
	public void Mainsearchbutton() {
		driver.findElement(Mainsearch).click();
	}
	
	public void searchEntervalue(String text) {
		driver.findElement(childsearch).sendKeys(text);
	}
	
	public void childsearchicon() {
		driver.findElement(searchicon).click();
	}
	
	public void clickonsearchbutton() {
		driver.findElement(searchbutton).click();
	}
}
	
