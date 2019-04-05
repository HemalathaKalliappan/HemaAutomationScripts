package Modulecheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;
import junit.framework.Assert;

public class VerifyModulesLeftNavigations extends TestBase{
	//a[@class='bt-version btn btn-default  btn-xs'][0]
	@FindBy(xpath = "//a[contains(text(),'Version')]")
	static WebElement Version;
	
	@FindBy(xpath = "//*[@id=\"navbar-container\"]/div[2]/table/tbody/tr/td[2]/ul/li[2]/a")
	WebElement Language;
	
	@FindBy(xpath = "//*[@id=\"ctl00_rptLanguage_ctl00_btnLangaugeNativeName\"]")
	WebElement English;
	
	@FindBy(xpath = "//button[contains(text(),'Favorites')]")
	WebElement favorites;
	
	@FindBy(xpath = "//button[contains(text(),'Process')]")
	WebElement Process;
	
	@FindBy(xpath = "//button[contains(text(),'Reporting')]")
	WebElement Reporting;
	
	@FindBy(xpath = "//button[contains(text(),'Setup')]")
	WebElement Setup;
	
	@FindBy(xpath = "//button[contains(text(),'Admin')]")
	WebElement Admin;
	
	@FindBy(xpath = "//*[@id=\"left-menu\"]/li[1]/a")
	WebElement Defaultlink;
	
	@FindBy(xpath = "//*[@id=\"left-menu\"]/li[2]/a")
	WebElement favoritesvalue2;
	
	@FindBy(css = "a[href*='/Mpex.web/Employee/Employee.aspx']")
	WebElement Processvalues2;
	
	public VerifyModulesLeftNavigations() {
		PageFactory.initElements(driver, this);
	}
	
	public void Language()
	{
		Language.click();
		
		ClickOn(driver,English,20);
	}
	public void favorites()
	{
		Language.click();
		ClickOn(driver,favorites,20);	
	}
	public void Process()
	{
		Language.click();
		ClickOn(driver,Process,20);
	}
	public void Reporting()
	{
		Language.click();
		ClickOn(driver,Reporting,20);	
	}
	public void Setup()
	{
		Language.click();
		ClickOn(driver,Setup,20);
		Setup.click();
	}
	public void Admin()
	{
		Language.click();
		ClickOn(driver,Admin,20);
	}
	
	public void VerifyLeftNavigationValues() {
		List<WebElement> d1 = driver.findElements(By.xpath("//*[@class=\"menu-text\"]"));
		java.util.Iterator<WebElement> i = d1.iterator();
		
		while(i.hasNext())
		{
			WebElement n = i.next();
			String s = n.getText();
			System.out.println(s);
		}
	}
	public static void SendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}

