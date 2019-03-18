package AHFWebApp.pro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test implements Serializable {
	private static final boolean String = false;
	//static WebDriver d1;
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
		//ChromeOptions chromeOptions = new ChromeOptions();
	//	chromeOptions.addArguments("window-size=1400,800");

	   //   chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
	     // chromeOptions.addArguments("--headless");

    WebDriver d1 = new ChromeDriver();
	/*System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
	d1= new ChromeDriver();*/
	/*d1.get("https://qa.cricketsocial.net/");
	d1.findElement(By.xpath("/html/body/div[8]/header/div[1]/div/div[3]/nav/div/ul/li[5]/a")).click();
	d1.findElement(By.id("email")).sendKeys("bargav2000@gmail.com");
	d1.findElement(By.id("pwd")).sendKeys("bargav123");
	d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();*/
	/*d1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	d1.get("https://netcenters.sharepoint.com/sites/Devbox/SitePages/NetcenterHome.aspx");
    d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    d1.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("Hexa.corp@net-centers.org");
    d1.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
    d1.findElement(By.xpath("//*[@id=\"i0118\"]")).sendKeys("Hexa*43161");
    Thread.sleep(4000);
    d1.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
    d1.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
    d1.findElement(By.xpath("//*[@id=\"feedback-tab\"]")).click();
    Thread.sleep(2000);
    d1.findElement(By.id("OKbtn")).click();
    d1.switchTo().alert().dismiss();
    d1.findElement(By.xpath("//*[@id=\"zz10_RootAspMenu\"]/li/a")).click(); 	*/
	      d1.get("https://www.google.co.in/");
	      d1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
	      List<WebElement> d2 = d1.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	      System.out.println("total number" + d2.size());
	      for(int i=0;i<d2.size();i++) {
	    	  System.out.println(d2.get(i).getText());
	      }
    
d1.get("https://www.kal.com/en/kal-search-resuts?searchword=&searchphrase=all");


WebDriverWait wait = new WebDriverWait(d1,2000);
Select drpCountry = new Select(d1.findElement(By.xpath("//select[@id='ordering']")));
Thread.sleep(2000);
drpCountry.selectByValue("oldest");
 


/*d1.get("http://ts920057:ele1471@nasspsqld01:43343/applications/sales/scrm/");
d1.navigate().to("http://nasspsqld01:43343/applications/sales/scrm/Lists/SCRMProjects/NewProject.aspx?Source=http%3A%2F%2Fnasspsqld01%3A43343%2Fapplications%2Fsales%2Fscrm%2FLists%2FSCRMProjects%2FAll%2520NBO%2Easpx&RootFolder=");
WebElement slider = d1.findElement(By.xpath("//*[@id=\"part1\"]/table/tbody/tr[3]/td/table[1]/tbody/tr[24]/td[2]/div/div[1]")); // Find the path of the bar
Dimension widthslider = slider.getSize();

int width =widthslider.getWidth();
System.out.println(width);
WebElement slidername = d1.findElement(By.xpath("//*[@id=\"part1\"]/table/tbody/tr[3]/td/table[1]/tbody/tr[24]/td[2]/div/div[1]/span")); 

            Actions slideraction = new Actions(d1);
            slideraction.clickAndHold(slidername);
            slideraction.moveByOffset(width=78,0).build().perform();

    d1.get("http://nasspsqld01:43343/applications/sales/scrm/SalesCallReports/Forms/All%20Call%20Reports.aspx#InplviewHash71d4a0c0-2d91-4533-8eec-c5961417abe2=FolderCTID%3D0x012001");
    System.out.println("2");*/
    
    //  d1.findElement(By.linkText("itemUpdate")).click();
   // d1.findElement(By.id("pagingWPQ2next")).click();
   
    
  /*  for(int i=0;i<=li.size();i++) {
    if(li.contains(d1.findElement(By.linkText("Meffert Visit"))))
    {
    	WebElement obj = d1.findElement(By.linkText("Meffert Visit"));
    	System.out.println("success" +obj);
		obj.click();
		d1.close();
    }
    else
    {
    	d1.findElement(By.id("pagingWPQ2next")).click();
    }
    }
	}
}*/
  /*  List<WebElement> li =  d1.findElements(By.tagName("a"));
    System.out.println(li.size());
    
   for (int i=0;i<li.size();i++) {
		
		try {
						
		WebElement obj = d1.findElement(By.linkText("Com")); // item 
		System.out.println("success" +obj);
		obj.click();
		break;
		}
					
		catch(NoSuchElementException exception){
			System.out.println("clicked "+i);
			d1.findElement(By.id("pagingWPQ2next")).click();// Navigation button
			System.out.println("not found" +i);
			
			}
	}*/
	//WebElement obj = d1.findElement(By.linkText("Daily Task"));
	//obj.click();
}
}
//}
		/*if(obj==null) {
			d1.findElement(By.id("pagingWPQ2next")).click();
		}
	
		else {
			
			obj.click();
		}*/
		
			//System.out.println("success--------->" +li.get(i).findElement(By.linkText("Queries in BSSE"))+ "count"+ i);
		
			//System.out.println(li.get(i).getAttribute("href") +"count" +i);
		// d1.navigate().to("https://qa.cricketsocial.net/board?bid=ec60e177-e027-42cf-9b0b-a0413b0f0bc3");
	
	
	/*List<WebElement> li =  d1.findElements(By.tagName("a"));
	li.addAll(d1.findElements(By.tagName("img")));
	
	List<WebElement> active = new ArrayList<WebElement>();
	
	System.out.println(li.size());
	for(int i=1;i<li.size();i++)
	{
		if(li.get(i).getAttribute("href") != null	);
		{
			active.add(li.get(i));
		}
		
	}
	System.out.println(active.size());
	
	for(int j=0;j<active.size();j++) {
		
		System.out.println("active-----------------"+active.get(j).getAttribute("href"));
		if(active.get(j).getAttribute("href") != null ) {
		HttpURLConnection connection = (HttpURLConnection) new URL(active.get(j).getAttribute("href")).openConnection();
		connection.connect();
		if(connection.getResponseCode()==500)
       {
           System.out.println(active.get(j).getAttribute("href")+" - "+connection.getResponseMessage());
        }
      if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
       {
           System.out.println(active.get(j).getAttribute("href")+" - "+connection.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
        }
		String status = connection.getResponseMessage();
		
		connection.disconnect();
		
		System.out.println(active.get(j).getAttribute("href")+ "----->"+status+ "count" +j);
		
				
	}
	}
	}*/

	
	
	
    
	
		/*System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://qa.cricketsocial.net/");
		d1.findElement(By.xpath("/html/body/div[8]/header/div[1]/div/div[3]/nav/div/ul/li[5]/a")).click();
		d1.findElement(By.id("email")).sendKeys("nilakanta@cricketsocial.com");
		d1.findElement(By.id("pwd")).sendKeys("And@1234");
		d1.findElement(By.xpath("//*[@id=\"login_auth\"]/div[3]/div[2]/button")).click();
		d1.get("https://qa.cricketsocial.net/boardEvent/ec60e177-e027-42cf-9b0b-a0413b0f0bc3");
		d1.findElement(By.xpath("//*[@id=\"page-contents\"]/div/div/div/div/div[2]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		d1.findElement(By.cssSelector("a[href*='/showScoreCard/boardId/ec60e177-e027-42cf-9b0b-a0413b0f0bc3/matchId/a7997851-7c16-4990-985a-e480670172b3']")).click();
		d1.sel*/
          



      

  
		
			     
			/*System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
			ChromeDriver d1= new ChromeDriver();
			d1.get("https://qa.cricketsocial.net/");
			// finds the element
			WebElement one = d1.findElement(By.xpath("/html/body/div[8]/header/div[1]/div/div[3]/nav/div/ul/li[6]/a"));
			one.click();*/
		

