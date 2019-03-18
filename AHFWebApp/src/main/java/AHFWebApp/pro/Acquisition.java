package AHFWebApp.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Acquisition {
	WebDriver d1;
	 @FindBy(how = How.CSS, using = "a[href*='https://ahf365.sharepoint.com/sites/AHFUAT/Acquisition/SitePages/ProjectCreate.aspx']")
	 private  WebElement Acquisitionlink;
	//*[@id="zz10_RootAspMenu"]/li[1]/ul/li[1]/a
	 
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"btnNewProj\"]/input[1]")
	 private  WebElement createacquisition;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DealName_b8d09e2f-5d65-4c3b-b652-392f38c224a3_$TextField\"]")
	 private WebElement DealName;
	 
	//*[@id="DealName_b8d09e2f-5d65-4c3b-b652-392f38c224a3_$TextField"]
	 @FindBy(how = How.XPATH, using = "//*[@id=\"AHFLead_07b4c07e-5e4a-49c2-8102-61a8f107299b_$ClientPeoplePicker_EditorInput\"]")
	 private WebElement AHFLead;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"Bureau_cc4faac7-0195-47e8-b4f1-75311951e697_$DropDownChoice\"]")
	 private WebElement Bureau;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Typee_81eefb27-5bf4-4d30-90c6-4999d4b31208_$DropDownChoice\"]")
	 private WebElement Projecttype;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"DealOverview_5f887e53-536e-4f26-9d00-a029b0dde9cd_$TextField\"]")
	 private WebElement Dealoverview ;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"StatusStages_8e9fad64-db72-4d1f-92c9-ad6768e6d937_$DropDownChoice\"]")
	 private WebElement Playbookstage;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"_x0031_2MonthCensusImpact_0bee27be-35b3-4672-92f2-391b68997044_$DropDownChoice\"]")
	 private WebElement Monthcensusimpact;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ClosingDate_87846458-7956-4d2a-ae0e-2362b5f27dbf_$DateTimeFieldDate\"]")
	 private WebElement ClosingDate;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"Priority_acb1e186-5069-4330-bdf0-e3f53314e8a2_$DropDownChoice\"]")
	 private WebElement priority;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"Status_d7e46107-97e2-49b5-b4c9-e5e9297c5b48_$DropDownChoice\"]")
	 private WebElement status;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"StatusExplaination_2fbc9c88-0ab5-419e-adc5-77625cf5a543_$TextField\"]")
	 private WebElement Statusexplanation;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"OtherComments_803e36b6-c8eb-45a3-a8e6-6acba1e94cdd_$TextField\"]")
	 private WebElement Othercomments;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl42_g_ffdb94b4_94c3_4666_8fca_eff20a54a2d5_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem\"]")
	 private WebElement acqsave;

	 @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl42_g_ffdb94b4_94c3_4666_8fca_eff20a54a2d5_ctl00_toolBarTbl_RightRptControls_ctl01_ctl00_diidIOGoBack\"]")
	 private WebElement cancel;
	 

	 public Acquisition(WebDriver d1) {
		// this.d1 = d1;
			PageFactory.initElements(d1, this);
			}
	 
	 public void Acquisitionlink1()throws InterruptedException
	 {
		 System.out.println("Before click");
	//	 d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Acquisitionlink.click();
	 }
	 public void createacquisiton() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 createacquisition.click();
	 }
	public void Dealname(String Dealname) throws InterruptedException
	{
		DealName.sendKeys(Dealname);
	}
	public void AHFLead(String AHFLeads) throws InterruptedException
	{
		//Thread.sleep(4000);
		AHFLead.sendKeys(AHFLeads);
		Thread.sleep(4000);
		AHFLead.sendKeys(Keys.ARROW_DOWN);
		AHFLead.sendKeys(Keys.ENTER);
	}	
	public void Bureau(String Bureaus) throws InterruptedException
	{
		Thread.sleep(1000);
		Select dropdown =  new Select(Bureau);
		dropdown.selectByValue(Bureaus);
	}
	 
	public void ProjectType(String ProjectType) throws InterruptedException
	{
		Thread.sleep(1000);
		Select dropdown =  new Select(Projecttype);
		dropdown.selectByValue(ProjectType);
	}
	public void Dealoverview(String DealOverview) throws InterruptedException
	{
		
		Dealoverview.sendKeys(DealOverview);
	}
	public void PlaybookStage(String PlaybookStage) throws InterruptedException
	{
		Thread.sleep(2000);
		Select dropdown =  new Select(Playbookstage);
		dropdown.selectByValue(PlaybookStage);
	}
	
	public void MonthCensusImpact(String MonthCensusImpact) throws InterruptedException
	{
		Thread.sleep(2000);
		Select dropdown =  new Select(Monthcensusimpact);
		dropdown.selectByValue(MonthCensusImpact);
	}
	
	public void priority(String Priority) throws InterruptedException
	{
		Thread.sleep(2000);
		Select dropdown =  new Select(priority);
		dropdown.selectByValue(Priority);
	}
	public void Status(String Status) throws InterruptedException
	{
		Thread.sleep(2000);
		Select dropdown =  new Select(status);
		dropdown.selectByValue(Status);
	}
	public void StatusExplanation(String StatusExplanation) throws InterruptedException
	{
		Statusexplanation.sendKeys(StatusExplanation);
	}
	public void Othercomments(String OtherComments) throws InterruptedException
	{
		Othercomments.sendKeys(OtherComments);
	}
	
	public void save() throws InterruptedException
	{
	acqsave.click();
	}
	 
	public void passvalue() throws InterruptedException
	{
	//	Dealname("");
		
		//AHFLead("Nachiyar");
		//AHFLead("hema95sheelu@gmail.com");
	//	Bureau("Western");
		//ProjectType("HCC/Provider");
	Dealoverview("AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit "
				+ "provider of HIV prevention services, testing, and"
				+ " healthcare for HIV patients. AHF currently claims to provide medical "
				+ "care and services to more than 600,000 individuals in 15 U.S. states and 36 countries worldwide");
	
		
		System.out.println("Before AHF Lead");
		//AHFLead("Asif Iqbal");
		
	}
	
	public void closebrowser()
	{
	d1.close();
	}
	}
