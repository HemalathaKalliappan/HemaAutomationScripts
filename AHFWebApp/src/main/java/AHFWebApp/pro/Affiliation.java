package AHFWebApp.pro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Affiliation {

	WebDriver d1;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"zz11_RootAspMenu\"]/li/ul/li[2]/a/span/span")
	 private  WebElement Affiliationlink;
	//label[@id='message23']
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"btnNewProj\"]/input[1]")
	 private  WebElement createaffiliation;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DealName_b3e32d85-6db5-498d-8efa-9df97b4a328d_$TextField\"]")
	 private WebElement DealName;
	 
	//*[@id="DealName_b8d09e2f-5d65-4c3b-b652-392f38c224a3_$TextField"]
	 @FindBy(how = How.XPATH, using = "//*[@id=\"AHFLead_07b4c07e-5e4a-49c2-8102-61a8f107299b_$ClientPeoplePicker_EditorInput\"]")
	 private WebElement AHFLead;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"Bureau_cc4faac7-0195-47e8-b4f1-75311951e697_$DropDownChoice\"]")
	 private WebElement Bureau;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Typee_81eefb27-5bf4-4d30-90c6-4999d4b31208_$DropDownChoice\"]")
	 private WebElement ProjectType;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DealOverview_5f887e53-536e-4f26-9d00-a029b0dde9cd_$TextField\"]")
	 private WebElement DealOverview ;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"StatusStages_8e9fad64-db72-4d1f-92c9-ad6768e6d937_$DropDownChoice\"]")
	 private WebElement PlaybookStage;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"_x0031_2MonthCensusImpact_0bee27be-35b3-4672-92f2-391b68997044_$DropDownChoice\"]")
	 private WebElement MonthCensusImpact;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ClosingDate_746a8deb-96dd-4add-8978-c1c5cc3c0177_$DateTimeFieldDate\"]")
	 private WebElement ClosingDate;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"Priority_fa655ac8-9770-4004-9370-363e2ec5dcf4_$DropDownChoice\"]")
	 private WebElement priority;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Status_78995552-35d8-44f3-be0d-dec95ff66e95_$DropDownChoice\"]")
	 private WebElement Status;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Status_x0020_explaination_9c2e72c4-4ee8-442c-9d10-31d2e4264cfe_$TextField\"]")
	 private WebElement statusexplanation;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"OtherComments_224faad1-997b-44bc-a365-cfc82e2b2244_$TextField\"]")
	 private WebElement othercomments;
	 
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl42_g_ffdb94b4_94c3_4666_8fca_eff20a54a2d5_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem\"]")
	 private WebElement affsave;

	 
	 public Affiliation(WebDriver d1) {
		// this.d1 = d1;
			PageFactory.initElements(d1, this);
			}
	 
	 
 public void Affiliation()
 {
	 Affiliationlink.click();
 }
	
	public void createaffiliation()
	{
		createaffiliation.click();
	}
	
	
	public void Dealname(String text)

	{
		DealName.sendKeys(text);
	}
	
	public void ahflead(String text)
	{
		AHFLead.sendKeys(text);
		AHFLead.sendKeys(Keys.ARROW_DOWN);
		AHFLead.sendKeys(Keys.ENTER);
	}
	
	public void Bureau(String value)
	{
		Select dropdown =  new Select(Bureau);
		dropdown.selectByValue(value);
	}
	 
	public void ProjectType(String value)
	{
		Select dropdown =  new Select(ProjectType);
		dropdown.selectByValue(value);
	}
	public void overview(String text)
	{
		DealOverview.sendKeys(text);
	}
	
	public void PlaybookStage(String value)
	{
		Select dropdown =  new Select(PlaybookStage);
		dropdown.selectByValue(value);
	}
	public void MonthCensusImpact(String value)
	{
	Select dropdown =  new Select(MonthCensusImpact);
		dropdown.selectByValue(value);
	}
	
	 public void priority(String value)
	 {
		 
		 Select dropdown =  new Select(priority);
			dropdown.selectByValue(value);
	 }
	public void status(String value)
	{
		Select dropdown =  new Select(Status);
		dropdown.selectByValue(value);
		
	}
	public void save()
	{
		affsave.click();
	}
	
	public void statusexplanation(String text)
	{
		statusexplanation.sendKeys(text);
	}
	
	public void othercomments(String text)
	{
		othercomments.sendKeys(text);
	}
	

}
	