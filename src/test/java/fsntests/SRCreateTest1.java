package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SRCreateTest1 {
	WebDriver driver;
	LoginPOF LoginPage;
	SRCreate SRCreatePage;
	Utilities UtilClass;
	TopMenusPOF TopMenu;
	HomePagePOFSC ServiceCenterHome;

	@BeforeSuite
	public void beforeTest() {
		Utilities.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get("about:blank");
		// initiating elements in page factory
		LoginPage = PageFactory.initElements(Utilities.driver, LoginPOF.class);
		SRCreatePage = PageFactory.initElements(Utilities.driver, SRCreate.class);
		TopMenu = PageFactory.initElements(Utilities.driver, TopMenusPOF.class);
		ServiceCenterHome = PageFactory.initElements(Utilities.driver, HomePagePOFSC.class);
		/*
		 * LoginPage.sendUserName("ebluth"); LoginPage.sendPassword("password");
		 * LoginPage.clicksubmit(); LoginPage.USclick();
		 */

	}

	@BeforeMethod
	public void beforemethod() {
		Utilities.driver.get(Utilities.MYFSNURL);

	}

	@Test(priority = 1)
	public void SRPageNavigationTest() {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SRCreatePage.NavigateToSRCreate();
		TopMenu.Logoutcust();

	}

	@Test(priority = 2)
	public void SRCreateTest() throws InterruptedException {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
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
		SRCreatePage.LOSAlertCheck();
		SRCreatePage.SubmitSR();
		SRCreatePage.SRDetailCheckClient();
		TopMenu.Logoutcust();

	}

	@Test(priority = 3)
	public void SRCreateBioHazardAlertTest() throws InterruptedException {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
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
		TopMenu.Logoutcust();

	}

	@Test(priority = 4)
	public void SRCreateBioChemDisposalAlertTest() throws InterruptedException {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
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
		TopMenu.Logoutcust();

	}

	@Test(priority = 5)
	public void SRCreateBioChemSpillAlertTest() throws InterruptedException {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
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
		TopMenu.Logoutcust();

	}

	@Test(priority = 6)
	public void SRCreateDynamicScriptingTest() throws InterruptedException {
		LoginPage.sendUserNameMSI("MSI01");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		SRCreatePage.NavigateToSRCreateWithbtn();
		SRCreatePage.SiteSelect();
		SRCreatePage.SearchReasonForCall();
		SRCreatePage.SelectAreaMSI01();
		SRCreatePage.SelectSubAreaMSI01();
		SRCreatePage.DSQuestionAnswerA1();
		SRCreatePage.SelectReasonForCallMSI01();
		SRCreatePage.EnterRequestByInfo();
		SRCreatePage.EnterDetailedDescription();
		SRCreatePage.SubmitSR();
		SRCreatePage.SRDetailCheckClient();
		TopMenu.Logoutcust();

	}

	@Test(invocationCount = 5, enabled=false)
	public void SRSetup() throws InterruptedException {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SRCreatePage.NavigateToSRCreateWithbtn();
		SRCreatePage.SRCreationTestHVAC();
	}

	@Test(priority = 7)
	public void SRCreateServicecentertestNoDS() throws InterruptedException {
		LoginPage.sendUserNameServiceCenter("ServiceCenter");
		LoginPage.sendPassword("Password");
		LoginPage.clicksubmit();
		ServiceCenterHome.navigatetoSRCreate();
		SRCreatePage.SelectCustomerStarbucks();
		SRCreatePage.SiteSelectSpecific();
		SRCreatePage.TypeOfServiceSDSelectionNoDS();
		SRCreatePage.WorkOrderInput();
		SRCreatePage.EnterRequestByInfo();
		SRCreatePage.EnterDetailedDescription();
		SRCreatePage.SubmitSR();
		SRCreatePage.SRCheckServiceCenter();
		TopMenu.Logoutservicecenter();

	}

	@Test(priority = 8)
	public void SRCreateServicecentertestDS() throws InterruptedException {
		LoginPage.sendUserNameServiceCenter("ServiceCenter");
		LoginPage.sendPassword("Password");
		LoginPage.clicksubmit();
		ServiceCenterHome.navigatetoSRCreate();
		SRCreatePage.SelectCustomerMSI01();
		SRCreatePage.SiteSelect();
		SRCreatePage.SearchReasonForCall();
		SRCreatePage.SelectAreaMSI01();
		SRCreatePage.SelectSubAreaMSI01();
		SRCreatePage.DSQuestionAnswerA1();
		SRCreatePage.SelectReasonForCallMSI01();
		SRCreatePage.EnterRequestByInfo();
		SRCreatePage.EnterDetailedDescription();
		SRCreatePage.SubmitSR();
		SRCreatePage.SRCheckServiceCenter();
		TopMenu.Logoutservicecenter();

	}

	/*
	 * @Test public void DSQuestionNoteTest() {
	 * 
	 * }
	 * 
	 * @Test public void DSAutoCloseCategorySelectTest() {
	 * 
	 * }
	 * 
	 * @Test public void DSShortDescriptionFilterTest() {
	 * 
	 * }
	 */

	@AfterMethod
	public void AfterTest() {
		//Log out method contained in test methods 
		 //TopMenu.Logoutcust();

	}

	/*@AfterSuite
	public void afterTest() {
		Utilities.driver.quit();
	}*/

}
