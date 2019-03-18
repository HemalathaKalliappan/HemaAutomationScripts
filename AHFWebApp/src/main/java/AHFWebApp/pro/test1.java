package AHFWebApp.pro;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
	    WebDriver d1 = new ChromeDriver();
	    /*d1.get("file:///C:/Users/khemalatha/Desktop/test.html");
	    List<WebElement> els = d1.findElements(By.id("myText"));
	    System.out.println(els);
	    for(int i=0;i<=2;i++) {
	    		els.get(i).sendKeys("test");
	    	 
	    }*/
	  
	  
	    
	    d1.get("https://qa.cricketsocial.net/");
	    d1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d1.findElement(By.xpath("/html/body/div[8]/header/div[1]/div/div[3]/nav/div/ul/li[5]/a")).click();
		d1.findElement(By.id("email")).sendKeys("nilakanta@cricketsocial.com");
		d1.findElement(By.id("pwd")).sendKeys(decodestring("QW5kQDEyMzQ="));
		d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();
		d1.get("https://qa.cricketsocial.net/LeaguePoints/6f8a38ee-d2e9-4d57-8e91-da23bc874b29");
		d1.findElement(By.xpath("//*[@class='btn btn-default dropdown-toggle']//*[text()='Select Tournament']")).click();
		d1.findElement(By.xpath("//*[@id=\"listBoxDIv\"]/li[4]/a")).click();
		String parent = d1.getWindowHandle();
		String subwindow = null;
		Set<String> allwindow = d1.getWindowHandles();
		Iterator<String> itr = allwindow.iterator();
		while(itr.hasNext()) {
			subwindow = itr.next();
		}
		d1.switchTo().window(subwindow);
		System.out.println("done");
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("test");;
		List<WebElement> els = d1.findElements(By.name("invid"));
		//d1.findElement(By.linkText("Bargav Test Trophy "));
		
		Iterator<WebElement> i = els.iterator();
		while(i.hasNext()) {
		    WebElement row = i.next();
		   // row.click();
		  //	  System.out.println(row.getText());
		 //  System.out.println(row.getAttribute("value"));
		   
		    Actions actions = new Actions(d1);
		  //  d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    actions.moveToElement(row).click().build().perform();
		    System.out.println("clicked");
		    
		}
	}
		
		
		
		/*System.out.println("elements" +els);
		try{
			///Thread.sleep(5000);
			for (WebElement el : els) {
			
				System.out.println("done" + el);
			//	Thread.sleep(5000);
				
		    if ( !el.equals("Bargav")) {
		    	Thread.sleep(5000);
		    	ClickOn(d1,el,10);
		    	break;
		}
		   
			}
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			//WebElement e1 = d1.findElement(By.xpath("//*[@id=\"popupList\"]/li[1]/input"));
			//ClickOn(d1,e1,5);
			System.out.println(ex);
			}
	//	System.out.println("clicked");
		//d1.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}*/
	static String decodestring(String password) 
	{
		byte[] decoded = Base64.decodeBase64(password);
		return(new String(decoded));
		
	}
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.stalenessOf(element));
		element.click();
	}
	
	}
	
	
			/* String str = "And@1234"; 
			 byte[] encoded = Base64.encodeBase64(str.getBytes());
			 System.out.println("encoded: "+ new String(encoded));
			 
			 byte[] decoded = Base64.decodeBase64(encoded);
			 System.out.println("decoded: "+ new String(decoded));
			*/

	
	
		
			
	


