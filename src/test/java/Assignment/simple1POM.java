package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class simple1POM {

	
WebDriver driver;
	
	By fname = By.xpath("//input[@id='firstname']");
	By lname = By.xpath("//input[@id='lastname']");
	By email = By.xpath("//input[@id='email_address']");
	By pword = By.xpath(" //input[@id='password']");
	By pword1 = By.xpath(" //input[@id='password-confirmation'] ");
	By createbtn =By.xpath(" //button[@title='Create an Account'] ");
	By regverify=By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div/text()[1]");
	
	By signinuser =By.xpath("//*[@id=\"email\"]");
	By signinuserpass =By.xpath("//*[@id=\"pass\"] ");
	By MousehoverMen = By.xpath("//span[contains(text(),\"Men\")]");
	By Mousehoverbottom= By.linkText("Bottoms");
    By Yogapants=By.linkText("Orestes Yoga Pant");
	By pantsize=By.xpath("//div[@option-label='34']");
	By pantcolour=By.xpath("//*[@id=\"option-label-color-93-item-50\"] ");
	By addcartbutton=By.xpath("//*[@id=\"product-addtocart-button\"]/span");
	By addtocartlink=By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div/a");
	By checkout=By.xpath("//span[contains(text(),\"Proceed to Checkout\")]");
	
	
	public simple1POM(WebDriver driver2) {
		this.driver=driver2;
	}
	public  void Enterusername(String fname2)
	{
		driver.findElement(fname)
		.sendKeys(fname2);
	}
	
	public  boolean Verifyusername()
	{
		boolean VN = driver.findElement(fname).isDisplayed();
		return VN;
	}
	
	

	
	
	public void Enterlastname(String lname2)
	{
		driver.findElement(lname).sendKeys(lname2);
	}
	
public boolean verifylastname() {
		
		boolean lnam = driver.findElement(lname).isDisplayed();
		return lnam;
	
	}
	
	
	public void enteremail(String email2) {
		driver.findElement(email).sendKeys(email2);
	}
	
	public void enterpword(String password) {
		driver.findElement(pword).sendKeys(password);
	}
	public void confirmpass(String password1) {
		driver.findElement(pword1).sendKeys(password1);
	}
	
	
	
	public boolean verifypassword(String password2) {
		
		boolean pass = driver.findElement(pword1).isDisplayed();
		return pass;
	
	}
	
	
	
	
	
	

	
	public void clickoncreatebtn() {
		driver.findElement(createbtn).click();
	}
	
public boolean verifyregistration() {
		
		boolean isDashboard_displayed;
		try
		{
			isDashboard_displayed = driver.findElement(regverify).isDisplayed();
		}
		catch(Exception e)
		{
			isDashboard_displayed=false;
			
		}
		return isDashboard_displayed;
	
	}
	
	//sign in
	
	public void signinusername(String loginemail) {
	driver.findElement(signinuser)
	.sendKeys(loginemail);
	}
	
	public void signinuserpassword(String loginpass) {
	driver.findElement(signinuserpass)
.sendKeys(loginpass);
	
	}
	
//public boolean verifylogin() {
//		
//		boolean pass = driver.findElement(pword1).isDisplayed();
//		return pass;
//	
//	}
	
	
	
	
	
	
	
	
	
	public void Menmousehover() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement target = driver.findElement(MousehoverMen);
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();
		
		
		
	}
	
	public void bottomwaremouseover() {
		WebElement tar = driver.findElement( Mousehoverbottom);
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(tar).perform();
	}
	
	public void clickonyogapant() {
		driver.findElement(By.linkText("Pants")).click();
		driver.findElement(Yogapants).click();
	}
	
	public void verifypantsize() {
		driver.findElement(pantsize).click();
	}
	public void verifypantcolour() {
		driver.findElement(pantcolour).click();
	}
	public void clickonaddcartbuttom() {
		
		driver.findElement(addcartbutton).click();
	//	driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div/a")).click();
	}
	public void clickonaddtocartlink() {
		driver.findElement(addtocartlink).click();
	}
	public void clickoncheckout() {
		driver.findElement(checkout).click();
	}
	
	
//	Yogapants=By.linkText("Orestes Yoga Pant");
//	By pantsize=By.xpath("//div[@option-label='34']");
//	By pantcolour=By.xpath("//*[@id=\"option-label-color-93-item-50\"] ");
//	By addcartbutton=By.xpath("//*[@id=\"product-addtocart-button\"]/span");
//	By addtocartlink=By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div/a");
//	By checkout=By.x
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public boolean verifylogin()
//	{boolean isdashboard_displayed;
//		try
//		{
//		 isdashboard_displayed=driver.findElement(dashboard).isDisplayed();
//		}
//		catch(Exception e)
//		{
//			isdashboard_displayed=false;
//		}
//		
//		return isdashboard_displayed;
	
}
	
	

