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

	@BeforeSuite
	public void beforeSuite() {
		Utilities.webdrive();
		// setting global explicit wait
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
		SRCreatePage.SRCheck();
		

	}
/*
	@AfterMethod
	public void afterTest() throws InterruptedException {
	TopMenu.Logout();
	
	
	}*/

	@AfterSuite
	public void afterSuite() {
	//Utilities.driver.quit();
	}

}
