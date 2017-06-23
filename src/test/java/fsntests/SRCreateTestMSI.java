package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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


public class SRCreateTestMSI {
	WebDriver driver;
	LoginPOF LoginPage;
	SRCreate SRCreatePage;
	Utilities UtilClass;
	
	
	@BeforeTest
	public void beforeTest() {
		SRCreate.webdrive();
		//SRCreate.driver = new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get(Utilities.MYFSNURL);
		//initiating elements in page factory 
		LoginPage= PageFactory.initElements(Utilities.driver, LoginPOF.class);
		SRCreatePage= PageFactory.initElements(Utilities.driver, SRCreate.class);
		LoginPage.sendUserNameMSI("Username");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		
		
	}
	
    @BeforeMethod
    public void beforemethod (){
    	Utilities.driver.get(Utilities.MYFSNURL);
    	
    }
	@Test( invocationCount=10)
	public void SRGenerate() throws InterruptedException {
		SRCreatePage.NavigateToSRCreate(); 
		SRCreatePage.SRCreationTestMSI();
	}
		
/*	
	@Test(priority=2)
	public void SRCreateTest() throws InterruptedException {
		SRCreatePage.NavigateToSRCreate();
		SRCreatePage.SRCreationTestMSI();
		
	
	}
	
	@Test(priority=3)
	public void SRCreateBioHazardAlertTest() throws InterruptedException {
		SRCreatePage.NavigateToSRCreate();
		SRCreatePage.SRCreationTestBioHazardAlertcheck();
	
	
	}
	
	@Test(priority=3)
	public void SRCreateBioChemDisposalAlertTest() throws InterruptedException {
		SRCreatePage.NavigateToSRCreate();
		SRCreatePage.SRCreationChemicalDisposalAlertcheck();
	
	
	}*/
	
/*	@Test(priority=4)
	public void SRCreateBioChemSpillAlertTest() throws InterruptedException {
		SRCreatePage.NavigateToSRCreate();
		SRCreatePage.SRCreationChemicalSpillAlertcheck();
	
	
	}
	*/
	


	@AfterTest
	public void afterTest() { Utilities.driver.quit();
	}

	
}
