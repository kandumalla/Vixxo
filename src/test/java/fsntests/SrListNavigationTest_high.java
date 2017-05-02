package fsntests;

import fsnpof.*;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.Log;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class SrListNavigationTest_high {
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

	@BeforeClass
	public void beforeSuite() {
		//Utilities.webdrive();
		// setting global implicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get(Utilities.MYFSNPRODURL);
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
		if (Utilities.driver.getCurrentUrl()!=Utilities.MYFSNPRODURL){
			Utilities.driver.navigate().to(Utilities.MYFSNPRODURL);
		}
	
		
		
	}

	

	@Test(priority = 6)
	public void AwaitingETAtest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.AwaitingEtabucket();
		RequestsataGlance.AwaitingEtabucketAssertion();
		 
	}

	@Test(priority = 7)
	public void ConfirmedETATest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.ConfirmedETAbucket();
		RequestsataGlance.ConfirmedETAbucketAssertion();
		 
	}

	@Test(priority = 8)
	public void OnsiteTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Onsitebucket();
		RequestsataGlance.OnsitebucketAssertion();
		 
	}
	
	@Test(priority = 9)
	public void ProblemETATest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.ProblemETABucket();
		RequestsataGlance.ProblemETAssertion();
		 
		}

	@Test(priority = 10)
	public void AdditionalworkTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Additionalworkbucket();
		RequestsataGlance.AdditionalworkbucketAssertion();
		 
	}

	@Test(priority = 11)
	public void PartsonOrderTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.PartsOnOrderBucket();
		RequestsataGlance.PartsOnOrderBucketAssertion();
		 
	}
	
	@Test(priority = 12)
	public void PriorityStoreContactTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.PSCBucket();
		RequestsataGlance.PriorityStoreContactAssertion();
		 
	}


	@Test(priority = 13)
	public void QuotesUnderReviewTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.UnderReviewclick();
		RequestsataGlance.UnderReviewassert();
		 

	}

	@Test(priority = 14)
	public void QuotesNeedingApprovalTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.Quotebtnclick();
		RequestsataGlance.NeedingApprovalclick();
		RequestsataGlance.NeedingApprovalassert();
		 
	}
	@Test(priority = 15)
	public void WebDocumentsInTransitTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.WebDocumentInTransitBucket();
		RequestsataGlance.WebDocumentInTransitAssertion();
	
	}
	
	@Test(priority = 16)
	public void CompletedSRsToBeBilledTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.Tobebilledclick();
		RequestsataGlance.TobebilledAssertion();
	
	}
//**************Pending Bug fix*****************
	@Test(enabled= true)
	public void CompletedSRsBilledTest() {
		System.out.println("Billed SR list is currently defective pending fix 2.20.17");
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.billedclick();
		RequestsataGlance.ClearBilledCapexFrame();
		RequestsataGlance.billedassertion();
		
//***********************************************

	}

	@Test(priority = 17)
	public void CompletedSRsOtherTest() {
		LoginPage.ProdLoginEbluth();
		LoginPage.clicksubmit();
		LoginPage.USclick();
		RequestsataGlance.completedrequestsclick();
		RequestsataGlance.otherclick();
		RequestsataGlance.Otherassertion();
	

	}
	


	@AfterMethod
	public void afterTest() throws InterruptedException {
	TopMenu.Logoutcust();
	
	
	}

	@AfterTest
	public void afterSuite() {
	//Utilities.driver.quit();
	}

}
