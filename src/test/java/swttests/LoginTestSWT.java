package swttests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import swtPOF.*;


public class LoginTestSWT {
	WebDriver driver;
	LoginPageSWT Login;
	UtilitiesSWT UtilClass;

	@BeforeTest
	public void beforeTest() {
		UtilitiesSWT.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(UtilitiesSWT.driver, 60), this);
		UtilitiesSWT.driver.get(UtilitiesSWT.SWTURL);
		// initiating elements in page factory
		Login = PageFactory.initElements(UtilitiesSWT.driver, LoginPageSWT.class);
		UtilClass = PageFactory.initElements(UtilitiesSWT.driver, UtilitiesSWT.class);
	}

	@Test(priority = 1)
	public void PositiveLoginTest() throws InterruptedException {
		Login.SendUserName();
		Login.SendPassword();
		Login.LoginAction();
        Thread.sleep(2000);
        Login.Alertcheck();
		Login.LoginIssueWorkAround();
		Login.LoginConfirmation();
		

	}
	@Test(priority = 1)
	public void LogoutTest() throws InterruptedException {
		Login.SendUserName();
		Login.SendPassword();
		Login.LoginAction();
        Thread.sleep(2000);
        Login.Alertcheck();
		Login.LoginIssueWorkAround();
		Login.LogOutAction();
		Login.LogoutConfirmation();
		

	}


	@Test(priority = 2)
	public void LoginTestInvalidUser() {
		Login.SendInvalidUserName();
		Login.SendPassword();
		Login.LoginAction();
		Login.LoginErrorCheckInvalidInput();

	}

	@Test(priority = 3)
	public void LoginTestInvalidPassword() {
		Login.SendUserName();
		Login.SendInvalidPassword();
		Login.LoginAction();
		Login.LoginErrorCheckInvalidInput();

	}

	@Test(priority = 4)
	public void LoginTestCredentials() {
		Login.SendInvalidUserName();
		Login.SendInvalidPassword();
		Login.LoginAction();
		Login.LoginErrorCheckInvalidInput();

	}

	@Test(priority = 5)
	public void LoginTestBlankUser() {
		Login.SendBlankUserName();
		Login.SendPassword();
		Login.LoginAction();
		Login.LoginErrorCheckNullInput();

	}

	@Test(priority = 6)
	public void LoginTestBlankPassword() {
		Login.SendUserName();
		Login.SendBlankPassword();
		Login.LoginAction();
		Login.LoginErrorCheckNullInput();

	}

	@Test(priority = 7)
	public void LoginTestBlankCredentials() {
		Login.SendBlankUserName();
		Login.SendBlankPassword();
		Login.LoginAction();
		Login.LoginErrorCheckNullInput();

	}

	/*@Test(priority = 8)
	public void ChangePasswordFunctionTest() {
		Login.SendUserName();
		Login.SendPassword();
		Login.ChangePasswordAction();
		Login.LoginAction();
		Login.ChangePasswordFunctionCheck();

	}

	@Test(priority = 9)
	public void ChangeEmailFunctionTest() {
		Login.SendUserName();
		Login.SendPassword();
		Login.ChangeEmailAction();
		Login.LoginAction();
		Login.ChangeEmailFunctionCheck();

	}

	@Test(priority = 10)
	public void ChangeEmailAndPasswordFunctionTest() {
		Login.SendUserName();
		Login.SendPassword();
		Login.ChangeEmailAction();
		Login.ChangePasswordAction();
		Login.LoginAction();
		Login.ChangeEmailAndPasswordFunctionCheck();

	}

	@Test(priority = 11)
	public void ForgotUsernameFunctionTest() {
		Login.ForgotUserNameFunctionCheck();

	}

	@Test(priority = 12)
	public void ForgotPasswordFunctionTest() {
		Login.ForgotPasswordFunctionCheck();
	}*/

	@AfterMethod
	public void aftermethod() {
		UtilitiesSWT.driver.navigate().to("http://vixxoswmweb-test-2.us-east-1.elasticbeanstalk.com/");
	}

	@AfterTest
	public void afterTest() {
		UtilitiesSWT.driver.quit();
	}

}
