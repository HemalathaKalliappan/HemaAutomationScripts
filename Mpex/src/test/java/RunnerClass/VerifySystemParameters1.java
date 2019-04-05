package RunnerClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Modulecheck.VerifyModulesLeftNavigations;
import Modulecheck.VerifySystemParameters;

public class VerifySystemParameters1 extends VerifySystemParameters {
	VerifyModulesLeftNavigations LeftNavigations;
	VerifySystemParameters1 defaultvalues;
	
	@BeforeMethod
	@Parameters({"browser","url","emailid","password"})
	public void setUp1(String browser,String url,String emailid,String password) throws InterruptedException {
	parameter(browser,url);
	Thread.sleep(2000);
	userlogin(emailid,password);
	}	
	
	@Test()
	public void VerifySystemParametersValues() throws InterruptedException {
		
		LeftNavigations = new VerifyModulesLeftNavigations();
		defaultvalues = new VerifySystemParameters1();
		LeftNavigations.Language();
		LeftNavigations.Admin();
		Thread.sleep(3000);
		defaultvalues.ClickonSystem();
		Thread.sleep(3000);
		defaultvalues.ClickonSystemParameters();
		Thread.sleep(3000);
		defaultvalues.ClickonScheduling();
		defaultvalues.VerifyScheduleColumnValues();	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
