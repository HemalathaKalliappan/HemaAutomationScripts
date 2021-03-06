package AHFWebApp.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Documentuploads.StrategyDocs;

public class Homepagefunctions {
	 WebDriver d1;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"O365_MainLink_Settings\"]")
	 private  WebElement settingiconbtn;
	 @FindBy(how = How.ID, using = "O365_SubLink_SuiteMenu_zz8_MenuItem_ViewAllSiteContents")
	 private  WebElement sitecontentlink;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"viewlistf223c307-2a46-4373-9d43-fb40c4af23f4-image\"]/img")
	 private  WebElement portalhome;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"zz11_RootAspMenu\"]/li/a")
	 private WebElement AHFhomelink; 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_fe32d256_0925_4393_9882_f54d57d7fb70\"]/div/div/div/div[1]/a/img")
	 private  WebElement Acquisitionnavigationlink;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_fe32d256_0925_4393_9882_f54d57d7fb70\"]/div/div/div/div[2]/a/img")
	 private  WebElement Affiliationnavigationlink;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_fe32d256_0925_4393_9882_f54d57d7fb70\"]/div/div/div/div[3]/a/img")
	 private  WebElement Specialnavigationlink;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_493e90fc_d311_4805_8a4b_0a469c8d639f\"]/div/input")
	 private  WebElement createevent;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl00_ctl00_ctl00_ctl05_ctl00_ctl00_TextField\"]")
	 private  WebElement title;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl02_ctl00_ctl00_ctl05_ctl00_ctl00_DateTimeField_DateTimeFieldDateDatePickerImage\"]")
	 private  WebElement starttime;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"20180831\"]")
	 private  WebElement selectstartdate;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl03_ctl00_ctl00_ctl05_ctl00_ctl00_DateTimeField_DateTimeFieldDateDatePickerImage\"]")
	 private  WebElement endtime;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"20180831\"]")
	 private  WebElement selectenddate;
	 @FindBy(how = How.ID, using = "ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl08_ctl00_ctl00_ctl05_ctl00_ctl00_TextField")
	 private  WebElement shortdescription;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem\"]")
	 private  WebElement eventsave;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"NotificationTitle_89451f3f-d12d-49a1-ba8d-013758593e0d_$TextField\"]")
	 private  WebElement notificationtitle;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Status_04d4a6d9-c6b9-43fb-b73d-4f3b034ce0f1_$DropDownChoice\"]")
	 private  WebElement status;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"FileLeafRef_8553196d-ec8d-4564-9861-3dbe931050c8_$onetidIOFile\"]")
	 private  WebElement name;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Description_9da97a8a-1da5-4a77-98d3-4bc10456e700_$TextField\"]")
	 private  WebElement description;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_46873a2e_b154_42dd_8e95_92f64cdb134b_ctl00_ctl02_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem\"]")
	 private  WebElement checkin;
	 
	 public Homepagefunctions(WebDriver d1) {
			// this.d1 = d1;
				PageFactory.initElements(d1, this);
				}
	 public void settingicon() {
		 settingiconbtn.click();
	 }
	 public void portalhome() {
		 portalhome.click();
	 }
	 public void sitecontent() {
		 sitecontentlink.click();
	 }
	 public void Acquisitionnavigationlink() {
		 Acquisitionnavigationlink.click();
	 }
	 public void Affiliationnavigationlink() {
		 Affiliationnavigationlink.click();
	 }
	 public void Specialnavigationlink() {
		 Specialnavigationlink.click();
	 }
	 public void AHFhomelink() {
		 AHFhomelink.click();
	 }
	 public void createevent() {
		 createevent.click();
	 }
	 public void title() {
		 title.sendKeys("Ahf today demo");
	 }
	 public void starttime() {
		 starttime.click();
	 }
	 public void endtime() {
		 endtime.click();
	 }
	 public void selectstartdate() {
		 selectstartdate.click();
	 }
	 public void selectenddate() {
		 selectenddate.click();
	 }
	 public void shortdescription() {
		 shortdescription.sendKeys("Ahf demo");
	 }
	 public void eventsave() {
		 eventsave.click();
	 }
	 public void notificationtitle(String notification) {
		 notificationtitle.sendKeys(notification);
	 }
	 public void status(String Status) {
		 Select dropdown =  new Select(status);
			dropdown.selectByValue(Status);
	 }
	 public void name(String names) {
		 name.sendKeys(names);
	 }
	 public void description(String descriptions) {
		 description.sendKeys(descriptions);
	 }
	 public void checkin() {
		 checkin.click();
	 }
}

