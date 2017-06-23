package fcstestingsuite.fsnrgn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectfactory.*;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class QuotesEstimatesTest {
	static WebDriver driver;
	QuotesEstimatesPOF QuotesEstimatesPage;
	Ourfsnlogin LoginPage;

	@BeforeTest
	public void beforeTest() {
		QuotesEstimatesPOF.webdrive();
		//driver=new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(QuotesEstimatesPOF.driver, 30), this);
		QuotesEstimatesPOF.driver.get("http://www.ourfsn.com/myfsn");
		//initiating elements in page factory 
		QuotesEstimatesPage= PageFactory.initElements(QuotesEstimatesPOF.driver, QuotesEstimatesPOF.class);
		LoginPage= PageFactory.initElements(QuotesEstimatesPOF.driver, Ourfsnlogin.class);

		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();	
		
	}

	@Test(enabled=false)//Feature does not work appropriately in dev environment 
	public void QuoteApprovalOptionsTest (){
		driver.get("http://www.ourfsn.com/myfsn/home.aspx");
		QuotesEstimatesPage.Quotebtnclick1();
		QuotesEstimatesPage.NeedingApprovalclick1();
		QuotesEstimatesPage.NeedingApprovalSR1click();
		QuotesEstimatesPage.QuoteStatusoptionConfirmation();
		
	}
	@Test(enabled=false)//Feature does not work appropriately in dev environment 
	public void QuoteApprovedTest (){
		driver.get("http://www.ourfsn.com/myfsn/srlist.aspx?rt=qsubmitted");
		QuotesEstimatesPage.NeedingApprovalSR1click();
	QuotesEstimatesPage.QuoteStatusApproval();
	
	}
	@Test(enabled=false)//Feature does not work appropriately in dev environment 
	public void QuoteDeclinedtest(){
driver.get("http://www.ourfsn.com/myfsn/srlist.aspx?rt=qsubmitted");
 QuotesEstimatesPage.NeedingApprovalSR2click();
 QuotesEstimatesPage.QuoteStatusDecline();

 
	}
	


	@AfterTest
	public void afterTest() {
	}

}
