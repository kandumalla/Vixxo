package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SiteHistoryTest {
	WebDriver driver;
	LoginPOF LoginPage;
	SiteHistoryPOF SiteHistoryPage;
	
	
	@BeforeTest
	public void beforeTest() {
		SiteHistoryPOF.webdrive();
		//driver = new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(SiteHistoryPOF.driver, 30), this);
		SiteHistoryPOF.driver.get(Utilities.MYFSNURL);
		//initiating elements in page factory 
		SiteHistoryPage= PageFactory.initElements(SiteHistoryPOF.driver, SiteHistoryPOF.class);
		LoginPage= PageFactory.initElements(SiteHistoryPOF.driver, LoginPOF.class);
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
	}


	@Test (priority=1)
	public void SiteHistoryNavigationTest() throws InterruptedException {
		SiteHistoryPage.SearchSiteTextBoxinput();
	}
	
	@Test (priority=2)
	public void SRDetailValidation() {
		SiteHistoryPage.SRDetailConfirmation();
		Assert.assertTrue(SiteHistoryPOF.driver.getCurrentUrl().contains("SRdetail.aspx?"), "Taken to incorrect page");
	}
	
	@Test (priority=3)
	public void EmailValidation() {
		SiteHistoryPage.ContactEmailValidation();
	}

	@AfterTest
	public void afterTest() {
	}

}
