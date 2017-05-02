package fsnpof;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SRCreate {
	String RandomString = UUID.randomUUID().toString();
	WebDriverWait wait = new WebDriverWait(Utilities.driver, 60);
	String Customer = "PETM-US";
	String Site = "0047";
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

	@FindBy(id = "ddlReasonForCAll")
	WebElement ReasonForCallSearchField;

	// Dynamic Scripting Answer IDs
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[1]")
	WebElement DSA1;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[2]")
	WebElement DSA2;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[3]")
	WebElement DSA3;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[4]")
	WebElement DSA4;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[5]")
	WebElement DSA5;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[6]")
	WebElement DSA6;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[7]")
	WebElement DSA7;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[8]")
	WebElement DSA8;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[9]")
	WebElement DSA9;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[10]")
	WebElement DSA10;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']//following::input[11]")
	WebElement DSA11;

	// *[contains=@value, 'Yes']
	// *[text()='Yes']

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

	public void NavigateToSRCreateSC() {

	}

	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlCust")
	WebElement SelectCustomerSearch;

	public void SelectCustomerStarbucks() throws InterruptedException {
		SelectCustomerSearch.sendKeys("811");
		Thread.sleep(2000);
		SelectCustomerSearch.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);

	}

	public void SelectCustomerMSI01() throws InterruptedException {
		SelectCustomerSearch.sendKeys("MSI01");
		Thread.sleep(2000);
		SelectCustomerSearch.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);

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

	public void ClientSelect() throws InterruptedException {
		Thread.sleep(2000);
		SelectSitebox.sendKeys("AHD01");
		Thread.sleep(2000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[contains(text(),'(99999)')]")
	WebElement TestSite;

	public void SiteSelect() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(SelectSitebox));
			SelectSitebox.sendKeys("9999");
		} catch (StaleElementReferenceException e2) {
			Utilities.driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(SelectSitebox));
			SelectSitebox.sendKeys("9999");

		}

		try {
			wait.until(ExpectedConditions.elementToBeClickable(TestSite));
			TestSite.click();
		} catch (TimeoutException e) {
			Utilities.driver.navigate().refresh();
			SelectSitebox.sendKeys("9999");
			wait.until(ExpectedConditions.elementToBeClickable(TestSite));
			TestSite.click();
		}

		/*
		 * Thread.sleep(2000); SelectSitebox.sendKeys(Keys.ARROW_DOWN,
		 * Keys.ENTER);
		 */

	}

	public void Siteinput_arrowselect() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SelectSitebox));
		SelectSitebox.sendKeys("9999");
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);

	}

	public void SiteSelectSpecific() throws InterruptedException {

		SelectSitebox.clear();
		SelectSitebox.sendKeys("0059");
		Thread.sleep(2000);
		SelectSitebox.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
	}

	public void MyFSNHelpPageConfirmation() {
		Set<String> WindowHandles = Utilities.driver.getWindowHandles();
		String ActualUrl = Utilities.driver.getCurrentUrl();
		Utilities.driver.switchTo().window("");
		Assert.assertTrue(Utilities.driver.getCurrentUrl().contains("help"),
				"Expected Help page, currently on" + ActualUrl);
	}

	public void SiteAreaNotAvailableCheck() {
		Assert.assertTrue(!SiteAreaDropDown.isDisplayed(), ("Site Area should not be displayed"));
	}

	public void SiteAreaAvailableCheck() {
		wait.until(ExpectedConditions.visibilityOf(SiteAreaDropDown));
		Assert.assertTrue(SiteAreaDropDown.isDisplayed(), ("Site Area should be displayed"));
	}

	public void switchtocurrentwindow() {
		Utilities.driver.switchTo().defaultContent();
	}

	public void closecurrentwidnow() {
		Utilities.driver.close();

	}

	@FindBy(xpath = "//*[contains(text(),'Core Store')]")
	WebElement AreaCoreStore;

	public void SelectArea() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SiteAreaDropDown));
		Select siteareadd = new Select(SiteAreaDropDown);
		wait.until(ExpectedConditions.textToBePresentInElement(AreaCoreStore, "Core Store"));
		siteareadd.selectByVisibleText("Core Store");
	}

	@FindBy(xpath = "//*[contains(text(),'Exterior')]")
	WebElement AreaExterior;

	public void SelectAreaMSI01() throws InterruptedException {
		Select siteareadd = new Select(SiteAreaDropDown);
		wait.until(ExpectedConditions.textToBePresentInElement(AreaExterior, "Exterior"));
		siteareadd.selectByVisibleText("Exterior");

	}

	@FindBy(xpath = "//*[contains(text(),'Sales floor')]")
	WebElement SubAreaSalesFloor;

	public void SelectSubArea() throws InterruptedException {
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		wait.until(ExpectedConditions.textToBePresentInElement(SubAreaSalesFloor, "Sales floor"));
		subsiteareadd.selectByVisibleText("Sales floor");

	}

	@FindBy(xpath = "//*[contains(text(),'Front')]")
	WebElement SubAreaFront;

	public void SelectSubAreaMSI01() throws InterruptedException {
		Select subsiteareadd = new Select(SubSiteAreaDropDown);
		wait.until(ExpectedConditions.textToBePresentInElement(SubAreaFront, "Front"));
		subsiteareadd.selectByVisibleText("Front");
		Thread.sleep(2000);

	}

	@FindBy(xpath = "//*[(text()='Scales')]")
	WebElement LOSScales;

	public void SelectTypeofService() throws InterruptedException {
		Select typeofservicedd = new Select(TypeofService);
		wait.until(ExpectedConditions.textToBePresentInElement(LOSScales, "Scales"));
		typeofservicedd.selectByVisibleText("Scales");

	}

	@FindBy(xpath = "//*[contains(text(),'Damaged/Not Working')]")
	WebElement DamagedReasonforcall;

	public void SelectReasonForCall() throws InterruptedException {
		Select reasondd = new Select(ReasonForCall);
		wait.until(ExpectedConditions.textToBePresentInElement(DamagedReasonforcall, "Damaged/Not Working"));
		reasondd.selectByVisibleText("Damaged/Not Working");

	}

	@FindBy(xpath = "//*[@id='ui-id-7']")
	WebElement AutoSearchResult;

	public void SearchReasonForCall() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ReasonForCallSearchField));
		ReasonForCallSearchField.sendKeys("Automatic");
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.elementToBeClickable(AutoSearchResult));
		ReasonForCallSearchField.sendKeys(Keys.DOWN, Keys.ENTER);
	}

	@FindBy(xpath = " //*[@id='ctl00_ContentPlaceHolder1_ddlSshortDesc']/option[2]")
	WebElement ReasonForCallSelection;

	public void SelectReasonForCallMSI01() throws InterruptedException {
		Select reasondd = new Select(ReasonForCall);
		wait.until(ExpectedConditions.elementToBeClickable(ReasonForCallSelection));
		// reasondd.selectByVisibleText("Alarm Contact/Sensors");
		ReasonForCallSelection.click();

	}

	public void DSQuestionAnswerA1() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DSA1));
		DSA1.click();

	}

	public void DSQuestionAnswerA2() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DSA2));
		DSA2.click();

	}

	public void DSQuestionAnswerA3() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DSA3));
		DSA2.click();
		DSA3.click();

	}

	public void DSQuestionAnswerA4() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DSA3));
		DSA4.click();

	}

	public void AnswerDSQuestions() throws InterruptedException {
		DSQuestionAnswerA1();
		DSQuestionAnswerA4();
	}

	public void EnterRequestByInfo() {
		wait.until(ExpectedConditions.elementToBeClickable(RequesterInfo));
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");

	}

	public void EnterDetailedDescription() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DetailedDescription));
		DetailedDescription.sendKeys("brokenalarm");

	}

	public void SubmitSR() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Submitbtn));
		Submitbtn.click();

	}

	@FindBy(xpath = "//*[@id='divLOSShortdescContent']/div/input")
	WebElement SRLOSAlertOK;

	public void ClearSrLOSAlert() {
		if (SRLOSAlertOK != null) {
			SRLOSAlertOK.click();
		}

	}

	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSLOS']/option[2]")
	WebElement TypeofServiceSelection;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlSshortDesc']/option[2]")
	WebElement ReasonForCallSelectionGeneral;

	public void TypeOfServiceSDSelectionNoDS() {
		wait.until(ExpectedConditions.elementToBeClickable(TypeofServiceSelection));
		TypeofServiceSelection.click();
		wait.until(ExpectedConditions.elementToBeClickable(ReasonForCallSelectionGeneral));
		ReasonForCallSelectionGeneral.click();

	}

	public void WorkOrderInput() {
		WorkOrder.sendKeys(RandomString);
	}

	@FindBy(xpath = "//*[@id='pnlRegularMyFSN']/div[3]/div[1]")
	WebElement MyFSNError;

	@FindBy(id = "ctl00_lblPageTitle")
	WebElement SRDetailPageTitle;

	public void SRDetailCheckClient() {
		wait.until(ExpectedConditions.elementToBeClickable(SRConfirmationLink));
		wait.until(ExpectedConditions.visibilityOf(SRNumberMessage));
		ClearSrLOSAlert();
		SRConfirmationLink.click();
		String urlsrconfirmation = Utilities.driver.getCurrentUrl();
		wait.until(ExpectedConditions.visibilityOf(SRDetailPageTitle));
		if (SRDetailPageTitle.isDisplayed()) {
			System.out.println(SRNumber.getText());
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		} else if (MyFSNError != null) {
			Assert.fail("Error, Service Request number did not return to myFSN after submission");

		} else if (SRSubmissionTimeOutMessage != null) {
			Assert.fail("SR Create timed out");
		} else if (!(SRSubmissionTimeOutMessage != null)) {
			Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
		}

		else {
			Assert.fail("Issue with SR create, requires investigation");
		}

	}

	public void SRCheckServiceCenter() {
		wait.until(ExpectedConditions.visibilityOf(SRNumberMessage));

		if (SRNumberMessage.getText().contains("1-")) {
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		} else if (MyFSNError.isDisplayed()) {
			Assert.fail("Error, Service Request number did not return to myFSN after submission");

		} else if (SRSubmissionTimeOutMessage.isDisplayed()) {
			Assert.fail("SR Create timed out");
		} else if (!SRSubmissionTimeOutMessage.isDisplayed()) {
			Assert.fail("ERROR SERVICE REQUEST PROCESSING TOOK MORE THAN 60 SECONDS WITH NO TIME OUT MESSAGE");
		}

		else {
			Assert.fail("Issue with SR create, requires investigation");
		}

	}

	public void LOSAlertCheck() {
		if (SRNotificationPopup != null) {
			SRNotificationPopup.click();
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
			SRDetailCheckClient();
		}

	}

	public String GetSrNumber() {

		String srnumber = SRNumber.getText();
		System.out.println(srnumber);
		return srnumber;
	}

	public void SRCreationTestHVAC() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		Thread.sleep(1000);
		RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
		DetailedDescription.sendKeys("test");
		Thread.sleep(2000);
		if (SRNotificationPopup.isDisplayed()) {
			SRNotificationPopup.click();
		}

		Submitbtn.click();
		wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
		SRDetailCheckClient();

		/*
		 * SCDropDown.sendKeys("F", Keys.ENTER); SaveChangesbtn.click();
		 * 
		 */

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

		if (SRDetailPagehdr.isDisplayed()) {
			System.out.println("**SERVICE REQUEST CREATION SUCCESSFUL**");

		}

		else if (SRSubmissionTimeOutMessage.isDisplayed()) {
			System.out.println("SR Timed Out, message displayed");
		}
	}

	public void SRCreationTestBioHazardAlertcheck() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

	public void LOSHazardousMaterialSelect() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select typeofservicedd = new Select(TypeofService);
		Thread.sleep(3000);
		typeofservicedd.selectByVisibleText("Hazardous Material Handling");

	}

	public void ReasonForCallSelectBioHazard() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Bio Hazard Clean-Up");

	}

	@FindBy(id = "divLOSShortdescNotifier")
	WebElement SDAlert;
	@FindBy(xpath = "//*[@id='divLOSShortdescNotifier']//following::input[1]")
	WebElement SDAlertClear;

	public void HazardousMaterialAlertCheck() {
		wait.until(ExpectedConditions.visibilityOf(SDAlert));
		Assert.assertTrue(
				SDAlert.getText().contains(
						"Store to contact your Loss Prevention Safety Manager to report any Hazardous Material Handling issues or concerns."),
				"Unexpected Alert, =" + SDAlert.getText());
		SDAlertClear.click();
	}

	@FindBy(xpath = "//*[contains(text(),'Core Store')]")
	WebElement SiteAreaCoreStore;
	@FindBy(xpath = "//*[contains(text(),'Sales floor')]")
	WebElement SiteSubAreaSalesFloor;
	@FindBy(xpath = "//*[contains(text(),'Hazardous Material')]")
	WebElement TypeOfServiceHazardousMaterialHandling;
	@FindBy(xpath = "//*[contains(text(),'Chemical Spill')]")
	WebElement ReasonForCallChemicalSpill;

	// *[Contains(text(),'Core Store')]
	public void ChemicalSpillAlertcheckReasonForCallSelect() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Chemical Spill");

	}

	public void ChemicalDisposalReasonForCallSelect() throws InterruptedException {
		Utilities.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select reasondd = new Select(ReasonForCall);
		Thread.sleep(3000);
		reasondd.selectByVisibleText("Chemical Disposal");

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

			SRDetailCheckClient();

		}

	}
}