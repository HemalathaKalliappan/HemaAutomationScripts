package RunnerClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Modulecheck.VerifyModulesLeftNavigations;
import Modulecheck.VerifySystemParameters;

public class VerifyLeftNavigationValues extends VerifyModulesLeftNavigations  {
	VerifyModulesLeftNavigations LeftNavigations;
	
	@BeforeMethod
	@Parameters({"browser","url","emailid","password"})
	public void setUp1(String browser,String url,String emailid,String password) throws InterruptedException {
	parameter(browser,url);
	Thread.sleep(2000);
	userlogin(emailid,password);
	}
	

	@Test(priority=1)
	public void VerifyLeftNavigationModuleValues() throws InterruptedException
	{
		LeftNavigations = new VerifyModulesLeftNavigations();
		LeftNavigations.Language();
		System.out.println("--------------Favorites-----------");
		LeftNavigations.favorites();	
		Thread.sleep(5000);
		LeftNavigations.VerifyLeftNavigationValues();
		System.out.println("--------------process-----------");
		LeftNavigations.Process();
		Thread.sleep(5000);
		LeftNavigations.VerifyLeftNavigationValues();
		System.out.println("--------------Setup-----------");
		LeftNavigations.Setup();
		Thread.sleep(5000);
		LeftNavigations.VerifyLeftNavigationValues();
		System.out.println("--------------Admin-----------");
		LeftNavigations.Admin();
		Thread.sleep(5000);
		LeftNavigations.VerifyLeftNavigationValues();
	}
	
	@AfterMethod
	public void teardown() {
	driver.quit();
	}
	
	
}
