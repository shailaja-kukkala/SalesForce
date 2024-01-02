package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	
	public  static WebDriver driver ;
	static Wait<WebDriver> wait ;
	
 public	Helper(WebDriver driver)
	{
	 
	 this.driver = driver;
	 
	 wait = new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(30))
			 .pollingEvery(Duration.ofSeconds(6))
			 .ignoring(NoSuchElementException.class);
		
	}
 
 public static WebElement getElementById(String locator)
 {
	 
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	 
 }
 
 public static WebElement getElementByName(String locator)
 {
	 
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
	 
 }
 
 public static WebElement getElementByXpath(String locator)
 {
	 
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	 
 }
 
 public static WebElement getElementByCss(String locator)
 {
	 
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
	 
 }
 
 public static WebElement getElementByClassName(String locator)
 {
	 
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
	 
 }
 
 
 public static String getJsonData(String key) throws FileNotFoundException, IOException, ParseException
 {
	 Object  o = new JSONParser().parse(new FileReader(System.getProperty("user.dir")+"\\properties\\Data.json"));
	 
	 JSONObject js = (JSONObject) o;
	 
	 String value = (String) js.get(key);
	 
	 return value;
 }
 }
