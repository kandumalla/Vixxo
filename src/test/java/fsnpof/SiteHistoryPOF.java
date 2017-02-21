package fsnpof;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SiteHistoryPOF {
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextboxSite")
	WebElement SearchSiteTextBox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_cbSiteAssets")
	WebElement IncludeAssetscheckbox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnSiteHistory")
	WebElement ViewHistoryBtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_rptrSRData_ctl01_hlSR#")
	WebElement SRNumberLink;
	@FindBy(id = "ctl00_ContentPlaceHolder1_contactButton")
	WebElement Contactbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtTO")
	WebElement Emailfield;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxMsg")
	WebElement MessageField;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnSend")
	WebElement EmailSubmitbtn;

	@FindBy(id = "ctl00_ContentPlaceHolder1_tblReply")
	WebElement MessageSentConfiramtion;

	// 0047 PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA 9492

	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;

	}

	public void SearchSiteTextBoxinput() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Utilities.driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(SearchSiteTextBox));
		SearchSiteTextBox.sendKeys("0047");
		Thread.sleep(3000);
		SearchSiteTextBox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		IncludeAssetscheckbox.click();
		ViewHistoryBtn.click();
	}
	
	@FindBy(id="ctl00_lblPageTitle")
	WebElement SRListTitle;
	@FindBy(id="ctl00_ContentPlaceHolder1_rptrSRData_ctl01_hlSR#")
	WebElement SRListData;
	
		public void searchresultscheck() {
		String ActualUrl = Utilities.driver.getCurrentUrl();
		Assert.assertTrue(SRListTitle.isDisplayed(),
				"Expected to be on SR List page on page, actually on" + ActualUrl);
		Assert.assertTrue(SRListData.isDisplayed());
		

		
	}

	public void SRDetailNavigation() {
		SRNumberLink.click();
	}

	public void SRDetailAssertion() {

		Assert.assertTrue(Utilities.driver.getCurrentUrl().contains("srdetail"), "Taken to incorrect page");
	}

	public void SRDetailConfirmation() {
		SRNumberLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("SRdetail"), "Taken to incorrect page");
	}

	public void ContactEmailValidation() {
		Contactbtn.click();
		Emailfield.clear();
		Emailfield.sendKeys("Deonte.Mohamed@vixxo.com");
		MessageField.sendKeys("Test Message");
		EmailSubmitbtn.click();
		Assert.assertTrue(MessageSentConfiramtion.getText().contains("Your message has been sent."),
				"Email Message confirmation failed");

	}
	

	public void ContactEmailPageNavigate() {
		Contactbtn.click();
		

	}
	WebDriverWait wait = new WebDriverWait(Utilities.driver,60);
	
	public void ContactPageCheck(){
	wait.until(ExpectedConditions.elementToBeClickable(Emailfield));
	wait.until(ExpectedConditions.elementToBeClickable(MessageField));
	ExpectedConditions.elementToBeClickable(Emailfield);
	ExpectedConditions.elementToBeClickable(MessageField);
	ExpectedConditions.elementToBeClickable(EmailSubmitbtn);
	
	
	}

	public void ContactEmailPageConfirmation() {
		String ActualUrl = Utilities.driver.getCurrentUrl();
		Assert.assertTrue(Utilities.driver.getCurrentUrl().contains("contactEmail"),
				"Expected to be on Contact Email page on page, actually on" + ActualUrl);

	}

}
