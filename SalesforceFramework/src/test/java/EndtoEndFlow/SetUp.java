package EndtoEndFlow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	
	Properties prop = new Properties();
	
	WebDriver driver;
	
	
	@BeforeClass
	public void Initalization() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");
		
		prop.load(fis);
		
		 driver = new ChromeDriver();
		 driver.get(prop.getProperty("QA_Url"));		
		
	}
	
	@AfterClass
	public void CleanUp()
	{
		//driver.quit();
	}

}
