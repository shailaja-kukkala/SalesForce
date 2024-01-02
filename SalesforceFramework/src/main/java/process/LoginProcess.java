package process;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper{

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	LoginPage lp = new LoginPage(driver);
	String Username ;
	String Password;
	
	public void LoginWithValidCredentials() throws FileNotFoundException, IOException, ParseException
	{
		
		Username = getJsonData("username");
		Password = getJsonData("Password");
			
		lp.UserName().sendKeys(Username);
		lp.Password().sendKeys(Password);
		lp.SignIn().click();
	}
	
	public void LoginWithInValidCredentials()
	{
		lp.UserName().sendKeys("shailajssa.kukkala-gs9t@force.com");
		lp.Password().sendKeys("Secssure@889");
		lp.SignIn().click();
	}
	
	
	

}
