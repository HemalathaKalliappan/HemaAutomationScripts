package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;

import AHFWebApp.pro.Acquisition;

import AHFWebApp.pro.Affiliation;
import AHFWebApp.pro.Homepagefunctions;
import AHFWebApp.pro.SpecialandInvestment;
import AHFWebApp.pro.logincredentials;
import AHFWebApp.pro.test;
import Documentuploads.StrategyDocs;
import Welcomepages.SpecialandInvestmentWelcomepage;
import Welcomepages.WelcomePage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ahfsteps {
	WebDriver d1;

	/*RemoteWebDriver d1;
	
	public ExtentHtmlReporter htmlextent;
	public ExtentReports report;
	public ExtentTest log;
	 public static final String USERNAME = "hemalathakalliap1";
	  public static final String AUTOMATE_KEY = "C5xVxpY2MMdXGPmsiqiz";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
*/
	
@Before
@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	/*DesiredCapabilities caps = new DesiredCapabilities();
    caps.setPlatform(Platform.WINDOWS);
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);*/
	
		System.setProperty("webdriver.chrome.driver","E:\\file formats\\chromedriver.exe");
		d1= new ChromeDriver();
		d1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
	}	

@After
public void afterScenario(Scenario scenario) {
	System.out.println("test");
	if (scenario.isFailed()) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
				TakesScreenshot screen = (TakesScreenshot) d1;
				File src = screen.getScreenshotAs(OutputType.FILE);
				String dest ="E:/eclipse workspace/AHF/target/cucumber-reports/snapshot"+""+".png";
				File target = new File(dest);
				FileUtils.copyFile(src, target);
			Reporter.addScreenCaptureFromPath(dest.toString());
		
		} 
		catch (IOException e) {
		} 
	}
	else {
		try {
				TakesScreenshot screen = (TakesScreenshot) d1;
				File src = screen.getScreenshotAs(OutputType.FILE);
				String dest ="E:/eclipse workspace/AHF/target/cucumber-reports/snapshot"+""+".png";
				File target = new File(dest);
				FileUtils.copyFile(src, target);
			Reporter.addScreenCaptureFromPath(dest.toString());
		
		} 
		catch (IOException e) {
		} 
	}
	}

@When("^Navigate to the Url$")
	public void navigate_to_the_Url() throws Throwable {
	/*DesiredCapabilities caps = new DesiredCapabilities();
    caps.setPlatform(Platform.WINDOWS);
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);*/
    d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/SitePages/AHFHome.aspx");
    d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
@When("^Enter username and password$")
public void enter_username_and_password() throws Throwable {
	logincredentials fr = new logincredentials(d1);
	Thread.sleep(1000);
	fr.emailid("Asif.Iqbal@aidshealth.org");
	fr.next();
	fr.password("Sh@r3P01nt$1");
	Thread.sleep(4000);
	fr.signupbutton();
	fr.confirmation();
}
@Then("^validate the outcomes$")
public void validate_the_outcomes() throws Throwable {
	logincredentials fr = new logincredentials(d1);
	d1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	d1.close();
}
//@Test(dataProvider="Acquisition")
@When("^Click on Acquisition$")
public void click_on_Acquisition() throws Throwable {
	//Thread.sleep(4000);
	
	Thread.sleep(4000);
	Acquisition dr = new Acquisition(d1);
	dr.Acquisitionlink1();		
}
/*@When("^Enter all the required fields$")
public void enter_all_the_required_fields(DataTable data) throws Throwable {
	List<List<String>> datum = data.raw();
	Acquisition dr1 = new Acquisition(d1);
	dr1.createacquisiton();
	dr1.Dealname(datum.get(0).get(0));
	
}
*/
@When("^Enter all the required fields \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_the_required_fields_and_and_and_and_and_and_and_and_and_and(String Dealname, String AHFLeads, String Bureaus, String ProjectType , String DealOverview ,String PlaybookStage, String MonthCensusImpact, String Priority, String Status, String StatusExplanation , String OtherComments) throws Throwable {
	Acquisition dr1 = new Acquisition(d1);
	dr1.createacquisiton();
	dr1.Dealname(Dealname);
	dr1.AHFLead(AHFLeads);
	dr1.Bureau(Bureaus);
	dr1.ProjectType(ProjectType);
	dr1.Dealoverview(DealOverview);
	dr1.PlaybookStage(PlaybookStage);
	dr1.MonthCensusImpact(MonthCensusImpact);
	dr1.priority(Priority);
	dr1.Status(Status);
	dr1.StatusExplanation(StatusExplanation);
	dr1.Othercomments(OtherComments);
	Thread.sleep(4000);
	dr1.save();
	Thread.sleep(4000);
	d1.close();
}
@When("^Click on Acquisition project link$")
public void click_on_Acquisition_project_link() throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	Thread.sleep(2000);
	wr.Acqprojectlink();

}
@When("^Enter all required fields for Prospecting task \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Prospecting_task_and_and(String TaskName, String AssignedTo, String TaskStatus) throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	wr.propectingtask();
	wr.taskname(TaskName);
	wr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	wr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	wr.Assignto(AssignedTo);
	Thread.sleep(2000);
	wr.taskstatus(TaskStatus);
	Thread.sleep(2000);
	wr.prospectingsave();
}
@When("^Enter all required fields for Deligence task \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Deligence_task_and_and(String TaskName, String AssignedTo, String TaskStatus) throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	wr.Diligencetask();
	wr.taskname(TaskName);
	wr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	wr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	wr.Assignto(AssignedTo);
	Thread.sleep(2000);
	wr.taskstatus(TaskStatus);
	Thread.sleep(2000);
	wr.Diligencesave();
}
@When("^Enter all required fields for Negotiation task \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Negotiation_task_and_and(String TaskName, String AssignedTo, String TaskStatus) throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	wr.negotiationtask();
	wr.taskname(TaskName);
	wr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	wr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	wr.Assignto(AssignedTo);
	Thread.sleep(2000);
	wr.taskstatus(TaskStatus);
	Thread.sleep(2000);
	wr.negotiationsave();
}

