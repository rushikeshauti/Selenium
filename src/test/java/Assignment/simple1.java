package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simple1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	simple1POM obj = new simple1POM(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
//	obj.Enterusername();
//	obj.Enterlastname();
	//obj.enteremail();
//	driver.findElement(By.xpath(" //input[@id='password'] ")).sendKeys("ketan1@gmail");
//	driver.findElement(By.xpath(" //input[@id='password-confirmation'] ")).sendKeys("ketan1@gmail");

obj.enterpword("password");
obj.confirmpass("password1");
obj.clickoncreatebtn();
driver.findElement(By.linkText("Sign In")).click();
Thread.sleep(2000);
obj.signinusername();
obj.signinuserpassword();
driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();

obj.Menmousehover();
obj.bottomwaremouseover();
Thread.sleep(1000);
obj.clickonyogapant();
Thread.sleep(1000);
obj.verifypantsize();
obj.verifypantcolour();
Thread.sleep(1000);
obj.clickonaddcartbuttom();
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,500)");
obj.clickonaddtocartlink();
obj.clickoncheckout();
//		driver.findElement(By.xpath(" //input[@id='firstname']  ")).sendKeys("ketan");
//		driver.findElement(By.xpath(" //input[@id='lastname']  ")).sendKeys("gadge");
//		driver.findElement(By.xpath(" //input[@id='email_address'] ")).sendKeys("ketan123@gmail.com");
//		driver.findElement(By.xpath(" //input[@id='password'] ")).sendKeys("ketan123@gmail");
//		driver.findElement(By.xpath(" //input[@id='password-confirmation'] ")).sendKeys("ketan123@gmail");
//		driver.findElement(By.xpath(" //button[@title='Create an Account'] ")).click();
		
		
//		WebElement target = driver.findElement(By.xpath("//span[contains(text(),\"Men\")]"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(target).perform();
//		
//		WebElement tar = driver.findElement(By.linkText("Bottoms"));
//		Actions ac1 = new Actions(driver);
//		ac1.moveToElement(tar).perform();
		
		
		//driver.findElement(By.linkText("Bottoms"));
		//span[contains(text(),"Men")]
//		driver.findElement(By.linkText("Pants")).click();
//		
//		driver.findElement(By.linkText("Orestes Yoga Pant")).click();
//		
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//     js.executeScript("window.scrollBy(0,500)");
//		
//     Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@option-label='34']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"] ")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='maincontent']/div[1]/div[2]/div/div/div/a")).click();
//		//	driver.findElement(By.linkText("shopping cart")).click();
//			
//		  js.executeScript("window.scrollBy(0,500)");
//	driver.findElement(By.xpath("//span[contains(text(),\"Proceed to Checkout\")]")).click();
//			Thread.sleep(3000);
	//	driver.findElement(By.linkText("Proceed to Checkout")).click();
		
		
		
	}

}
