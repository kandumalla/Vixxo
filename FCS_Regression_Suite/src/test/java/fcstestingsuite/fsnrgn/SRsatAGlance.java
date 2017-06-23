package fcstestingsuite.fsnrgn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageobjectfactory.*;

public class SRsatAGlance {
	static WebDriver driver;
	RequestsAtAGlancePOF RequestsataGlance;
	Ourfsnlogin LoginPage;

	@Test(priority = 1)
	public void AwaitingETAtest() {
		RequestsataGlance.AwaitingEtabucket();
		RequestsataGlance.AwaitingEtabucketAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();
	}

	@Test(priority = 2)
	public void ConfirmedETATest() {
		RequestsataGlance.ConfirmedETAbucket();
		RequestsataGlance.ConfirmedETAbucketAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();
	}

	@Test(priority = 3)
	public void OnsiteTest() {
		RequestsataGlance.Onsitebucket();
		RequestsataGlance.OnsitebucketAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();
	}

	@Test(priority = 4)
	public void AdditionalworkTest() {
		RequestsataGlance.Additionalworkbucket();
		RequestsataGlance.AdditionalworkbucketAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();
	}

	@Test(priority = 5)
	public void PartsonOrderTest() {
		RequestsataGlance.PartsOnOrderBucket();
		RequestsataGlance.PartsOnOrderBucketAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();
	}
	//

	@Test(priority = 6)
	public void QuotesUnderReviewTest() {
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.UnderReviewclick();
		RequestsataGlance.UnderReviewassert();
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 7)
	public void QuotesNeedingApprovalTest() {
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.NeedingApprovalclick();
		RequestsataGlance.NeedingApprovalassert();
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 8)
	public void CompletedSRsToBeBilledTest() {
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.Tobebilledclick();
		RequestsataGlance.TobebilledAssertion();
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 9)
	public void CompletedSRsBilledTest() {
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.billedclick();
		RequestsataGlance.billedassertion();
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 10)
	public void CompletedSRsOtherTest() {
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.otherclick();
		RequestsataGlance.Otherassertion();
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 11)
	public void RFPsCreatedStatusTest() {
		RequestsataGlance.RFPinProgressbtnclick();
		RequestsataGlance.CreatedClick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrrfp"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 12)
	public void RFPsSubmittedStatusTest() {
		RequestsataGlance.RFPinProgressbtnclick();
		RequestsataGlance.SubmittedClick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custsrfp"),
				"Incorrect Page, SR list call status does not match status selected ");

		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 13)
	public void RFPsResponseReceivedStatusTest() {
		RequestsataGlance.RFPinProgressbtnclick();
		RequestsataGlance.ResponseReceivedClick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custrrrfp"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 14)
	public void RFPsNeedsApprovalStatusTest() {
		RequestsataGlance.RFPinProgressbtnclick();
		RequestsataGlance.NeedsApprovalClickrfp();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custneedsApproval"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 15)
	public void CompletedRFPsApprovedStatusTest() {
		RequestsataGlance.CompletedRFPsclick();
		RequestsataGlance.Approvedclick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custcrfp"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 16)
	public void CompletedRFPsCancelledStatusTest() {
		RequestsataGlance.CompletedRFPsclick();
		RequestsataGlance.Cancelledclick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/RFP/RFPList.aspx?bucket=custccrfp"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();

	}

	@Test(priority = 17)
	public void PMStatusTest() {
		RequestsataGlance.PMclick();
		String url = RequestsAtAGlancePOF.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/CommonObjects/PMBucketsByMonths.aspx"),
				"Incorrect Page, SR list call status does not match status selected ");
		RequestsAtAGlancePOF.driver.navigate().back();
	}

	/*
	 * @Test(enabled=false)//Feature does not work appropriately in dev
	 * environment public void QuoteApprovalOptionsTest (){
	 * driver.get("http://www.ourfsn.com/myfsn/home.aspx");
	 * RequestsataGlance.Quotebtnclick();
	 * RequestsataGlance.NeedingApprovalclick();
	 * RequestsataGlance.NeedingApprovalSR1click();
	 * RequestsataGlance.QuoteStatusoptionConfirmation();
	 * 
	 * }
	 * 
	 * @Test(enabled=false)//Feature does not work appropriately in dev
	 * environment public void QuoteApprovedTest (){
	 * driver.get("http://www.ourfsn.com/myfsn/srlist.aspx?rt=qsubmitted");
	 * RequestsataGlance.NeedingApprovalSR1click();
	 * RequestsataGlance.QuoteStatusApproval();
	 * 
	 * }
	 * 
	 * @Test(enabled=false)//Feature does not work appropriately in dev
	 * environment public void QuoteDeclinedtest(){
	 * driver.get("http://www.ourfsn.com/myfsn/srlist.aspx?rt=qsubmitted");
	 * RequestsataGlance.NeedingApprovalSR2click();
	 * RequestsataGlance.QuoteStatusDecline();
	 * 
	 * 
	 * }
	 */

	@BeforeTest
	public void beforeTest() {
		RequestsAtAGlancePOF.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(RequestsAtAGlancePOF.driver, 20), this);
		RequestsAtAGlancePOF.driver.get("http://www.ourfsn.com/myfsn");
		// initiating elements in page factory
		RequestsataGlance = PageFactory.initElements(RequestsAtAGlancePOF.driver, RequestsAtAGlancePOF.class);
		LoginPage = PageFactory.initElements(RequestsAtAGlancePOF.driver, Ourfsnlogin.class);

		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();

	}

	@AfterTest
	// public void afterTest() { driver.quit();}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
