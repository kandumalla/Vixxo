package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class QuotesEstimatesTest {
	static WebDriver driver;
	QuotesEstimatesPOF QuotesEstimatesPage;
	LoginPOF LoginPage;
	Utilities UtilClass;

	@BeforeTest
	public void beforeTest() {
		Utilities.webdrive();
		//driver=new ChromeDriver();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get(Utilities.MYFSNURL);
		// initiating elements in page factory
		QuotesEstimatesPage = PageFactory.initElements(Utilities.driver, QuotesEstimatesPOF.class);
		LoginPage = PageFactory.initElements(Utilities.driver, LoginPOF.class);

		LoginPage.sendUserNamePETMUS();
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();

	}

	@Test(priority = 1) // (enabled = false) // Feature does not work
						// appropriately in dev
						// environment
	public void QuoteApprovalOptionsTest() {
		QuotesEstimatesPage.Quotebtnclick1();
		QuotesEstimatesPage.NeedingApprovalclick1();
		QuotesEstimatesPage.NeedingApprovalSR1click();
		QuotesEstimatesPage.QuoteStatusoptionConfirmation();

	}

	@Test(priority = 3) // (enabled = false) // Feature does not work
						// appropriately in dev
						// environment
	public void QuoteApprovedTest() {
		QuotesEstimatesPage.NeedingApprovalSR1click();
		QuotesEstimatesPage.QuoteStatusApproval();

	}

	@Test(priority = 1) // (enabled = false) Feature does not work appropriately
						// in dev
						// environment
	public void QuoteDeclinedtest() {
		QuotesEstimatesPage.NeedingApprovalSR2click();
		QuotesEstimatesPage.QuoteStatusDecline();

	}

	@Test(priority = 4) // (enabled = false) Feature does not work appropriately
						// in dev
	// environment
	public void QuoteRequestRevisionstest() {
		QuotesEstimatesPage.NeedingApprovalSR2click();
		QuotesEstimatesPage.QuoteStatusRequestRevisions();

	}

	@AfterMethod
	public void afterMethod() {
		if (QuotesEstimatesPOF.driver.getCurrentUrl().contains("fsndevweb:81")) {
			QuotesEstimatesPOF.driver.get("http://fsndevweb:81/srlist.aspx?rt=qsubmitted");
		} else
			QuotesEstimatesPOF.driver.get("http://fsndevweb/srlist.aspx?rt=qsubmitted");

	}

	@AfterTest
	public void afterTest() {
	}

}
