package AHFWebApp.pro;

import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptErrors {

	public WebDriver driver;
	
	//@BeforeMethod
	public void setup() {
		/*

		 LoggingPreferences logPrefs = new LoggingPreferences();
	        logPrefs.enable(LogType.BROWSER, Level.ALL);
	        capability.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	        System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
	        driver = new ChromeDriver(capability);*/
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
        driver = new ChromeDriver(capability);
	}

	 public void analyzeLog() {
		 
	        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	        for (LogEntry entry : logEntries) {
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	            //do something useful with the data
	        }
	    }
	 
	 @Test
	 public void test() throws Exception
	 {
			setup();
			//driver.get("https://dev.cricketsocial.net/");
			// MyScreenRecorder.startRecording("Landingpage");
		 driver.get("https://ahf365.sharepoint.com/sites/AHFPortal/SitePages/AHFHome.aspx");
		 logincredentials fr = new logincredentials(driver);
			Thread.sleep(1000);
			fr.emailid("spoadmin@aidshealth.org");
			fr.next();
			fr.password("$h@r3Po1nt123");
			Thread.sleep(4000);
			fr.signupbutton();
			fr.confirmation();
		 analyzeLog();
		// MyScreenRecorder.stopRecording();
		 
	 }
}


