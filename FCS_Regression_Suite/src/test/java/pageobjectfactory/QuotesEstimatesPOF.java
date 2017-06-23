package pageobjectfactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert; 


public class QuotesEstimatesPOF {
	@FindBy (id="ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement CallStatus;

	
	//Quotes.Estimates Bucket 
		@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_ImageExpCol")
		WebElement Quotesbtn;
		@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
		WebElement UnderReview;
		@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
		WebElement NeedsApprovalQuote;
		@FindBy (id="ctl00_ContentPlaceHolder1_rptrSRData_ctl03_hlSR#")
		WebElement NeedsApprovalSRApprove;
		@FindBy (id="ctl00_ContentPlaceHolder1_rptrSRData_ctl04_hlSR#")
		WebElement NeedsApprovalSRDecline;
		@FindBy (id="ctl00_ContentPlaceHolder1_ddlQapproval")
		WebElement QuoteStatusDropDown;
		@FindBy (id="ctl00_ContentPlaceHolder1_btnQapprovall")
		WebElement QuoteStatusSubmit;
		@FindBy (id="ctl00_ContentPlaceHolder1_quotesGrid_ctl02_quoteDetailsLink")
		WebElement QuoteDetailLink;
		@FindBy (id="ctl00_ContentPlaceHolder1_btnQapprovall")
		WebElement StatusConfirmation;
	
	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;
	}

	//Quotes.Estimates Methods 
	public void Quotebtnclick1 (){
		Quotesbtn.click();
	}


	public void UnderReviewclick1(){
	UnderReview.click();
	}

	public void NeedingApprovalclick1(){
	NeedsApprovalQuote.click();
	}
	public void NeedingApprovalSR1click(){
		NeedsApprovalSRApprove.click();
	}

	public void NeedingApprovalSR2click(){
		NeedsApprovalSRDecline.click();
	}



	public void QuoteStatusoptionConfirmation(){
		QuoteDetailLink.click();
		Select Quotestatusdd= new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Decline");
		QuoteStatusDropDown.click();
		Quotestatusdd.selectByVisibleText("Request Revised Quote");
		QuoteStatusDropDown.click();
		Quotestatusdd.selectByVisibleText("Approve");

		
	}

	public void QuoteStatusApproval(){
		QuoteDetailLink.click();
		Select Quotestatusdd= new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Approve");
		QuoteStatusSubmit.click();
		Assert.assertTrue(StatusConfirmation.getText().contains("Approve"), "Approval Status selected does not match approval status on confirmatikon page");

	}

	public void QuoteStatusDecline(){
		QuoteDetailLink.click();
		Select Quotestatusdd= new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Decline");
		QuoteStatusSubmit.click();
		Assert.assertTrue(StatusConfirmation.getText().contains("Decline"), "Approval Status selected does not match approval status on confirmatikon page");
		
	}

}