@When("^Enter all required fields for Transition task \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Transition_task_and_and(String TaskName, String AssignedTo, String TaskStatus) throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	wr.transitiontask();
	wr.taskname(TaskName);
	wr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	wr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	wr.Assignto(AssignedTo);
	Thread.sleep(2000);
	wr.taskstatus(TaskStatus);
	Thread.sleep(2000);
	wr.transitionsave();
}
@When("^Enter all required fields for Performance Monitoring task \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Performance_Monitoring_task_and_and(String TaskName, String AssignedTo, String TaskStatus) throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	wr.performancetask();
	wr.taskname(TaskName);
	wr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	wr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	wr.Assignto(AssignedTo);
	Thread.sleep(2000);
	wr.taskstatus(TaskStatus);
	Thread.sleep(2000);
	wr.performancesave();
}
@When("^Click on save$")
public void click_on_save() throws Throwable {   
}

@When("^Click on Affiliation$")
public void click_on_Affiliation() throws Throwable {
	Affiliation dr1 = new Affiliation(d1);
	dr1.Affiliation();	
}
@When("^Click on Affiliation project link$")
public void click_on_Affiliation_project_link() throws Throwable {
	WelcomePage wr = new WelcomePage(d1);
	d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/Affiliation/AffiliationsPro/SitePages/WelcomePage.aspx");
	//wr.Affprojectlink();
}
@When("^Enter all the required fields in Affiliation \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_the_required_fields_in_Affiliation_and_and_and_and_and_and_and_and_and_and(String Dealname, String AHFLeads, String Bureaus, String ProjectType , String DealOverview ,String PlaybookStage, String MonthCensusImpact, String Priority, String Status, String StatusExplanation , String OtherComments) throws Throwable {
	Affiliation dr1 = new Affiliation(d1);
	dr1.createaffiliation();
	dr1.Dealname(Dealname);
	dr1.ahflead(AHFLeads);
	dr1.Bureau(Bureaus);
	dr1.ProjectType(ProjectType);
	dr1.overview(DealOverview);
	dr1.PlaybookStage(PlaybookStage);
	dr1.MonthCensusImpact(MonthCensusImpact);
	dr1.priority(Priority);
	dr1.status(Status);
	dr1.statusexplanation(StatusExplanation);
	dr1.othercomments(OtherComments);
	Thread.sleep(4000);
	dr1.save();
	Thread.sleep(4000);
	d1.close();	
}
@When("^Click on special$")
public void click_on_special() throws Throwable {
	SpecialandInvestment sr = new SpecialandInvestment(d1);
	sr.Speciallink();
}
@When("^Enter all the required fields in special \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
public void enter_all_the_required_fields_in_special_and_and_and_and_and(String DealName, String Priority, String Status, String Overview, String StatusExplanation, String OtherComments) throws Throwable {
	SpecialandInvestment sr = new SpecialandInvestment(d1);
	sr.createproject();
	sr.Dealname(DealName);
	sr.priority(Priority);
	Thread.sleep(2000);
	sr.Status(Status);
	Thread.sleep(2000);
	sr.Overview(Overview);
	sr.Statusexplaination(StatusExplanation);
	sr.OtherComments(OtherComments);
	sr.ClosingDate();
	Thread.sleep(2000);
	d1.switchTo().frame("ClosingDate_87846458-7956-4d2a-ae0e-2362b5f27dbf_$DateTimeFieldDateDatePickerFrame");
	sr.choosedate();
	//d1.switchTo().parentFrame();	
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	sr.save();
	d1.close();
}
@When("^Click on Special project link$")
public void click_on_Special_project_link() throws Throwable {
	SpecialandInvestmentWelcomepage sr = new SpecialandInvestmentWelcomepage(d1);
	sr.Splprojectlink();
}
@When("^Enter all required fields for Special task \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Special_task_and(String TaskName, String AssignedTo) throws Throwable {
	SpecialandInvestmentWelcomepage sr = new SpecialandInvestmentWelcomepage(d1);
	Thread.sleep(2000);
	d1.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	ArrayList<String> tabs = new ArrayList<String> (d1.getWindowHandles());
	d1.switchTo().window(tabs.get(0)); //switches to new tab
	d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/Special/SpecialPro1/Lists/ProjectTasks");
	//sr.projecttasklink();
	sr.newtasklink();
	sr.taskname(TaskName);
	sr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	sr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	sr.Assignto(AssignedTo);
	Thread.sleep(2000);
	sr.Splsave();
}
@When("^Click on Investment$")
public void click_on_Investment() throws Throwable {
	SpecialandInvestment sr = new SpecialandInvestment(d1);
	sr.Investmentlink();
}
@When("^Enter all required fields for Investment task \"(.*?)\" and \"(.*?)\"$")
public void enter_all_required_fields_for_Investment_task_and(String TaskName, String AssignedTo) throws Throwable {
	SpecialandInvestmentWelcomepage sr = new SpecialandInvestmentWelcomepage(d1);
	Thread.sleep(2000);
	d1.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	ArrayList<String> tabs = new ArrayList<String> (d1.getWindowHandles());
	d1.switchTo().window(tabs.get(0)); //switches to new tab
	d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/Investments/Lists/Investment%20Tasks");
	//sr.projecttasklink();
	sr.newtasklink();
	sr.taskname(TaskName);
	sr.duedate();
	d1.switchTo().frame("DueDate_cd21b4c2-6841-4f9e-a23a-738a65f99889_$DateTimeFieldDateDatePickerFrame");
	sr.choosedate();
	d1.switchTo().defaultContent();
	Thread.sleep(2000);
	sr.Assignto(AssignedTo);
	Thread.sleep(2000);
	sr.investmentsave();
}
@When("^Navigate to project welcome page$")
public void navigate_to_project_welcome_page() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	d1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	doc.projectlink();
}
@When("^Upload document in Prospecting$")
public void upload_document_in_Prospecting() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.prospectingdoc();
	doc.uploadbtn();
	Thread.sleep(2000);
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
	}
