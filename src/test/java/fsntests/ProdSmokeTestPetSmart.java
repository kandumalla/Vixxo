package fsntests;

import fsnpof.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class ProdSmokeTestPetSmart {
	WebDriver driver;
	LoginPOF LoginPage;
	SRCreate SRCreatePage;
	ServiceRequestDetail Invoicing;
	InvoicePOFSC InvoicingSC;
	HomePagePOF HomePage;
	HomePagePOFSC HomePageSC;
	Utilities UtilClass;
	SiteHistoryPOF SiteHistoryPage;
	ClientHomePagePOF ClientHomePage;
	TopMenusPOF TopMenu;
	ClientHomePagePOF RequestsataGlance;
	QuotesEstimatesPOF QuotesEstimatesPage;

	@BeforeSuite
	public void beforeSuite() {
		Utilities.webdrive();
		// setting global implicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get("about:blank");
		// initiating elements in page factory
		SRCreatePage = PageFactory.initElements(Utilities.driver, SRCreate.class);
		LoginPage = PageFactory.initElements(Utilities.driver, LoginPOF.class);
		Invoicing = PageFactory.initElements(Utilities.driver, ServiceRequestDetail.class);
		HomePage = PageFactory.initElements(Utilities.driver, HomePagePOF.class);
		HomePageSC = PageFactory.initElements(Utilities.driver, HomePagePOFSC.class);
		InvoicingSC = PageFactory.initElements(Utilities.driver, InvoicePOFSC.class);
		SiteHistoryPage = PageFactory.initElements(Utilities.driver, SiteHistoryPOF.class);
		ClientHomePage = PageFactory.initElements(Utilities.driver, ClientHomePagePOF.class);
		TopMenu = PageFactory.initElements(Utilities.driver, TopMenusPOF.class);
		RequestsataGlance = PageFactory.initElements(Utilities.driver, ClientHomePagePOF.class);
		QuotesEstimatesPage = PageFactory.initElements(Utilities.driver, QuotesEstimatesPOF.class);
		
		
	}

	@BeforeMethod
	public void beforeTest() throws InterruptedException {

		Utilities.driver.get(Utilities.MYFSNPRODURL);
	
		
		
	}

	@Test(priority = 1)
	public void ConfirmCoporateUserLogin() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.AccountListCheck();
		LoginPage.USclick();
		ClientHomePage.HomePageCheck();
	}

	@Test(priority = 2)
	public void AwaitingETAtest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.AwaitingEtabucket();
		RequestsataGlance.AwaitingEtabucketAssertion();
		 
	}

	@Test(priority = 3)
	public void ConfirmedETATest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.ConfirmedETAbucket();
		RequestsataGlance.ConfirmedETAbucketAssertion();
		 
	}

	@Test(priority = 3)
	public void OnsiteTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Onsitebucket();
		RequestsataGlance.OnsitebucketAssertion();
		 
	}
	
	@Test(priority = 4)
	public void ProblemETATest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.ProblemETABucket();
		RequestsataGlance.ProblemETAssertion();
		 
		}

	@Test(priority = 5)
	public void AdditionalworkTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Additionalworkbucket();
		RequestsataGlance.AdditionalworkbucketAssertion();
		 
	}

	@Test(priority = 6)
	public void PartsonOrderTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.PartsOnOrderBucket();
		RequestsataGlance.PartsOnOrderBucketAssertion();
		 
	}
	
	@Test(priority = 7)
	public void PriorityStoreContactTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.PSCBucket();
		RequestsataGlance.PriorityStoreContactAssertion();
		 
	}


	@Test(priority = 8)
	public void QuotesUnderReviewTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.UnderReviewclick();
		RequestsataGlance.UnderReviewassert();
		 

	}

	@Test(priority = 9)
	public void QuotesNeedingApprovalTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.NeedingApprovalclick();
		RequestsataGlance.NeedingApprovalassert();
		 
	}
	@Test(priority = 10)
	public void WebDocumentsInTransitTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.WebDocumentInTransitBucket();
		RequestsataGlance.WebDocumentInTransitAssertion();
	
	}
	
	@Test(priority = 11)
	public void CompletedSRsToBeBilledTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.Tobebilledclick();
		RequestsataGlance.TobebilledAssertion();
	
	}
//**************Pending Bug fix*****************
	@Test(enabled=false)
	public void CompletedSRsBilledTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.billedclick();
		RequestsataGlance.ClearBilledCapexFrame();
		RequestsataGlance.billedassertion();
//***********************************************

	}

	@Test(priority = 13)
	public void CompletedSRsOtherTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.otherclick();
		RequestsataGlance.Otherassertion();
	

	}
	@Test(priority = 14)
	public void QuoteApprovalOptionsTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		QuotesEstimatesPage.Quotebtnclick1();
		QuotesEstimatesPage.NeedingApprovalclick1();
		QuotesEstimatesPage.NeedingApprovalSR1click();
		QuotesEstimatesPage.QuoteStatusoptionConfirmation();

	}
	
	@Test(priority = 15)
	public void ConfirmCorporateSRCreate() throws InterruptedException {
		
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SRCreatePage.NavigateToSRCreateWithbtn();
		SRCreatePage.SiteSelect();
		SRCreatePage.SelectArea();
		SRCreatePage.SelectSubArea();
		SRCreatePage.SelectTypeofService();
		SRCreatePage.SelectReasonForCall();
		SRCreatePage.EnterRequestByInfo();
		SRCreatePage.EnterDetailedDescription();
		SRCreatePage.SubmitSR();
		SRCreatePage.SRCheckClient();
		

	}
	@Test (priority=16)
	public void SiteHistoryNavigationTest() throws InterruptedException {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SiteHistoryPage.SearchSiteTextBoxinput();
		SiteHistoryPage.searchresultscheck();
	}
	
	@Test (priority=17)
	public void SRDetailValidation() throws InterruptedException {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SiteHistoryPage.SearchSiteTextBoxinput();
		SiteHistoryPage.SRDetailNavigation();
		SiteHistoryPage.SRDetailAssertion();
		
	}
	
	@Test (priority=18)
	public void ServiceDetailEmailPageValidation() throws InterruptedException {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SiteHistoryPage.SearchSiteTextBoxinput();
		SiteHistoryPage.SRDetailNavigation();
		SiteHistoryPage.ContactEmailPageNavigate();
		SiteHistoryPage.ContactEmailPageConfirmation();
	}
	@Test (priority=19)
	public void SiteUserSRCreateSiteSelectionTest() throws InterruptedException {
		LoginPage.ProdLoginm0059();
		LoginPage.clicksubmit();
		SRCreatePage.NavigateToSRCreateWithbtn();
		SRCreatePage.SiteSelect();
		SRCreatePage.SiteAreaNotAvailableCheck();
		SRCreatePage.SiteSelectSpecific();
		SRCreatePage.SiteAreaAvailableCheck();
		
	}


	@AfterMethod
	public void afterTest() throws InterruptedException {
	TopMenu.Logout();
	
	
	}

	@AfterSuite
	public void afterSuite() {
	Utilities.driver.quit();
	}

}
