package Documentuploads;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StrategyDocs {

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl40_g_136aab47_889c_4143_a322_8b29b525f3e9\"]/div/div[1]/div[2]/a/figure/img")
	 private  WebElement ProspectingDoc;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"QCB1_Button2\"]")
	private WebElement Uploadbtn;
	
	@FindBy(how = How.ID, using = "ctl00_PlaceHolderMain_UploadDocumentSection_ctl05_InputFile")
	 private  WebElement choosebtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_PlaceHolderMain_ctl04_RptControls_btnOK\"]")
	 private  WebElement okbutton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"zz11_RootAspMenu\"]/li[1]/a")
	 private  WebElement projectlink;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl40_g_136aab47_889c_4143_a322_8b29b525f3e9\"]/div/div[1]/div[3]/a/figure/img")
	 private  WebElement DiligenceDoc;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl40_g_136aab47_889c_4143_a322_8b29b525f3e9\"]/div/div[1]/div[4]/a/figure/img")
	 private  WebElement NegotiationDoc;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl40_g_136aab47_889c_4143_a322_8b29b525f3e9\"]/div/div[1]/div[5]/a/figure/img")
	 private WebElement TransitionDoc;
	 
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ctl40_g_136aab47_889c_4143_a322_8b29b525f3e9\"]/div/div[1]/div[6]/a/figure/img")
	 private WebElement PerformanceMonitoringDoc;
	
	@FindBy(how = How.LINK_TEXT, using = "Project Documents")
	 private WebElement projectdoc;

	public StrategyDocs(WebDriver d1) {
		PageFactory.initElements(d1, this);
		}
	
	public void prospectingdoc() {
		ProspectingDoc.click();
	}
	public void diligencedoc() {
		DiligenceDoc.click();
	}
	public void negotiationdoc() {
		NegotiationDoc.click();
	}
	public void transitiondoc() {
		TransitionDoc.click();
	}
	public void performancemonitoringdoc() {
		PerformanceMonitoringDoc.click();
	}
	public void uploadbtn() {
		Uploadbtn.click();
	}
	public void okutton() {
		okbutton.click();
	}
	public void choosebtn() {
		choosebtn.sendKeys("E:\\Java Basics.docx");
	}
	public void chooseimage() {
		choosebtn.sendKeys("C:\\Users\\khemalatha\\Desktop\\different smileys\\images (1).jpeg");
	}
	public void projectlink() {
		projectlink.click();
	}
	public void projectdoc1() {
		projectdoc.click();
	}
	//Runtime.getRuntime().exec("E:/Fileupload.exe");
	
	
	
}