@When("^Upload document in Diligence$")
public void upload_document_in_Diligence() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.diligencedoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in Negotiation$")
public void upload_document_in_Negotiation() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.negotiationdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in Transition$")
public void upload_document_in_Transition() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.negotiationdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in PerformanceMonitoring$")
public void upload_document_in_PerformanceMonitoring() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.performancemonitoringdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
	d1.close();
	
}
@When("^Upload document in AffProspecting$")
public void upload_document_in_AffProspecting() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.prospectingdoc();
	doc.uploadbtn();
	Thread.sleep(2000);
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in AffDiligence$")
public void upload_document_in_AffDiligence() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.diligencedoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in AffNegotiation$")
public void upload_document_in_AffNegotiation() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.negotiationdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in AffTransition$")
public void upload_document_in_AffTransition() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.negotiationdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
}
@When("^Upload document in AffPerformanceMonitoring$")
public void upload_document_in_AffPerformanceMonitoring() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	doc.performancemonitoringdoc();
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
	d1.close();
	
}
@When("^Upload document$")
public void upload_document() throws Throwable {
	StrategyDocs doc = new StrategyDocs(d1);
	ArrayList<String> tabs = new ArrayList<String> (d1.getWindowHandles());
	d1.switchTo().window(tabs.get(0));
	d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/Special/SpecialPro1/ProjectDocuments");
	//doc.projectlink();
	//doc.projectdoc1();
	Thread.sleep(2000);
	doc.uploadbtn();
	d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
	doc.choosebtn();
	Thread.sleep(2000);
	doc.okutton();
	d1.close();
}
@When("^Navigate to project$")
public void navigate_to_project() throws Throwable {
	Homepagefunctions hr = new Homepagefunctions(d1);
	hr.Acquisitionnavigationlink();
	hr.AHFhomelink();
	hr.Affiliationnavigationlink();
	hr.AHFhomelink();
	hr.Specialnavigationlink();
}
@When("^create calendar event in home page$")
public void create_calendar_event_in_home_page() throws Throwable {
		Homepagefunctions cr = new Homepagefunctions(d1);
		cr.createevent();
		cr.title();
		System.out.println("Befr Switch");
		cr.starttime();
		d1.switchTo().frame("ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl02_ctl00_ctl00_ctl05_ctl00_ctl00_DateTimeField_DateTimeFieldDateDatePickerFrame");
		System.out.println("Switched");
		Thread.sleep(2000);
		cr.selectstartdate();
		d1.switchTo().defaultContent();
		cr.endtime();
		d1.switchTo().frame("ctl00_ctl41_g_554f5524_6226_4c09_a70e_7862493acdc7_ctl00_ctl05_ctl03_ctl00_ctl00_ctl05_ctl00_ctl00_DateTimeField_DateTimeFieldDateDatePickerFrame");
		Thread.sleep(2000);
		cr.selectenddate();
		Thread.sleep(2000);
		d1.switchTo().defaultContent();
		cr.shortdescription();
		cr.eventsave();
	}
