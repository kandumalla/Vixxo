package swtPOF;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageSWT {

	@FindBy(id = "username")
	WebElement UserNamefield;
	@FindBy(id = "password")
	WebElement PasswordField;
	@FindBy(id = "Onsubmit")
	WebElement SignInbtn;
	@FindBy(xpath = "//*/div[@class='container']/div[2]/div[@class='alert alert-danger']")
	WebElement LoginErrorMessage;
	@FindBy(xpath = "//*/ul[@class='nav navbar-nav']/li[@class='dropdown open']/ul[@class='dropdown-menu']/li/a")
	WebElement LogOutbtn;
	@FindBy(xpath = "//*/li[@class='dropdown']/span[@class='dropdown-toggle']")
	WebElement UserNameMenu;
	@FindBy(id = "menu")
	WebElement LoginConfirmation;
	
	

	public String SendUserName() {
		String UserName = "dbrantley";
		UserNamefield.sendKeys(UserName);
		return UserName;

	}

	public String SendPassword() {
		String Password = "123456";
		PasswordField.sendKeys(Password);
		return Password;

	}

	public void LoginAction() {
		SignInbtn.click();
	}

	public void LogOutAction() {
		UserNameMenu.click();
		LogOutbtn.click();
	}

	public void LoginConfirmation() {
		Assert.assertTrue(LoginConfirmation.isDisplayed(), "Login Unsuccessful");
	}
	public void LogoutConfirmation (){
		Assert.assertTrue(UserNamefield.isDisplayed(), "Logout Unsuccessful");
	}
	
	String ExpectedSignInErrorMessage="The username or password you entered is incorrect. Please try again.";

	public void LoginErrorCheckNullInput() {
		String ErrorMessage = LoginErrorMessage.getText();
		Assert.assertTrue(LoginErrorMessage.getText().contains(ExpectedSignInErrorMessage),
				ErrorMessage + " Is the incorrect error message should be [ "+ ExpectedSignInErrorMessage+" ]" );
	}

	public void LoginErrorCheckInvalidInput() {
		String ErrorMessage = LoginErrorMessage.getText();
		Assert.assertTrue(LoginErrorMessage.getText().contains(ExpectedSignInErrorMessage),
				ErrorMessage + " Is the incorrect error message should be [ "+ ExpectedSignInErrorMessage+" ]" );
	}

	public static void webdrive() {
		UtilitiesSWT.webdrive();

	}

	public String SendInvalidUserName() {
		String UserNameInvalid = "brantley";
		UserNamefield.sendKeys(UserNameInvalid);
		return UserNameInvalid;

	}

	public String SendInvalidPassword() {
		String PasswordInvalid = "1234";
		PasswordField.sendKeys(PasswordInvalid);
		return PasswordInvalid;

	}

	public void SendBlankUserName() {
		UserNamefield.clear();

	}

	public void SendBlankPassword() {
		PasswordField.clear();

	}
	
	public boolean Alertcheck (){
		
		 try 
		    { 
		        UtilitiesSWT.driver.switchTo().alert(); 
		        return true; 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        return false; 
		    }   // catch 
		
	}
	
	public void LoginIssueWorkAround (){
		if (Alertcheck()) {
			UtilitiesSWT.driver.switchTo().alert().accept();
			
		}
	}


	@FindBy(id = "chkChangePass")
	WebElement ChangePasswordCheckBox;
	@FindBy(id = "chkChangeEmail")
	WebElement ChangeEmailCheckBox;
	@FindBy(xpath = "//*[@class='loginHome']/tbody/tr/td/p[1]/a/b")
	WebElement ForgotUserNameLink;
	@FindBy(xpath = "//*[@class='loginHome']/tbody/tr/td/p[2]/a/b")
	WebElement ForgotPasswordLink;

	// This is only an unique xpath when the change email checkbox is selected
	// by itself
	@FindBy(xpath = "//*[@class='tabledatarows']/input")
	WebElement ChangeEmailField;
	@FindBy(xpath = "//*/table/tbody/tr[3]/td[@class='tabledatarows'][2]/input")
	WebElement NewPasswordField;
	@FindBy(xpath = "//*/table/tbody/tr[4]/td[@class='tabledatarows'][2]/input")
	WebElement NewPasswordConfirmationField;
	@FindBy(xpath = "//*/table/tbody/tr[6]/td[@class='tabledatarows']/input")
	WebElement ChangeEmailFieldPasswordPage;

	@FindBy(xpath = "//*/table/tbody/tr[2]/td[@class='tabledatarows']/p[2]/input")
	WebElement ForgotUserNameEmailField;
	@FindBy(xpath = "//*/table/tbody/tr[2]/td[@class='tabledatarows']/p[2]/input")
	WebElement ForgotPasswordUserNameField;

	// */table/tbody/tr[2]/td[@class='tabledatarows']/p[2]/input

	public void ChangePasswordAction() {
		ChangePasswordCheckBox.click();
	}

	public void ChangeEmailAction() {
		ChangeEmailCheckBox.click();
	}

	public void ChangePasswordFunctionCheck() {
		Assert.assertTrue(NewPasswordField.isEnabled(), "Incorrect Page");
		Assert.assertTrue(NewPasswordConfirmationField.isEnabled(), "Incorrect Page");
	}

	public void ChangeEmailFunctionCheck() {
		Assert.assertTrue(ChangeEmailField.isEnabled(), "Incorrect Page");

	}

	public void ChangeEmailAndPasswordFunctionCheck() {
		Assert.assertTrue(NewPasswordField.isEnabled(), "Incorrect Page");
		Assert.assertTrue(NewPasswordConfirmationField.isEnabled(), "Incorrect Page");
		Assert.assertTrue(ChangeEmailFieldPasswordPage.isEnabled(), "Incorrect Page");
	}

	public void ForgotUserNameFunctionCheck() {
		ForgotUserNameLink.click();
		Assert.assertTrue(ForgotUserNameEmailField.isEnabled(), "Incorrect Page");

	}

	public void ForgotPasswordFunctionCheck() {
		ForgotPasswordLink.click();
		Assert.assertTrue(ForgotPasswordUserNameField.isEnabled(), "Incorrect Page");

	}

}
