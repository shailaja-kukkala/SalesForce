package EndtoEndFlow;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends SetUp{
	
	LoginProcess lp ;
	
	@Test
	public void LoginValidation() throws FileNotFoundException, IOException, ParseException
	{
		
		lp = new LoginProcess(driver);
		
		lp.LoginWithValidCredentials();
		
	}

}