@When("^upload document in Master library$")
	public void upload_document_in_Master_library() throws Throwable {
		Homepagefunctions cr = new Homepagefunctions(d1);
		StrategyDocs doc = new StrategyDocs(d1);
		ArrayList<String> tabs = new ArrayList<String> (d1.getWindowHandles());
		d1.switchTo().window(tabs.get(0)); //switches to new tab
		d1.get("https://ahf365.sharepoint.com/sites/AHFUAT/Support%20Documents");
		doc.uploadbtn();
		d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
		doc.choosebtn();
		Thread.sleep(2000);
		doc.okutton();
	}
@When("^Create carosal \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void create_carosal_and_and_and(String notification, String status, String name, String description) throws Throwable {
		Homepagefunctions cr = new Homepagefunctions(d1);
		StrategyDocs doc = new StrategyDocs(d1);
		cr.settingicon();
		cr.sitecontent();
		cr.portalhome();
		doc.uploadbtn();
		d1.switchTo().frame(d1.findElement(By.className("ms-dlgFrame")));
		doc.chooseimage();
		Thread.sleep(2000);
		doc.okutton();
		//d1.switchTo().frame(d1.findElement(By.cssSelector("a[href*='https://ahf365.sharepoint.com/sites/AHFUAT/_layouts/15/Upload.aspx?List={F223C307-2A46-4373-9D43-FB40C4AF23F4}&RootFolder=&IsDlg=1']")));
		cr.notificationtitle(notification);
		cr.status(status);
		cr.name(name);
		cr.description(description);
		cr.checkin();
		cr.AHFhomelink();
	}
}
