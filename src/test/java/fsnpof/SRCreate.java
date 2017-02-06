package fsnpof;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SRCreate {
	WebDriverWait wait = new WebDriverWait(Utilities.driver, 60);

	// Home Page
	@FindBy(id = "ctl00_Menu1_1")
	WebElement Managesitestab;
	@FindBy(id = "ctl00_Menu1_2")
	WebElement CreateSRLink;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ibManNewSR")
	WebElement SRCreatebtn;

	// Create SR Page
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextboxSite")
	WebElement SelectSitebox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_DdlSiteArea")
	WebElement SiteAreaDropDown;
	@FindBy(id = "ctl00_ContentPlaceHolder1_DdlSiteSubArea")
	WebElement SubSiteAreaDropDown;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlSLOS")
	WebElement TypeofService;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlSshortDesc")
	WebElement ReasonForCall;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlCategory")
	WebElement Category;
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextBoxSiteLimit")
	WebElement SiteLimit;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxRequestor")
	WebElement RequesterInfo;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxWO")
	WebElement WorkOrder;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxPO")
	WebElement PurchaseOrder;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlPrio")
	WebElement Priority;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbDueDate")
	WebElement DueDate;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlOT")
	WebElement Overtime;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbxDesc")
	WebElement DetailedDescription;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement Submitbtn;
	// Dynamic Scripting
	@FindBy(xpath = "//*[@value='No;13;#shortDescriptionQuestionsSection']")
	WebElement NoSafetyIssueQ;
	@FindBy(xpath = "//*[@value='Yes;14;#shortDescriptionQuestionsSection']")
	WebElement YesTooHotTooColdQ;

	// SR Confirmation
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblnewSRNum")
	WebElement SRNumberMessage;
	@FindBy(id = "ctl00_ContentPlaceHolder1_hplViewSR")
	WebElement SRConfirmationLink;
	@FindBy(id = "ctl00_ContentPlaceHolder1_LabelErrorMsg")
	WebElement SRSubmissionTimeOutMessage;
	@FindBy(xpath = "//*[@id='divLOSShortdescContent']/div/input")
	WebElement SRNotificationPopup;
	@FindBy(id = "ctl00_ContentPlaceHolder1_SRNumberLabel")
	public WebElement SRNumber;
	@FindBy(id = "ctl00_lblPageTitle")
	WebElement SRDetailPagehdr;

	@FindBy(id = "ctl00_ContentPlaceHolder1_LabelErrorMsg")
	WebElement SRTimeout;
	// SR Detail
	@FindBy(id = "ctl00_ContentPlaceHolder1_serviceContractorDropdown")
	WebElement SCDropDown;
	@FindBy(id = "ctl00_ContentPlaceHolder1_saveButton")
	WebElement SaveChangesbtn;

	@FindBy(id = "//*[@id='divLOSShortdescContent']/div/input")
	WebElement OKBtnSRWarrentyNotification;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement DSAnswerSafetyIssueY;
	//*[contains=@value, 'Yes']
	//*[text()='Yes']


	// ctl00_ContentPlaceHolder1_SRNumberLabel

	/*
	 * //Methods SR Detail Page confirmation link:
	 * [http://www.ourfsn.com/myfsn/SRdetail.aspx?srid=]
	 * 
	 * Select oSelection = new
	 * Select(SiteAreaDropDown).selectByVisibleText("Core Store");
	 */
	public static WebDriver driver = Utilities.driver;

	public static void webdrive() {
		Utilities.webdrive();

	}

	public void NavigateToSRCreate() {
		Actions action = new Actions(Utilities.driver);
		action.moveToElement(Managesitestab).perform();
		WebElement subElement = CreateSRLink;
		// driver.findElement(By.id("ctl00_Menu1_2"));
		action.moveToElement(subElement);
		action.click();
		action.perform();
		String url = Utilities.driver.getCurrentUrl();
		Assert.assertTrue(url.contains("SRCreate.aspx"));

	}

	public void NavigateToSRCreateWithbtn() {
		SRCreatebtn.click();
	}
	public void SiteSelect() throws InterruptedException {
		Thread.sleep(2000);
		SelectSitebox.sendKeys("99999");
		Thread.sleep(2000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
	}

	public void SelectArea() throws InterruptedException {
		Select siteareadd = new Select(SiteAreaDropDown);
		siteareadd.selectByVisibleText("Core Store");
		Thread.sleep(2000);
	}

	public void SelectSubArea() throws InterruptedException {
		Select subsiteareadd = new Select(SubSiteAreaDropDown);;
		subsiteareadd.selectByVisibleText("Sales floor");
		Thread.sleep(2000);
	}

	public void SelectTypeofService() throws InterruptedException {
		Select typeofservicedd = new Select(TypeofService);
		typeofservicedd.selectByVisibleText("Windows");
		Thread.sleep(3000);
	}

	public void SelectReasonForCall() throws InterruptedException {
		Select reasondd = new Select(ReasonForCall);
		reasondd.selectByVisibleText("Leaking");
		Thread.sleep(2000);
		
	}
	
	public void DSQuestionAnswer1() throws InterruptedException{
		DSAnswerSafetyIssueY.click();
		Thread.sleep(2000);
	}

	public void EnterRequestByInfo() {
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");

	}

	public void EnterDetailedDescription() throws InterruptedException {
		DetailedDescription.sendKeys("brokenalarm");
		Thread.sleep(2000);
	}

	public void SubmitSR() throws InterruptedException {
	
		Submitbtn.click();
		
		}

	public void SRCheck (){
		wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
		SRConfirmationLink.click();
		String urlsrconfirmation = Utilities.driver.getCurrentUrl();
		
		if (urlsrconfirmation.contains("SRdetail.aspx?")) {
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		} else if (!SRSubmissionTimeOutMessage.isDisplayed()) {
			Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
		}
		

	}

	public void SRCreationTest() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Automatic Doors");
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Off Track");
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
		DetailedDescription.sendKeys("brokenalarm");
		Thread.sleep(2000);
		if (SRNotificationPopup.isDisplayed()) {
			SRNotificationPopup.click();

			Submitbtn.click();

			wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
			SRConfirmationLink.click();
			String urlsrconfirmation = Utilities.driver.getCurrentUrl();
			if (urlsrconfirmation.contains("SRdetail.aspx?")) {
				System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

			} else if (!SRSubmissionTimeOutMessage.isDisplayed()) {
				Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
			}

		}

	}

	public String GetSrNumber() {

		String srnumber = SRNumber.getText();
		System.out.println(srnumber);
		return srnumber;
	}

	public void SRCreationTestHVAC() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Heating Ventilation AC");
		/*
		 * NoSafetyIssueQ.click(); YesTooHotTooColdQ.click();
		 */
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Too Cold");
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
		DetailedDescription.sendKeys("test");
		Thread.sleep(2000);
		if (SRNotificationPopup.isDisplayed())
			SRNotificationPopup.click();
		Submitbtn.click();

		wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
		SRConfirmationLink.click();
		SCDropDown.sendKeys("F", Keys.ENTER);
		SaveChangesbtn.click();

		if (SRDetailPagehdr.isDisplayed()) {
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		}

		else if (SRSubmissionTimeOutMessage.isDisplayed()) {
			System.out.println("SR Timed Out, message displayed");
		} else if (!SRSubmissionTimeOutMessage.isDisplayed()) {
			Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
		}

	}

	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlContractorType")
	WebElement ContractorTypeDD;

	public void SRCreationTestMSI() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(5019) Michaels - Kildeer/IL - 5019 - ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		Select SiteAreaDD = new Select(SiteAreaDropDown);
		SiteAreaDD.selectByVisibleText("Exterior");
		Thread.sleep(3000);
		Select SiteSubAreaDD = new Select(SubSiteAreaDropDown);
		SiteSubAreaDD.selectByVisibleText("Front");
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Biohazard Clean-up");
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Bio Hazard Clean-Up");
		/*
		 * Select contractorTypeDD = new Select (ContractorTypeDD);
		 * contractorTypeDD.
		 * selectByVisibleText("Facilities Service Center Inc. (1)");
		 */
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
		DetailedDescription.sendKeys("test");
		Thread.sleep(2000);
		Submitbtn.click();

		wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
		SRConfirmationLink.click();
		/*
		 * SCDropDown.sendKeys("F", Keys.ENTER); SaveChangesbtn.click();
		 */

		// String urlsrconfirmation= driver.getCurrentUrl();
		// Assert.assertTrue(urlsrconfirmation.contains("http://www.ourfsn.com/myfsn/SRdetail.aspx?"),
		// "SR processing unsuccessful");
		if (SRDetailPagehdr.isDisplayed()) {
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		}

		else if (SRSubmissionTimeOutMessage.isDisplayed()) {
			System.out.println("SR Timed Out, message displayed");
		}
	}

	public void SRCreationTestBioHazardAlertcheck() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Hazardous Material Handling");
		/*
		 * NoSafetyIssueQ.click(); YesTooHotTooColdQ.click();
		 */
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Bio Hazard Clean-Up");
		ExpectedConditions.alertIsPresent();

	}

	public void SRCreationChemicalSpillAlertcheck() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Hazardous Material Handling");
		/*
		 * NoSafetyIssueQ.click(); YesTooHotTooColdQ.click();
		 */
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Chemical Spill");
		ExpectedConditions.alertIsPresent();

	}

	public void SRCreationChemicalDisposalAlertcheck() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Hazardous Material Handling");
		/*
		 * NoSafetyIssueQ.click(); YesTooHotTooColdQ.click();
		 */
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Chemical Disposal");
		ExpectedConditions.alertIsPresent();

	}

	

	public void Sr() throws InterruptedException {
		Thread.sleep(3000);
		SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
		Thread.sleep(3000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Select siteareadd = new Select(SiteAreaDropDown);
		Thread.sleep(3000);
		siteareadd.selectByVisibleText("Core Store");
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		Thread.sleep(3000);
		subsiteareadd.selectByVisibleText("Sales floor");
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Automatic Doors");
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Off Track");
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
		DetailedDescription.sendKeys("brokenalarm");
		Thread.sleep(2000);
		if (SRNotificationPopup.isDisplayed()) {
			SRNotificationPopup.click();

			Submitbtn.click();

			wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
			SRConfirmationLink.click();
			String urlsrconfirmation = Utilities.driver.getCurrentUrl();
			// Assert.assertTrue(urlsrconfirmation.contains("http://www.ourfsn.com/myfsn/SRdetail.aspx?"),
			// "SR processing unsuccessful");
			if (urlsrconfirmation.contains("SRdetail.aspx?")) {
				System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

			} else if (!SRSubmissionTimeOutMessage.isDisplayed()) {
				Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
			}

			// Thread.sleep(3000);

		}

	}
}