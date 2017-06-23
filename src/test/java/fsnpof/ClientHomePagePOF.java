package fsnpof;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//id="ctl00_ContentPlaceHolder1_lblCallStatus"
public class ClientHomePagePOF {
	@FindBy (id="ctl00_Menu1_14")
	WebElement LogOutbtn;
	@FindBy (id="ctl00_lblPageTitle")
	WebElement HomePageTitle;
public void Logout (){
LogOutbtn.click();
	
}


public void HomePageCheck(){
String ActualTitle = HomePageTitle.getText();
Assert.assertTrue(HomePageTitle.getText().contains("Welcome"), "Expected {Page Title}{Welcome} Actual {Page Title}=" + ActualTitle);
	
}
	// Call Status same ID for all
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement CallStatus;

	// Service Request Bucket
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement SRAwaitingETABucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement SRConfirmedETABucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement ProblemETABucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement SROnsiteBucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl04_HyperlinkCatDet")
	WebElement SRAdditionalWorkBucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl05_HyperlinkCatDet")
	WebElement SRPartOrderBucket;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl06_HyperlinkCatDet")
	WebElement PriorityStoreContactBucket;

	// after clicking into bucket sub status
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRAwaitingETABucketAssert;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRConfirmedAssert;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SROnsiteAssert;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRAdditionalWorkAssert;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblCallStatus")
	WebElement SRPartOrderAssert;

	// Quotes.Estimates Bucket
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_ImageExpCol")
	WebElement Quotesbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement UnderReview;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl01_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement NeedsApprovalQuote;
	@FindBy(id = "ctl00_ContentPlaceHolder1_rptrSRData_ctl03_hlSR#")
	WebElement NeedsApprovalSRApprove;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlQapproval")
	WebElement QuoteStatusDropDown;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnQapprovall")
	WebElement QuoteStatusSubmit;
	@FindBy(id = "ctl00_ContentPlaceHolder1_rptrSRData_ctl04_hlSR#")
	WebElement NeedsApprovalSRDecline;
	@FindBy(id = "ctl00_ContentPlaceHolder1_quotesGrid_ctl02_quoteDetailsLink")
	WebElement QuoteDetailLink;

	// ctl00_ContentPlaceHolder1_lblQuoteStatus
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnQapprovall")
	WebElement StatusConfirmation;

	// Completed Requests Bucket
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_ImageExpCol")
	WebElement CompletedRequestsbtn;
	@FindBy(xpath = "//*[contains(text(),'Web Document In Transit')]")
	WebElement WebDocumentsinTransit;
	@FindBy(xpath = "//*[contains(text(),'To Be Billed')]")
	WebElement ToBeBilled;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_RepeaterReqCatDetails_ctl02_lbCompleted_Billed")
	WebElement Billed;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl02_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement Other;
	@FindBy(id="frmCapexPopup")
	WebElement BilledcapexFrame;
	@FindBy(xpath="//*[@id='form1']/div[3]/input[3]")
	WebElement Okbtncapex;
	
	public void ClearBilledCapexFrame (){
	Utilities.driver.switchTo().frame(BilledcapexFrame);
	Okbtncapex.click();
    Utilities.driver.switchTo().defaultContent();
		
	}
	



	// RFPs in Progress
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_ImageExpCol")
	WebElement RFPinProgressbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement Created;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement Submitted;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement ResponseReceived;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl03_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement NeedsApprovalrfp;

	// CompletedRFPs
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_ImageExpCol")
	WebElement CompletedRfpbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement ApprovedRfp;
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl04_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement CancelledRfp;
	

