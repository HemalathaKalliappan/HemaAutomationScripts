package Welcomepages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	
	WebDriver d1;
	 @FindBy(how = How.CSS, using = "a[href*='https://ahf365.sharepoint.com/sites/AHFUAT/Acquisition/AcquistionsPro']")
	 private  WebElement Acquisitionprojectlink;
	
	 @FindBy(how = How.CSS, using = "a[href*='https://ahf365.sharepoint.com/sites/AHFUAT/Affiliation/DemoALM1TestProject']")
	 private  WebElement Affiliationprojectlink;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d\"]/div/div/div[2]/input")
	 private  WebElement prospectinglink;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d\"]/div/div/div[3]/input")
	 private WebElement Diligencelink;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d\"]/div/div/div[4]/input")
	 private  WebElement negotiationlink;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d\"]/div/div/div[5]/input")
	 private WebElement transitionlink; 
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl41_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d\"]/div/div/div[6]/input")
	 private  WebElement performancelink;
	
	 @FindBy(how = How.CSS, using = "a[href*='javascript:CreateNewTask(\"ProspectingTask\")']")
	 private WebElement prospectingtasklink; 
	//*[@id="ctl00_ctl40_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d"]/div/div/div[2]/div[2]/a
	
	 @FindBy(how = How.CSS, using = "a[href*='javascript:CreateNewTask(\"DiligenceTask\")']")
	 private  WebElement Diligencetasklink;
	//*[@id="ctl00_ctl40_g_924d12f8_ba1b_4fa0_b591_a8955eddeb2d"]/div/div/div[3]/div[2]/a
	
	 @FindBy(how = How.CSS, using = "a[href*='javascript:CreateNewTask(\"NegotiationTask\")']")
	 private WebElement negotiationtasklink;
	
	 @FindBy(how = How.CSS, using = "a[href*='javascript:CreateNewTask(\"TransitionTask\")']")
	 private WebElement transitiontasklink; 
	
	 @FindBy(how = How.CSS, using = "a[href*='javascript:CreateNewTask(\"ClosedTask\")']")
	 private  WebElement performancetasklink;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Title_fa564e0f-0c70-4ab9-b863-0177e6ddd247_$TextField\"]")
	 private WebElement taskname; 
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerImage\"]")
	 private  WebElement duedate;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"20180920\"]")
	 private  WebElement choosedate;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"AssignedTo_53101f38-dd2e-458c-b245-0c236cc13d1a_$ClientPeoplePicker_EditorInput\"]")
	 private  WebElement Assignto;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Status_c15b34c3-ce7d-490a-b133-3f4de8801b76_$DropDownChoice\"]")
	 private  WebElement taskstatus;
	 
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl40$g_95149ea4_b106_438a_b75f_718cc625aefc$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement prospectingsave;
	
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl40$g_0d85268f_8f2b_455f_83ca_3033d9683895$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement Diligencesave;
	
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl40$g_40576d26_d844_4046_954d_d249b7033e2a$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement negotiationsave;
	 
	 @FindBy(how = How.XPATH, using = "//*[contains(@name,'ctl00$ctl40$g_1de3a682_1518_408c_b013_3b1a6b24c253$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem')]")
	 private  WebElement transitionsave;
	 
	 @FindBy(how = How.XPATH, using = "//input[@type='button' and @name='ctl00$ctl40$g_9c92c20a_a474_4b26_afbc_9649e2fa0b13$ctl00$toolBarTbl$RightRptControls$ctl00$ctl00$diidIOSaveItem']")
	 private  WebElement performancesave;
	 
	
	 public WelcomePage(WebDriver d1) {
			// this.d1 = d1;
				PageFactory.initElements(d1, this);
				}
		 
	 public void Acqprojectlink() {
		 Acquisitionprojectlink.click();
	 }
	 public void Affprojectlink() {
		 Affiliationprojectlink.click();
	 }
	
	 
	 public void propectingtask() {
		 prospectingtasklink.click(); 
	 }

	 public void Diligencetask() {
		 Diligencetasklink.click();
	 }
	 
	 public void negotiationtask() {
		 negotiationtasklink.click();
	 }
	 
	 public void transitiontask() {
	 transitiontasklink.click();
	 }
	 
	 public void performancetask() {
	 performancetasklink.click();
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
	 
	 public void taskstatus(String status) {
		 Select dropdown =  new Select(taskstatus);
			dropdown.selectByValue(status);
	 }
	 
	 public void prospectingsave()
	 {
		 
		 prospectingsave.click();
	 }
	 public void Diligencesave()
	 {
		 Diligencesave.click();
	 } 
	 public void transitionsave()
	 {
		 transitionsave.click();
	 }
	 public void negotiationsave()
	 {
		 negotiationsave.click();
	 }
	 public void performancesave()
	 {
		 performancesave.click();
	 }

}

