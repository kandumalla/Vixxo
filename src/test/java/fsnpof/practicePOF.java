package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practicePOF {

	public static WebDriver driver;

	public static void webdriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_tbxUname']")
	// *[@id="ctl00_ContentPlaceHolder1_tbxPword"]
	WebElement UserNameField;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_tbxPword']")
	WebElement PasswordField;
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_btnSubmit']")
	WebElement Submitbtn;

	public void sendUsername() {
		UserNameField.sendKeys("petmusfull");

	}
	public void sendPassword() {
		 PasswordField.sendKeys("password");

	}

	public void clickLoginBtn() {
		Submitbtn.click();

	}

	public void Login() {
		new WebDriverWait(practicePOF.driver, 10).until(ExpectedConditions.visibilityOf(Submitbtn));
		sendUsername();
		sendPassword();
		clickLoginBtn();

	}

	@FindBy(id = "ctl00_lblPageTitle")
	WebElement Homepagetitle;

	public void userShouldBeOnHomePage() {
		new WebDriverWait(practicePOF.driver, 10).until(ExpectedConditions.visibilityOf(Homepagetitle));
		Assert.assertTrue(Homepagetitle.getText().contains("Welcome"), "Test failed, not on home page");

	}
	@FindBy (xpath="//td[@title='Manage your Sites']")
	WebElement ManageSitesLink;
	@FindBy (id="ctl00_Menu1_2")
	WebElement CreateSRLink;
	
	public void accessMangeSiteSubLinks (){
	new WebDriverWait(practicePOF.driver, 10).until(ExpectedConditions.visibilityOf(ManageSitesLink));
	Actions action = new Actions(driver);
	action.moveToElement(ManageSitesLink).perform();;
	}
	public void clickCreateSRLink (){
		
		Actions action = new Actions(driver);
		action.click(CreateSRLink).perform();;
	
	}
	
	public void NavigatetoSRCreatePage (){
	accessMangeSiteSubLinks();
	clickCreateSRLink();
		
	}
	@FindBy (id="ctl00_lblPageTitle")
	WebElement SRCreatePageTitle;
	
	public void UsershouldBeOnSRCreatePage (){ 
	Assert.assertTrue(SRCreatePageTitle.getText().contains("Create Service Request"), "Test Failed, not on sr create page");
		
	}
}
