package FMWebPOF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

	@FindBy(xpath = "//*[@class='loginHome']/tbody/tr/td/table/tbody/tr[1]/td[2]/input[@class='loginUserPassword']")
	WebElement UserNamefield;
	@FindBy(xpath = "//*[@class='loginHome']/tbody/tr/td/table/tbody/tr[2]/td[2]/input[@class='loginUserPassword']")
	WebElement PasswordField;
	@FindBy(xpath = "//*[@class='loginHome']/tbody/tr/td/table/tbody/tr[3]/td[@class='center']/input[@class='button']")
	WebElement loginbtn;
	@FindBy(xpath = "//*[@class='mainloginhome']/tbody/tr/td/form/table[@class='loginHome']/tbody/tr/td/h3")
	WebElement LoginErrorMessage;
	@FindBy(xpath = "//*/div[@id='header']/div[@id='breadcrumb']/ul/li[2]/a")
	WebElement Loginlogoutbtn;
	@FindBy(xpath = "//*/body/div[@id='header']/div[@id='userarea']")
	WebElement LoginConfirmation;

	public String SendUserName() {
		String UserName = "osmith";
		UserNamefield.sendKeys(UserName);
		return UserName;

	}

	public String SendPassword() {
		String Password = "test1";
		PasswordField.sendKeys(Password);
		return Password;

	}

	public void LoginAction() {
		loginbtn.click();
	}

	public void LogOutAction() {
		Loginlogoutbtn.click();
	}

	public void LoginConfirmation() {
		String LoggedInMessage = LoginConfirmation.getText();
		Assert.assertTrue(LoginConfirmation.isDisplayed(), "Login Unsuccessful");
	}

	public void LoginErrorCheckNullInput() {
		String ErrorMessage = LoginErrorMessage.getText();
		Assert.assertTrue(LoginErrorMessage.getText().contains("Please enter a username and password."),
				ErrorMessage + " Is the incorrect error message should be [Please enter a username and password]");
	}

	public void LoginErrorCheckInvalidInput() {
		String ErrorMessage = LoginErrorMessage.getText();
		Assert.assertTrue(LoginErrorMessage.getText().contains("Invalid username and/or password."),
				ErrorMessage + " Is the incorrect error message should be [Invalid username and/or password]");
	}

	public static void webdrive() {
		Utilities.webdrive();

	}

	public String SendInvalidUserName() {
		String UserNameInvalid = "osmit";
		UserNamefield.sendKeys(UserNameInvalid);
		return UserNameInvalid;

	}

	public String SendInvalidPassword() {
		String PasswordInvalid = "tes";
		PasswordField.sendKeys(PasswordInvalid);
		return PasswordInvalid;

	}

	public void SendBlankUserName() {
		UserNamefield.clear();

	}

	public void SendBlankPassword() {
		PasswordField.clear();

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
