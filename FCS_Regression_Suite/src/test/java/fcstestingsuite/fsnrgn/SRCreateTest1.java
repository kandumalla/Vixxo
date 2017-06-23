package fcstestingsuite.fsnrgn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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
import pageobjectfactory.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class SRCreateTest1 {
	WebDriver driver;
	Ourfsnlogin LoginPage;
	SRCreate SRCreatePage;
	
	@BeforeTest
	public void beforeTest() {
		SRCreate.webdrive();
		//SRCreate.driver = new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(SRCreate.driver, 60), this);
		SRCreate.driver.get("http://www.ourfsn.com/myfsn");
		//initiating elements in page factory 
		SRCreatePage= PageFactory.initElements(SRCreate.driver, SRCreate.class);
		LoginPage= PageFactory.initElements(SRCreate.driver, Ourfsnlogin.class);
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		
	}
	

	@Test(priority=1)
	public void SRPageNavigationTest() {
		SRCreatePage.NavigateToSRCreate();
		
	}
	@Test(priority=2)
	public void SRCreateTest() throws InterruptedException {
		SRCreatePage.SRCreationTest();
	
	}


	@AfterTest
	public void afterTest() { SRCreate.driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
	}

}
