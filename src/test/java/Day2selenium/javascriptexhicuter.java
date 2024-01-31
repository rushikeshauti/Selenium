package Day2selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexhicuter {

	public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

		driver.get("http://demo.opencart.com/");
		
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('Hello');");
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	//js.executeScript("window.scrollBy(0,500)");
	
	}
	}
