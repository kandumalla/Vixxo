package fsntests;
import org.testng.annotations.Test;

import fsnpof.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginTest {
	WebDriver driver;
	LoginPOF LoginPage; 

	@Test (priority=1)
	public void USPageTest() {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		LoginPage.USPageValidation();
	}

	@Test(priority=2)
	public void CAPageTest(){
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.CAclick();
		LoginPage.CAPageValidation();
	}


	@Test (priority=3)
	public void PRPageTest(){
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.PRclick();
		LoginPage.PRPageValidation();
	}


	@AfterMethod 
	public void aftermethod(){
		LoginPage.Logout();
	}



	@BeforeTest
	public void beforeTest() {
		
		//Ourfsnlogin.driver=new ChromeDriver();
		//setting global explicit wait
		Utilities.webdrive();
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 20), this);
		Utilities.driver.get(Utilities.MYFSNURL);
		//initiating elements in page factory 
		LoginPage= PageFactory.initElements(Utilities.driver, LoginPOF.class);

	}

	@AfterTest
	public void afterTest() {
		Utilities.driver.quit();


	}

}
