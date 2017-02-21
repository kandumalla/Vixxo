package fsnpof;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
// URL = http://www.ourfsn.com/myfsn/

public class LoginPOF {

	WebDriverWait wait = new WebDriverWait(Utilities.driver, 60);

	// By customerlogin= By.id("ctl00_ContentPlaceHolder1_tbxUname");
	// By customerpassword= By.id("ctl00_ContentPlaceHolder1_tbxPword");
	// By submit= By.id("ctl00$ContentPlaceHolder1$btnSubmit");
	// By PETSMARTUS=
	// By.name("ctl00$ContentPlaceHolder1$rptAccounts$ctl01$AccountSwitch");
	// By PETSMARTCAD=
	// By.name("ctl00$ContentPlaceHolder1$rptAccounts$ctl02$AccountSwitch");
	// By PETSMARTPR=
	// By.name("ctl00$ContentPlaceHolder1$rptAccounts$ctl03$AccountSwitch");
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxUname")
	WebElement login;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxPword")
	WebElement password;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement submit;
	@FindBy(id = "btnSubmit")
	WebElement LoginBtnVixxo;

	@FindBy(name = "ctl00$ContentPlaceHolder1$rptAccounts$ctl01$AccountSwitch")
	WebElement PETSMARTUS;
	@FindBy(name = "ctl00$ContentPlaceHolder1$rptAccounts$ctl02$AccountSwitch")
	WebElement PETSMARTCAD;
	@FindBy(name = "ctl00$ContentPlaceHolder1$rptAccounts$ctl03$AccountSwitch")
	WebElement PETSMARTPR;
	@FindBy(id = "ctl00_lblTopLogin")
	WebElement PETSMARTUSASSERT;
	@FindBy(id = "ctl00_lblTopLogin")
	WebElement PETSMARTCAASSERT;
	@FindBy(id = "ctl00_lblTopLogin")
	WebElement PETSMARTPRASSERT;
	@FindBy(id = "ctl00_Menu1_16")
	WebElement LogoutButton;
	@FindBy(id = "ctl00_Menu1_10")
	WebElement LogoutButtonSP;
	// ServiceCenter
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtSRNumber")
	WebElement SCSRSearchbox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbSRNum")
	WebElement SPSRSearchbox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ibSRNum")
	WebElement SPSRSearchbtn;

	// Need to initiate factory Prior to test I.E. (HomePage hp =
	// PageFactory.initElements(driver, HomePage.class);)
	public static WebDriver driver;

	public static void cdriver() {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\dmohamed\\Documents\\Testing
		// Environment\\Testing Environment\\Web Drivers\\chromedriver_win32
		// (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver chromedriver = new ChromeDriver();

		driver = chromedriver;

	}

	// Send user name in textbox
	public void sendUserName(String strUsername) {
		String PetmUser = "ebluth";
		login.sendKeys(PetmUser);
	}

	public void sendUserNameMSI(String strUsername) {
		String MsiUser = "MSI01";
		login.sendKeys(MsiUser);
	}

	public void sendUserNameAHD01() {
		String AholdUser = "sbastien";
		login.sendKeys(AholdUser);
	}

	public void sendUserNameServiceCenter(String strUsername) {
		login.sendKeys("servicecenter");
	}

	public void sendUserNameSP(String strUsername) {
		login.sendKeys("4335701");
	}

	public void sendUserNameSPMSI(String strUsername) {
		login.sendKeys("F284519101");
	}

	public void sendUserNameRTP() {
		login.sendKeys("RTP");
	}

	public void sendUserNamePETMUS() {
		login.sendKeys("PETMUSFULL");
	}

	public void ProdLoginEbluth() {
		try {
			login.sendKeys("ebluth");
		} catch (StaleElementReferenceException e) {
			Utilities.driver.navigate().refresh();
			login.sendKeys("ebluth");
			password.sendKeys("Mariota02");
		}
        password.clear();
		password.sendKeys("Mariota02");
	}

	public void ProdLoginm0059() {
		try {
			login.sendKeys("m0059");
		} catch (StaleElementReferenceException e) {
			Utilities.driver.navigate().refresh();
			login.sendKeys("m0059");
			password.sendKeys("holiday2015");
		}
		password.clear();
		password.sendKeys("holiday2015");
	}

	// Send Password
	public void sendPassword(String strPassword) {
		password.sendKeys("password");
	}

	// submitting credentials
	public void clicksubmit() {
		submit.click();
		// LoginBtnVixxo.click();
	}

	// Checking US PAge
	public void USAssertion() {
		PETSMARTUS.isEnabled();
	}

	// Checking CAD page
	public void CAAssertion() {
		PETSMARTCAD.isEnabled();
	}

	// Checking PR Page
	public void PRAssertion() {
		PETSMARTPR.isEnabled();
	}
	// click us link

	// Checking US PAge
	public void USclick() {
		PETSMARTUS.click();
	}

	// Checking CAD page
	public void CAclick() {
		PETSMARTCAD.click();
	}

	// Checking PR Page
	public void PRclick() {
		PETSMARTPR.click();
	}

	public void AccountListCheck() {
		Assert.assertTrue(PETSMARTUS.getAttribute("value").contains("PETSMART US (PETM-US)"));
		Assert.assertTrue(PETSMARTCAD.getAttribute("value").contains("PETSMART CAD (PETM-CN)"));
		Assert.assertTrue(PETSMARTPR.getAttribute("value").contains("PETSMART PR (PETM-PR)"));
	}

	// Click on
	public void USPageValidation() {
		Assert.assertTrue(PETSMARTUSASSERT.getText().contains("PETM-US"), "Incorrect Page [US,CA,PR]");

	}

	public void PRPageValidation() {
		Assert.assertTrue(PETSMARTPRASSERT.getText().contains("PETM-PR"), "Incorrect Page [US,CA,PR]");
	}

	public void CAPageValidation() {
		Assert.assertTrue(PETSMARTCAASSERT.getText().contains("PETM-CN"), "Incorrect Page [US,CA,PR]");
	}

	public void ServiceCenterPageValidation() {
		Assert.assertTrue(driver.getCurrentUrl().contains("http://fsndevweb:81/SC_Main/SC_Home.aspx"),
				"Incorrect Page [US,CA,PR]");
	}

	// Log out

	public void Logout() {
		LogoutButton.click();

	}

	public void LogoutSP() {
		LogoutButtonSP.click();

	}

	public void SCSRSearch(String srnumber) {
		SCSRSearchbox.sendKeys(srnumber);

	}

	public void SPSRSearch(String srnumber) {
		SPSRSearchbox.sendKeys(srnumber);
		SPSRSearchbtn.click();

	}

}
