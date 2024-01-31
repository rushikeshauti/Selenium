package Day3selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class importdatausingexcel {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	File f1 = new File("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Day3selenium\\inputdata.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	
	System.out.println("Row count"+rowcount);
	String [][] data=new String[3][2];
	
	
	for(int i=0;i<rowcount;i++)
	{
		data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	String uname=data[i][0];
	String pword=data[i][1];
	System.out.println("username : "+uname);
	
	System.out.println("password : "+pword);
		
		
		WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
			 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(1000);
			WebElement username  =	driver.findElement(By.xpath("//input[@placeholder='Username']"));
			username.sendKeys(uname);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}
	}

}
