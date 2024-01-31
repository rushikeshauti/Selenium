package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_login {

	WebDriver driver;	
	
	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 	
		
	}

	@When("User open the url")
	public void user_open_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("User enter the username and password")
	public void user_enter_the_username_and_password() throws InterruptedException {
		Thread.sleep(1000);
		WebElement username  =	driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(1000);
	  boolean dash= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
	  Thread.sleep(1000);
	  System.out.println("Home page  displayed"+dash);
	  if(dash)
	  {
		  System.out.println("Home page successfully displayed");
	  }else
	  {
		  System.out.println("Home page is not displayed");
	  }
	
	
	}
	
}
