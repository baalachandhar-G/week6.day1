package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver Driver;
	
	public String fileName;
	
	    @Parameters({"url","username","password"})
	
		@BeforeMethod
		
		public void precondition(String URL,String Uname,String Pwd) {
			
			WebDriverManager.chromedriver().setup();
			
			Driver= new ChromeDriver();
			
			Driver.get(URL);
			
			Driver.manage().window().maximize();
			
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement Username = Driver.findElement(By.id("username"));
			
			Username.sendKeys(Uname);
			
			Driver.findElement(By.id("password")).sendKeys(Pwd);
			
			Driver.findElement(By.className("decorativeSubmit")).click();
			
		}
		
		@AfterMethod
		
		public void postcondition() {
			
			Driver.close();
			
		}
		
		@DataProvider(name ="getData")
		public String[][] FetchData() throws Exception {
			
			return ReadExcel.Readdata(fileName);
			
			//String[][] data = new String[2][3];
			
			//data[0][0]="TestLeaf";
			//data[0][1]="Baala";
			//data[0][2]="Chandhar";
			
			//data[1][0]="QEagle";
			//data[1][1]="Prem";
			//data[1][2]="Nath";

		}
	}


