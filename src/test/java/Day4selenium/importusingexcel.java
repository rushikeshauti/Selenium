package Day4selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class importusingexcel {

	public class importdatausingexcel {

		public void main (String[] args) throws IOException, InterruptedException {
			
		InputStream input1=new FileInputStream("C:\\Users\\rushikesh.auti\\eclipse-workspace\\Seleniumjava\\src\\test\\java\\Day4selenium\\logindata.properties");
			
		Properties prob=new Properties();
		prob.load(input1);
		String url=prob.getProperty("url");
		System.out.println("The URL is : "+url);
		
			
			
			
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
					
				 	driver.get(url);
					
					Thread.sleep(2000);
				WebElement username  =	driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys(uname);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					driver.close();
					
		}
		}
	

	}

}