	// PMs
	@FindBy(id = "ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl05_HyperlinkCat")
	WebElement PMbtn;

	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;

	}

	// METHODS
	// Service Requests In Progress Methods

	public void AwaitingEtabucket() {
		SRAwaitingETABucket.click();

	}

	public void ConfirmedETAbucket() {
		SRConfirmedETABucket.click();
	}

	public void Onsitebucket() {
		SROnsiteBucket.click();
	}

	public void Additionalworkbucket() {
		SRAdditionalWorkBucket.click();
	}

	public void PartsOnOrderBucket() {
		SRPartOrderBucket.click();
	}

	public void ProblemETABucket() {
		ProblemETABucket.click();

	}

	public void PSCBucket() {
		PriorityStoreContactBucket.click();

	}
	public void WebDocumentInTransitBucket(){
	WebDocumentsinTransit.click();
	}

	//
	public void AwaitingEtabucketAssertion() {
		Assert.assertTrue(SRAwaitingETABucketAssert.getText().contains("Awaiting ETA"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void ConfirmedETAbucketAssertion() {
		Assert.assertTrue(SRConfirmedAssert.getText().contains("Confirmed ETA"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void OnsitebucketAssertion() {
		Assert.assertTrue(SROnsiteAssert.getText().contains("On Site"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void AdditionalworkbucketAssertion() {
		Assert.assertTrue(SRAdditionalWorkAssert.getText().contains("Additional Work Needed"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void PartsOnOrderBucketAssertion() {
		Assert.assertTrue(SRPartOrderAssert.getText().contains("Parts on Order"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void ProblemETAssertion() {
		Assert.assertTrue(CallStatus.getText().contains("Problem ETA"),
				"Incorrect Page, SR list does not match status selected ");
	}

	public void PriorityStoreContactAssertion() {
		Assert.assertTrue(CallStatus.getText().contains("Priority Store Contact"),
				"Incorrect Page, SR list does not match status selected ");
	}
	public void WebDocumentInTransitAssertion() {
		Assert.assertTrue(CallStatus.getText().contains("Web Document In Transit"),
				"Incorrect Page, SR list does not match status selected ");
	}

	// Quotes.Estimates Methods
	public void Quotebtnclick() {
		Quotesbtn.click();
	}

	public void UnderReviewclick() {
		UnderReview.click();
	}

	public void NeedingApprovalclick() {
		NeedsApprovalQuote.click();
	}

	public void NeedingApprovalSR1click() {
		NeedsApprovalSRApprove.click();
	}

	public void NeedingApprovalSR2click() {
		NeedsApprovalSRDecline.click();
	}

	

	public void UnderReviewassert() {
		Assert.assertTrue(CallStatus.getText().contains("Under FSN Review"),
				"Incorrect Page, SR list does not match status selected ");

	}

	public void NeedingApprovalassert() {
		Assert.assertTrue(CallStatus.getText().contains("Needing Approval"),
				"Incorrect Page, SR list does not match status selected ");

	}

	public void QuoteStatusoptionConfirmation() {
		QuoteDetailLink.click();
		Select Quotestatusdd = new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Decline");
		QuoteStatusDropDown.click();
		Quotestatusdd.selectByVisibleText("Request Revised Quote");
		QuoteStatusDropDown.click();
		Quotestatusdd.selectByVisibleText("Approve");

	}

	public void QuoteStatusApproval() {
		QuoteDetailLink.click();
		Select Quotestatusdd = new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Approve");
		QuoteStatusSubmit.click();
		Assert.assertTrue(StatusConfirmation.getText().contains("Approve"),
				"Approval Status selected does not match approval status on confirmatikon page");

	}

	public void QuoteStatusDecline() {
		QuoteDetailLink.click();
		Select Quotestatusdd = new Select(QuoteStatusDropDown);
		Quotestatusdd.selectByVisibleText("Decline");
		QuoteStatusSubmit.click();
		Assert.assertTrue(StatusConfirmation.getText().contains("Decline"),
				"Approval Status selected does not match approval status on confirmatikon page");

	}
	
	// Completed Requests Methods

	public void completedrequestsclick() {
		CompletedRequestsbtn.click();

	}

	public void Tobebilledclick() {
		ToBeBilled.click();

	}

	public void TobebilledAssertion() {
		Assert.assertTrue(CallStatus.getText().contains("Completed (To Be Billed)"),
				"Incorrect Page, SR list does not match status selected ");

	}

	public void billedclick() {
		Billed.click();

	}

	public void billedassertion() {
		Assert.assertTrue(CallStatus.getText().contains("Completed (Billed)"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	public void otherclick() {
		Other.click();

	}
	WebDriverWait wait = new WebDriverWait(Utilities.driver, 60);
	public void Otherassertion() {
		wait.until(ExpectedConditions.visibilityOf(CallStatus));
		Assert.assertTrue(CallStatus.getText().contains("Completed (Other)"),
				"Incorrect Page, SR list call status does not match status selected ");

	}
	public void PriorityStoreContactassertion() {
		Assert.assertTrue(CallStatus.getText().contains("Completed (Other)"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	// RFPs in progress method
	public void RFPinProgressbtnclick() {
		RFPinProgressbtn.click();

	}

	public void CreatedClick() {
		Created.click();

	}

	public void SubmittedClick() {
		Submitted.click();

	}

	public void ResponseReceivedClick() {
		ResponseReceived.click();

	}

	public void NeedsApprovalClickrfp() {
		NeedsApprovalrfp.click();

	}

	public void Createdassertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	public void Submittedassertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custsrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	public void ResponseReceivedassertion() {
		String url = driver.getCurrentUrl();
		url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custsrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	public void NeedsApprovalrfpssertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custprfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	// Completed RFPs Methods
	public void CompletedRFPsclick() {
		CompletedRfpbtn.click();
	}

	public void Approvedclick() {
		ApprovedRfp.click();
	}

	public void Cancelledclick() {
		CancelledRfp.click();
	}

	public void Approvedrfpassertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	public void Canceledrfpassertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

	}

	// PM Method
	public void PMclick() {
		PMbtn.click();
	}

	public void PMassertion() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/CommonObjects/PMBucketsByMonths.aspx"),
				"Incorrect Page, SR list call status does not match status selected ");

	}
	public void PriorityStoreContact (){
		
	}
}
