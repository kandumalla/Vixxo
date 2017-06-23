package FMWebTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import FMWebPOF.*;
import fsnpof.SRCreate;
import fsnpof.Utilities;

public class LoginTest {
	WebDriver driver;
	LoginPage Login;
	Utilities UtilClass;

	@BeforeTest
	public void beforeTest() {
		Utilities.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get("http://hart-appuat01:8080/FMWebCare/login.jsp");
		// initiating elements in page factory
		Login = PageFactory.initElements(Utilities.driver, LoginPage.class);
		UtilClass = PageFactory.initElements(Utilities.driver, Utilities.class);
	}

	@Test(priority = 1)
	public void PositiveLoginTest() {
		Login.SendUserName();
		Login.SendPassword();
		Login.LoginAction();
		Login.LoginConfirmation();
		Login.LogOutAction();

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

	@Test(priority = 8)
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
	}

	@AfterMethod
	public void aftermethod() {
		Utilities.driver.navigate().to("http://hart-appuat01:8080/FMWebCare/login.jsp");
	}

	@AfterTest
	public void afterTest() {
		Utilities.driver.quit();
	}

}
