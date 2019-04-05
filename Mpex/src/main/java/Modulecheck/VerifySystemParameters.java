package Modulecheck;

import java.io.PrintWriter;
import java.lang.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonObject;

import BaseClass.TestBase;

public class VerifySystemParameters extends TestBase {
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]//following::span")
	WebElement System1;
	
	@FindBy(xpath = "//ul[@class='submenu nav-show']//following::span[3]")
	WebElement SystemParameters;

	@FindBy(xpath = "//div[@class='widget-header']//following::h4[10]")
	WebElement Scheduling;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_deSchStart_I\"]")
	WebElement ScheduleStart;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_txtAvailablityAfter_I\"]")
	WebElement AvailabilityAfter;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_cmbEmployeeSPHStructure_I\"]")
	WebElement EmployeeSPH;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_cmbDeleteScheduleStructure_I\"]")
	WebElement DeleteMasterAndSchedule;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_cmbAbsenceScheduleStructure_I\"]")
	WebElement CompareTeamCompanyStructure;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_cmbScheduleScheduleStructure_I\"]")
	WebElement CompareScheduleAndStructure;	
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_txtRelNoOfWeeks_I\"]")
	WebElement NumberOfWeeksForExchangeSchedule;
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_cmbLifeProbationBy_I\"]")
	WebElement LifeProbationBy;	
	
	@FindBy(xpath = "//*[@id=\"ctl00_MainContent_callPanelScheduling_spnScheduleInterval_I\"]")
	WebElement ScheduleInterval;	
	
	@FindBy(xpath = "//button[@id='ctl00_MainContent_btnSchEdit']")
	WebElement Editbutton;

	@FindBy(xpath = "//button[@id='ctl00_MainContent_btnSchSave']")
	WebElement Savebutton;
	
	public VerifySystemParameters() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonSystem()
	{
		
		System1.click();
	}
	
	public void ClickonSystemParameters()
	{
		SystemParameters.click();
	}
	public void ClickonScheduling()
	{
		Scheduling.click();
	}
	public void VerifyScheduleColumnValues() throws InterruptedException
	{
		String ScheduleStartvalue= ScheduleStart.getAttribute("value");
		String AvailabilityAftervalue= AvailabilityAfter.getAttribute("value");
		String EmployeeSPHvalue= EmployeeSPH.getAttribute("value");
		String DeleteMastervalue= DeleteMasterAndSchedule.getAttribute("value");
		String CompareTeamvalue= CompareTeamCompanyStructure.getAttribute("value");
		String NumberOfWeeks = NumberOfWeeksForExchangeSchedule.getAttribute("value");
		String LifeProbationByvalue = LifeProbationBy.getAttribute("value");
		String ScheduleIntervalvalue = ScheduleInterval.getAttribute("value");
		Editbutton.click();
		Thread.sleep(2000);
		ScheduleStart.clear();
		ScheduleStart.sendKeys(ScheduleStartvalue);
		AvailabilityAfter.clear();
		AvailabilityAfter.sendKeys(AvailabilityAftervalue);
		EmployeeSPH.clear();
		EmployeeSPH.sendKeys(EmployeeSPHvalue);
		DeleteMasterAndSchedule.clear();
		DeleteMasterAndSchedule.sendKeys(DeleteMastervalue);
		CompareTeamCompanyStructure.clear();
		CompareTeamCompanyStructure.sendKeys(CompareTeamvalue);
		NumberOfWeeksForExchangeSchedule.clear();
		NumberOfWeeksForExchangeSchedule.sendKeys(NumberOfWeeks);
		LifeProbationBy.clear();
		LifeProbationBy.sendKeys(LifeProbationByvalue);
		ScheduleInterval.clear();
		ScheduleInterval.sendKeys(ScheduleIntervalvalue);
		Savebutton.click();
		
	}	
	
	
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
}

