package fsntests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class RTPInvoiceTest {
	WebDriver driver;
	LoginPOF LoginPage;
	SRCreate SRCreatePage;
	ServiceRequestDetail Invoicing;
	InvoicePOFSC InvoicingSC;
	HomePagePOF HomePage;
	HomepageRTP HomeRTP;
	Utilities UtilClass;
	private String SRReference;
	
	@BeforeSuite
	public String beforeSuite() throws InterruptedException {
		if (SRReference!=null)
			return SRReference; 
		/*SRCreate.webdrive();
		InvoicingPOF.webdrive();
		HomePagePOFSC.webdrive();*/
		
		// SRCreate.driver = new ChromeDriver();
		Utilities.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get(Utilities.MYFSNURL);
		// initiating elements in page factory
		SRCreatePage = PageFactory.initElements(Utilities.driver, SRCreate.class);
		LoginPage = PageFactory.initElements(Utilities.driver, LoginPOF.class);
		Invoicing = PageFactory.initElements(Utilities.driver, ServiceRequestDetail.class);
		HomePage = PageFactory.initElements(Utilities.driver, HomePagePOF.class);
		HomeRTP = PageFactory.initElements(Utilities.driver, HomepageRTP.class);
		InvoicingSC = PageFactory.initElements(Utilities.driver, InvoicePOFSC.class);

		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		SRCreatePage.NavigateToSRCreateWithbtn();
		SRCreatePage.SRCreationTestHVAC();
		String srnumber = SRCreatePage.SRNumber.getText();
		LoginPage.Logout();
		LoginPage.sendUserNameSP("4335701");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.SPSRSearch(srnumber);
		Thread.sleep(3000);
		Invoicing.ActivtityCompletition();
		HomePage.HomePageNaviate();
		LoginPage.SPSRSearch(srnumber);
		Invoicing.InvoiceCreate();
		Invoicing.InvoiceBillingRequirementCompletion(SRReference);
		Invoicing.SPInvoiceWorkPerformed();
		Invoicing.SPInvoiceLaboraPartsandSummary();
		Invoicing.SPInvoiceAttachment();
		Invoicing.InvoiceConfirmation();
		LoginPage.LogoutSP();
		LoginPage.sendUserNameRTP();
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		SRReference=srnumber;
		return srnumber;
	}
	
	@BeforeTest
	public void beforeTest() {
	}
	
	
	@Test
	public void f() throws InterruptedException {
	HomeRTP.NavigateToInvoice(SRReference);
	InvoicingSC.InvoiceBillingRequirementCompletion(SRReference);
	InvoicingSC.NextStep();
    //InvoicingSC.FileAttachment();
	InvoicingSC.SummaryPageValidation();
	
	
    
	
	}

	

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	

}
