package Modulecheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class Modules extends TestBase{

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
	
	
	
	public Modules() {
		PageFactory.initElements(driver, this);
	}
	
	public void Language()
	{
		Language.click();
		English.click();
	}
	public void favorites()
	{
		Language.click();
		favorites.click();
	}
	public void Process()
	{
		Language.click();
		Process.click();
	}
	public void Reporting()
	{
		Language.click();
		Reporting.click();
	}
	public void Setup()
	{
		Language.click();
		Setup.click();
	}
	public void Admin()
	{
		Language.click();
		Admin.click();
	}
	
	
	public boolean  Defaultlink() {
		return Defaultlink.isDisplayed();

	}
	public boolean  VerifyFavoriteModules2() {
		return favoritesvalue2.isDisplayed();

	}
	
	public boolean  VerifyProcessvalues2() {
		return Processvalues2.isDisplayed();

	}
	
	
}

