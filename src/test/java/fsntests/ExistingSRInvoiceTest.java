package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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

public class ExistingSRInvoiceTest {
	WebDriver driver;
	LoginPOF LoginPage;
	ServiceRequestDetail Invoicing;
	SPRequestsATaGlancePOF SPBuckets;
	
	
	@BeforeTest
	public void beforeTest() {
		
		ServiceRequestDetail.webdrive();
		//Ourfsnlogin.driver=new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(ServiceRequestDetail.driver, 20), this);
		Utilities.driver.get(Utilities.MYFSNURL);
		//initiating elements in page factory 
		LoginPage= PageFactory.initElements(Utilities.driver, LoginPOF.class);
		Invoicing= PageFactory.initElements(Utilities.driver, ServiceRequestDetail.class);
		SPBuckets=PageFactory.initElements(Utilities.driver, SPRequestsATaGlancePOF.class);
		LoginPage.sendUserNameSP("Username");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		
	
	}

	@Test (priority = 1)
	public void SPInvoiceProcessTest() throws InterruptedException {
	String SRnumber = null;
	SPBuckets.NeedanInvoiceClick();
	Invoicing.SRSelect();
	Invoicing.InvoiceCreate();
	Invoicing.InvoiceBillingRequirementCompletion(SRnumber);
	//Invoicing.SPInvoiceWorkPerformedMSITravelandTruckChargeCheck();
	Invoicing.SPInvoiceLaboraPartsandSummary();
	Invoicing.SPInvoiceAttachment();
	

	}
	
	/*@Test
	public void SCInvoiceProcessTest() throws InterruptedException {
	LoginPage.sendUserNameServiceCenter("ServiceCenter");
	LoginPage.sendPassword("Password");
	

	}*/

	@AfterTest
	public void afterTest() {
		LoginPage.Logout();
	}

}
