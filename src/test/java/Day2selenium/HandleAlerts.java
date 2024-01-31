package Day2selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.xpath("//button[@id=\"accept\"] ")).click();

	Alert simplealert= driver.switchTo().alert();
	System.out.print(simplealert.getText());
	Thread.sleep(2000);
	simplealert.accept();

	
	//dismiss confirm alert
	//driver.findElement(By.xpath("//button[@id=\"confirm\"]")).click();
	//Alert confirmalert= driver.switchTo().alert();
	//System.out.print(confirmalert.getText());
	//Thread.sleep(1000);
	//confirmalert.accept();
	
	//prompt alert
	driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
	Alert promptalert= driver.switchTo().alert();
	System.out.print(promptalert.getText());
	
	 promptalert.sendKeys("Rahul jadhav 123456789");
	 promptalert.accept();
	 
	// driver.close();
	
	
	
	}

}
