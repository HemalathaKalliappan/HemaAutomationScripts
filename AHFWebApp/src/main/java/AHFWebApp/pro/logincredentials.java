package AHFWebApp.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class logincredentials {
	
	public WebDriver d1;
		 @FindBy(how = How.XPATH, using = "//*[@id=\"i0116\"]")
		 private WebElement emailid;
		
		 @FindBy(how = How.XPATH, using = "//*[@id=\"idSIButton9\"]")
		 private WebElement nextlink;

		 @FindBy(how = How.XPATH, using = "//*[@id=\"i0118\"]")
		 private WebElement password;
			
		 @FindBy(how = How.XPATH, using = "//*[@id=\"idSIButton9\"]")
		 private WebElement signup;
		
		 @FindBy(how = How.XPATH, using = "//*[@id=\"idBtn_Back\"]")
		 private WebElement confirmationlink;

		 public logincredentials(WebDriver d1) {
				PageFactory.initElements(d1, this);
		 }
		 
		 public void emailid(String id) throws InterruptedException {
				
			 emailid.sendKeys(id);
			}
		 
		 public void next()  {
			 nextlink.click();
			}
		 
		 public void password(String pass)  {
			 password.sendKeys(pass);
			}
		
		 public void signupbutton()  {
			 signup.click();
			}
		 
		 public void confirmation()  {
			 confirmationlink.click();
			}

	public void browserclose() {
		d1.close();
		
	}
}
