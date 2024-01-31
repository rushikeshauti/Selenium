package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_orangeHrm {
	WebDriver driver;	

		
		@Given("Start the browser")
		public void start_the_browser() throws IOException, InterruptedException {
		    
		
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
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
ORH_POM obj=new ORH_POM (driver);
Thread.sleep(1000);
obj.enterusername(uname);
obj.enterpassword(pword);
obj.clickonlogin();
driver.quit();
		}
	}
	}
