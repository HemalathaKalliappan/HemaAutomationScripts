package Welcomepages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SpecialandInvestmentWelcomepage {

	 WebDriver d1;
	 @FindBy(how = How.CSS, using = "a[href*='https://ahf365.sharepoint.com/sites/AHFUAT/Special/SpecialPro1']")
	 private  WebElement Specialprojectlink;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"idHomePageNewItem\"]/span[2]")
	 private  WebElement newtasklink;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Title_fa564e0f-0c70-4ab9-b863-0177e6ddd247_$TextField\"]")
	 private WebElement taskname; 
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerImage\"]")
	 private  WebElement duedate;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"20180920\"]")
	 private  WebElement choosedate;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"AssignedTo_53101f38-dd2e-458c-b245-0c236cc13d1a_$ClientPeoplePicker_EditorInput\"]")
	 private  WebElement Assignto;
	
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl40$g_93ef5dd6_c977_4cf7_91fa_bc2944339689$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement Splsave;
	 
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl42$g_76617efb_a30a_46a6_ad11_4b99e509ff2f$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement Investmentsave;
	 
	 public SpecialandInvestmentWelcomepage(WebDriver d1) {
			// this.d1 = d1;
				PageFactory.initElements(d1, this);
				}
	 
	 public void Splprojectlink() {
		 Specialprojectlink.click();
	 }
	
	 public void Splsave() { 
		 Splsave.click();
	 }
	 
	 public void investmentsave() {
		 Investmentsave.click();
	 }
	 
	 public void newtasklink() {
		 newtasklink.click();
	 }
	 
	 public void taskname(String TaskName) {
		 taskname.sendKeys(TaskName);
	 }
	 
	 public void duedate() {
		 duedate.click();
	 }
	 public void choosedate() {
		choosedate.click();
	 }
	 
	 public void Assignto(String AssignedTo) {
		 Assignto.sendKeys(AssignedTo);
		 Assignto.sendKeys(Keys.ARROW_DOWN);
		 Assignto.sendKeys(Keys.ENTER);	
	 }
	 
}
