package SeleniumGrid;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Browserstack {
	 public static final String USERNAME = "hemalathakalliap1";
	  public static final String AUTOMATE_KEY = "C5xVxpY2MMdXGPmsiqiz";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setPlatform(Platform.WINDOWS);
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://www.google.co.in/search?ei=iQvkW4yIAcqRwgOH3ILACQ&q=selenium+grid+tutorial&oq=selenium+grid+&gs_l=psy-ab.3.0.0i67k1l2j0j0i67k1j0j0i67k1j0j0i67k1l3.2350.2350.0.3913.1.1.0.0.0.0.89.89.1.1.0....0...1c.1.64.psy-ab..0.1.89....0.fZwg89nDLEY");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
}
