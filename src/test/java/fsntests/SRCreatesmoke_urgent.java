package fsntests;

import fsnpof.*;
import org.testng.annotations.Test;
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

public class SRCreatesmoke_urgent {
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

	@BeforeTest
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


	
	@Test(priority = 1)
	public void ConfirmCorporateSRCreate_urgent() throws InterruptedException {
		
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
		SRCreatePage.SRDetailCheckClient();
		

	}
	
	@Test(priority = 2)
	public void BioHazardAlertTest_High() throws InterruptedException {
	LoginPage.ProdLoginEbluth();
	LoginPage.clicksubmit();
	LoginPage.USclick();
	SRCreatePage.NavigateToSRCreateWithbtn();
	SRCreatePage.SiteSelect();
	SRCreatePage.SelectArea();
	SRCreatePage.SelectSubArea();
	SRCreatePage.LOSHazardousMaterialSelect();
	SRCreatePage.DSQuestionAnswerA1();
	SRCreatePage.ReasonForCallSelectBioHazard();
	SRCreatePage.HazardousMaterialAlertCheck();
	
	
	}
	
	@Test(priority = 3)
	public void ChemicalSpillAlertTest_High() throws InterruptedException {
	LoginPage.ProdLoginEbluth();
	LoginPage.clicksubmit();
	LoginPage.USclick();
	SRCreatePage.NavigateToSRCreateWithbtn();
	SRCreatePage.SiteSelect();
	SRCreatePage.SelectArea();
	SRCreatePage.SelectSubArea();
	SRCreatePage.LOSHazardousMaterialSelect();
	SRCreatePage.DSQuestionAnswerA1();
	SRCreatePage.ChemicalSpillAlertcheckReasonForCallSelect();
	SRCreatePage.HazardousMaterialAlertCheck();
	
	}
	
	@Test(priority = 4)
	public void ChemicalDisposalAlertTest_High() throws InterruptedException {
	LoginPage.ProdLoginEbluth();
	LoginPage.clicksubmit();
	LoginPage.USclick();
	SRCreatePage.NavigateToSRCreateWithbtn();
	SRCreatePage.SiteSelect();
	SRCreatePage.SelectArea();
	SRCreatePage.SelectSubArea();
	SRCreatePage.LOSHazardousMaterialSelect();
	SRCreatePage.DSQuestionAnswerA1();
	SRCreatePage.ChemicalDisposalReasonForCallSelect();
	SRCreatePage.HazardousMaterialAlertCheck();
	
	}

	/*@AfterMethod
	public void afterTest() throws InterruptedException {
	TopMenu.Logoutcust();
	
	
	}

	@AfterSuite
	public void afterSuite() {
	Utilities.driver.quit();
	}*/

}
