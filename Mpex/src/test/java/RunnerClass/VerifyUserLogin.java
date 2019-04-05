package RunnerClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseClass.TestBase;
import BaseClass.TestUtil;

public class VerifyUserLogin extends TestBase{
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setUp1(String browser,String url) throws InterruptedException {
	parameter(browser,url);
	}

	@Test
	@Parameters({"emailid","password"})
	public void VerifyUserLogin(String emailid,String password) throws InterruptedException {
		Thread.sleep(2000);
		userlogin(emailid,password);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
