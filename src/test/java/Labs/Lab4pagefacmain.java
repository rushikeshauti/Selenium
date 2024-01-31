package Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4pagefacmain {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		
		Lab4Pagefactory obj = PageFactory.initElements(driver, Lab4Pagefactory.class);
			obj.desktop();
			obj.mac();
			obj.sort(1);
			obj.search();
			obj.search2("Mobile");
			obj.tick();
			obj.searchbutton();
			

	}

}
