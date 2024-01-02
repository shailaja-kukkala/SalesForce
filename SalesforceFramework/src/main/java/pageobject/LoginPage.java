package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper {
	
	public WebElement element = null;
	public final static String username = "username";
	public final static String password = "pw";
	public final static String login = "Login";

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public  WebElement UserName()
	{
		
		element = getElementByName(username);
		
		return element;
		
	}
	
	public  WebElement Password()
	{
		
		element = getElementByName(password);
		
		return element;
		
	}
	
	public  WebElement SignIn()
	{
		
		element = getElementByName(login);
		
		return element;
		
	}
	
	

}
