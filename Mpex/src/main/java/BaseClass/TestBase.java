package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	//public static WebDriverListener eventListener;
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\eclipse workspace\\Mpex\\src\\main\\java\\Configfile\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void parameter() throws InterruptedException {
		String browser = prop.getProperty("browser");
		
		 if (browser.equalsIgnoreCase("firefox"))
	        {
	        driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("chrome"))
	        {
	       System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	       driver = new ChromeDriver();
	        }
	        else if (browser.equalsIgnoreCase("ie"))
	        {
	        System.setProperty("webdriver.ie.driver", "");
	        driver = new InternetExplorerDriver();
	        }
		 
	/*	 e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebDriverListener();
			e_driver.register(eventListener);
			driver = e_driver;*/
			
		 
		 
		 
	driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
	
   driver.get(prop.getProperty("url"));

   driver.findElement(By.xpath("//*[@id=\"txtUserName_I\"]")).sendKeys(prop.getProperty("username"));
   driver.findElement(By.xpath("//*[@id=\"txtPassword_I\"]")).sendKeys(prop.getProperty("password"));
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	} 
	

}
