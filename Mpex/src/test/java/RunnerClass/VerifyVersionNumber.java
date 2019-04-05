package RunnerClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.TestBase;


public class VerifyVersionNumber extends TestBase{
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setUp1(String browser,String url) throws InterruptedException {
	parameter(browser,url);
	}	
	
	@Test
	@Parameters({"VersionNumber"})
	public void VerifyVersionnumber(String versionnumber) throws InterruptedException {
		VerifyVersionNumber(versionnumber);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
