package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class ActivityManagementTests {
	WebDriver driver;
	LoginPOF LoginPage;
	SRCreate SRCreatePage;
	ServiceRequestDetail Invoicing;
	InvoicePOFSC InvoicingSC;
	HomePagePOF HomePage;
	HomePagePOFSC HomePageSC;
	Utilities UtilClass;
	//private String SRReference;
	
	
	@BeforeSuite
	public void beforeTest() throws InterruptedException {
		/*if (SRReference!=null)
			return SRReference; */
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
		HomePageSC = PageFactory.initElements(Utilities.driver, HomePagePOFSC.class);
		InvoicingSC = PageFactory.initElements(Utilities.driver, InvoicePOFSC.class);

	/*	LoginPage.sendUserName("ebluth");
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
		SRReference=srnumber;
		return srnumber;*/
	}
	

	@Test(priority = 1)
	public void SPInvoiceSubmissionTest() throws InterruptedException {
		LoginPage.sendUserNameSP("4335701");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		HomePage.NeedanETAClick();
		Invoicing.selectSRFromList();
		Thread.sleep(2000);
		Invoicing.captureCallStatus();
		Thread.sleep(2000);
		Invoicing.ETACaptureResponseSLA();
		System.out.println(Invoicing.getCallStatus() + Invoicing.getETAReference());
		
		
	

	}


	
		
		//Service Request search action would happen here 

	


	@AfterTest
	public void afterTest() {
		//driver.quit();

	}

}
// billing requirements method
// labor and materials method
// summary page method
// Logout method
// SClogin method
// Invoice que method
// SCbilling requrements method
// SC labor and materials method
// SC summary page method
// SC labor and materials update method
// SC summary page method
// SC confirmation method
// DB validation method
