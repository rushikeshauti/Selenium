package Day2selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebtables {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://letcode.in/table");
WebElement table =driver.findElement(By.id("simpletable"));

List<WebElement> headers= table.findElements(By.tagName("th"));

for(WebElement hearder : headers)
{
	System.out.println(hearder.getText());
}

List<WebElement> allrows=table.findElements(By.tagName("tr"));
System.out.println("rows:"+allrows.size());

/*for(WebElement row : allrows)
{
	List<WebElement> columns=table.findElements(By.tagName("td"));
	System.out.println(columns.get(0).getText());
	
}*/
int size=allrows.size();
for(int i=0;i<size;i++)
{
	List<WebElement> rows=allrows.get(i).findElements(By.tagName("td"));
	
	String text=rows.get(i).getText();
	System.out.println(text);
}
	}

}
