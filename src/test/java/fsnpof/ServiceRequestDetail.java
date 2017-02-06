package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import swtPOF.UtilitiesSWT;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NotFoundException;

public class ServiceRequestDetail {
	@FindBy(id = "ctl00_ContentPlaceHolder1_ibSRNum")
	WebElement SPSRSearchbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_tbSRNum")
	WebElement SPSRSearchbox;

	// Activity Management
	@FindBy(id = "ctl00_ContentPlaceHolder1_checkInButton")
	WebElement CheckinBtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_checkOutButton")
	WebElement CheckOutBtn;
	@FindBy(id = "ddlCompleted")
	WebElement JobCompleteDropDown;
	@FindBy(id = "ifrmManageActivity")
	WebElement ManageActivityBox;
	@FindBy(id = "ifrmManageActivity")
	WebElement ManageActivitybtn;
	@FindBy(id = "txtETA")
	WebElement ETABox;
	@FindBy(id = "TextboxSRNote")
	WebElement TextBoxSRNote;
	@FindBy(id = "txtTimeIn")
	WebElement TimeinBox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_timeInRepair")
	WebElement Timeinstamp;
	@FindBy(id = "txtTimeOut")
	WebElement TimeoutBox;
	@FindBy(id = "txtReturnETA")
	WebElement ReturnETABox;
	@FindBy(id = "btnSave")
	WebElement SavebtnActivityPopup;
	@FindBy(id = "ctl00_ContentPlaceHolder1_rptrSRData_ctl01_hlSR#")
	WebElement SRListSelect;
	@FindBy(id = "ctl00_ContentPlaceHolder1_createInvoiceButton")
	WebElement CreateInvoicebtn;
	@FindBy(id = "	ctl00_ContentPlaceHolder1_slaDealine")
	WebElement ResponeSLADate;
	@FindBy(id = "ddlResolutionCode")
	WebElement ResolutionCode;
	

	
	public void ETASubmit (){
		String ETA=ResponeSLADate.getText();
		ManageActivitybtn.click();
		Utilities.driver.switchTo().frame(ManageActivityBox);
		ETABox.sendKeys(ETA);
		SavebtnActivityPopup.click();
		
		
	}
	
	public void TimeIn (){
		CheckinBtn.click();
	}
	public void Timeout (){
		CheckinBtn.click();
	}
	
	public boolean ResolutionCodeEnabled (){

		 try 
		    { 
		        ResolutionCode.isDisplayed();
		        return true; 
		    }   // try 
		    catch (NotFoundException Ex) 
		    { 
		        return false; 
		    }   // catch 
		
	}
	
	
	public void ActivtityCompletition() throws InterruptedException {
		CheckinBtn.click();
		Thread.sleep(2000);
		String Timein = Timeinstamp.getText();
		CheckOutBtn.click();
		Thread.sleep(5000);
		Alert savealert =Utilities.driver.switchTo().alert();
		savealert.accept();
		Thread.sleep(2000);
		Utilities.driver.switchTo().frame(ManageActivityBox);
		ETABox.clear();
		ETABox.sendKeys(Timein);
		/*
		 * //Thread.sleep(2000); TimeinBox.clear();
		 * TimeinBox.sendKeys("8/1/2016 1:35:00 PM"); //Thread.sleep(2000);
		 * TimeoutBox.clear(); TimeoutBox.sendKeys("8/1/2016 1:40:00 PM");
		 * //Thread.sleep(2000);
		 */
		JobCompleteDropDown.sendKeys("y");
		Thread.sleep(2000);
		if (ResolutionCodeEnabled()){
			ResolutionCode.sendKeys("Service Completed");
		}
		TextBoxSRNote.sendKeys("test");
		SavebtnActivityPopup.click();
		Thread.sleep(3000);
		SavebtnActivityPopup.click();
	}
	


	// Invoice Module Billing Requirements
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextboxInvNum")
	WebElement InvoiceNumberfield;
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextboxInvAmt")
	WebElement InvoiceAmount;
	@FindBy(id = "ctl00_ContentPlaceHolder1_LabelSiteLimit")
	WebElement NTE;
	@FindBy(id = "ctl00_ContentPlaceHolder1_DropdownlistSignature")
	WebElement CustomerSignatureDropDown;
	@FindBy(id = "ctl00_ContentPlaceHolder1_TextboxWorkDate")
	WebElement WorkDateField;
	@FindBy(xpath = "//*[@class='datepick-current']/a")
	WebElement TodaysDatebtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_LabelSRNumberHeader")
	WebElement SRNumberBillingReqOld;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_contactInfo_serviceRequestNumberLabel")
	WebElement SRNumberBillingReqNew;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_DropdownlistSignature")
	WebElement CustomerSignatureQuestion;
	// Remember to include work date alert acceptance before proceeding to step

	// Invoice SP Labor and Taxes
	@FindBy(id = "ctl00_ContentPlaceHolder1_gridLabor_ctl02_ddlLabor")
	WebElement LabortypeDD;
	@FindBy(id = "ctl00_ContentPlaceHolder1_gridLabor_ctl02_txtQty")
	WebElement HoursSP;
	@FindBy(id = "ctl00_ContentPlaceHolder1_gridLabor_ctl02_btnEdit")
	WebElement EditbtnLabor;
	@FindBy(id = "ctl00_ContentPlaceHolder1_gridLabor_ctl02_btnUpdate")
	WebElement UpdatebtnLabor;

	// Invoicing Steps Work Performed.Assets.Parts
	@FindBy(xpath = "//*[contains(@href,'Edit$0')]")
	WebElement Editbtn0;
	@FindBy(xpath = "//*[contains(@onclick,'Update$0')]")
	WebElement Updatebtn0;
	@FindBy(xpath = "//*[contains(@href,'Edit$1')]")
	WebElement Editbtn1;
	@FindBy(xpath = "//*[contains(@onclick,'Update$1')]")
	WebElement Updatebtn1;
	@FindBy(xpath = "//*[contains(@href,'Edit$2')]")
	WebElement Editbtn2;
	@FindBy(xpath = "//*[contains(@onclick,'Update$2')]")
	WebElement Updatebtn2;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridWorkPerf_ctl02_DropdownlistEquipment ")
	WebElement AssetDropDownWrkPerformed;
	@FindBy(xpath = "//*[contains(@onclick,'workperf')]")
	WebElement AddNewWorkPerformedbtn;
	@FindBy(id = "frameAddWPorParts ")
	WebElement AddNewWorkSearchFrame;
	// navigate to asset with keyboard commands, select using enter

	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_btnEdit")
	WebElement LaborEditbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_btnUpdate ")
	WebElement LaborUpdatebtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_ddlLabor")
	WebElement LaborTypeDD;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtSCQty")
	WebElement SCHours;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtSCRate")
	WebElement SCRate;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtCustQty")
	WebElement CustomerHours;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtCustRate")
	WebElement CustomerRate;

	@FindBy(id = "btnSearch")
	WebElement SearcbtnAddNewWork;
	// Will have to use keyboard commands to navigate to the first asset type
	@FindBy(id = "ui-id-216-button")
	WebElement AssetSelection;
	// Will have to use keyboard commands to navigate to the first asset
	// selection
	@FindBy(id = "btnAddCheckedItems ")
	WebElement AddCheckeditemsbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_btnCloseAddWPorParts")
	WebElement CloseWindowbtn;

	// RTPSpecificObjects

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtSRNumber")
	WebElement SRSearchRTP;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnYes")
	WebElement YesContinueInvoice;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnYes")
	WebElement YesPaperWorkMatch;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lnkAttach")
	WebElement InvoiceAttachmentrtpbtn;
	// InvoiceAttachment
	@FindBy(id = "frmShowAttachment")
	WebElement FileAttachmentFrame;
	@FindBy(id = "attachment")
	WebElement Choosefilebtn;
	//Submit invoice 
	
	
	@FindBy(xpath = "//*[@id='InvoicingContainer']/div[1]/div/ul/li[3]")
	WebElement SubmitInvoicebtn;
	
	
	// Need additional research on attaching files
	@FindBy(id = "ImageNext")
	WebElement Nextbtnframe;
	@FindBy(id = "btnShowAttachmentClose")
	WebElement CloseFileAttachWindow;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ImageNext")
	WebElement NextStep1;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lnkAccept")
	WebElement AcceptCalculatedAmountSelection;
	@FindBy(id = "ctl00_ContentPlaceHolder1_finalValidation_chkAcceptDiff")
	WebElement InvoiceVarianceAcceptanceCheckBox;
	@FindBy(id = "ctl00_ContentPlaceHolder1_attachment")
	WebElement InvoiceAttachmenttbnSP;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ImageSubmit")
	WebElement SubmitInvoice;
	// Confirmation page
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblNoPaymentReferenceNumber")
    WebElement InvoiceReferenceNumber;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblSRNumber")
    WebElement SRNumberConfirmationPage;

	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridWork']/tbody/tr[2]/td[1]")
	WebElement WorkPerformedConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridWork']/tbody/tr[2]/td[2]")
	WebElement AssetConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridLaborServiceCenterView']/tbody/tr[2]/td[@class='GridViewWideColumn']]")
	WebElement LaborTypeConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridLaborServiceCenterView']/tbody/tr[2]/td[@class='NumericCell'][1]")
	WebElement HoursConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridLaborServiceCenterView']/tbody/tr[2]/td[@class='NumericCell'][2]")
	WebElement SystemRateConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridLaborServiceCenterView']/tbody/tr[2]/td[@class='NumericCell'][3]")
	WebElement RequestedRateConfirmationPage;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ucSummary_gridLaborServiceCenterView']/tbody/tr[2]/td[@class='NumericCell'][4]")
	WebElement RequestedRate;
	


	@FindBy(xpath = "ctl00_ContentPlaceHolder1_lblTaxExempt")
	WebElement TaxExempt;
	
	
	
	

	public static WebDriver driver = Utilities.driver;

	public static void webdrive() {
		Utilities.webdrive();
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;*/

	}

	public void SPSRSearch(String srnumber) {
		SPSRSearchbox.sendKeys(srnumber);
		SPSRSearchbtn.click();

	}

	public void SRSelect() {

		SRListSelect.click();

	}

	
	public void InvoiceCreate (){
	CreateInvoicebtn.click();

	}

	public String InvoiceBillingRequirementCompletion(String Srnumber) throws InterruptedException {
		String srnumber2 = SRNumberBillingReqNew.getText(); //Example of getting Service request number in invoice class 
		InvoiceNumberfield.sendKeys(srnumber2);
		InvoiceAmount.clear();
		InvoiceAmount.sendKeys("0.00");
		WorkDateField.click();
		Thread.sleep(2000);
		TodaysDatebtn.click();
		WorkDateField.sendKeys(Keys.ENTER);
		CustomerSignatureQuestion.sendKeys("Y", Keys.TAB);
		NextStep1.click();
		return srnumber2;

	}



	public void SPInvoiceWorkPerformed() throws InterruptedException {
		
		Editbtn0.click();
		Thread.sleep(2000);
		/*
		 * if (isAlertPresent()) {Utilities.driver.switchTo().alert().accept(); }
		 */
		Updatebtn0.click();
		Thread.sleep(2000);
		NextStep1.click();

	}
	
	@FindBy (id="frameAddWPorParts")
	WebElement AddWorkPartsIframe;
	@FindBy (id="txtSearch")
	WebElement SearchFieldWorkPartsiframe;
	@FindBy (id="btnSearch")
	WebElement SearchBtnhWorkPartsiframe;
	@FindBy (id="dialogNoResults")
	WebElement NoResultsMessageiframe;
	@FindBy (xpath="/html/body/div[3]/div[3]/div/button/span")
	WebElement NoResultsMessageOK;
	@FindBy (id="ctl00_ContentPlaceHolder1_btnCloseAddWPorParts")
	WebElement CloseWindow;
	

	
public void SPInvoiceWorkPerformedMSITravelandTruckChargeCheck() throws InterruptedException {
		AddNewWorkPerformedbtn.click();
		driver.switchTo().frame(AddWorkPartsIframe);
		SearchFieldWorkPartsiframe.sendKeys("\"Truck Charge\"");
		SearchBtnhWorkPartsiframe.click();
		Thread.sleep(2000);
		Assert.assertTrue(NoResultsMessageiframe.isDisplayed(), "No Results Dialog Not Detected");
		NoResultsMessageOK.click();
		//Assert.assertTrue(Popup.getText().contains("No results found, please try different keywords"));
		SearchFieldWorkPartsiframe.clear();
		SearchFieldWorkPartsiframe.sendKeys("\"Travel Service Charge\"");
		SearchBtnhWorkPartsiframe.click();
		Thread.sleep(2000);
		Assert.assertTrue(NoResultsMessageiframe.isDisplayed(), "No Results Dialog Not Detected");
		NoResultsMessageOK.click();
		driver.switchTo().defaultContent();
		CloseWindow.click();
		

	}
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtSubTotal")
	WebElement LaborTotal;
	@FindBy(id = "ctl00_ContentPlaceHolder1_lblTaxS")
	WebElement TaxAmt;
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtTotal")
	WebElement LaborTaxTotal;
	@FindBy(id = "ctl00_ContentPlaceHolder1_gridLabor_ctl02_txtRate")
	WebElement RateSP;
	//*[@id='ctl00_ContentPlaceHolder1_gridLabor']/tbody/tr[2]/td[@class='NumericCell'][1]
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_gridLabor']/tbody/tr[2]/td[@class='NumericCell'][1]")
	WebElement HoursSPInput;
    String Taxvalue; 
	public boolean PresenceofTaxamt(){
		TaxAmt.isDisplayed();
		return false;
		
	}
	public boolean PresenceofTaxNA(){
		TaxAmt.isDisplayed();
		TaxAmt.getText().contains("N/A");
		return false;
		
	}
	public boolean PresenceofTaxExempt(){
		TaxExempt.isDisplayed();
		
		return false;
		
	}

public void SPInvoiceLaboraPartsandSummary() throws InterruptedException {
		EditbtnLabor.click();
		Thread.sleep(2000);
		HoursSP.clear();
		HoursSP.sendKeys("1");
		UpdatebtnLabor.click();
		Thread.sleep(2000);
		
		double LaborHours = Double.parseDouble(HoursSPInput.getText());
		System.out.println(LaborHours);
		String LaborValue = RateSP.getAttribute("value");
		String LaborValue1 = LaborValue.replace("$", "");
		System.out.println(LaborValue1);
		double LaborRate = Double.parseDouble(LaborValue1);
		String SPTotalValue = LaborTotal.getAttribute("value");
		String SPTotalValue1= SPTotalValue.replace("$", "");
		double SPTotal = Double.parseDouble(SPTotalValue1);
		Assert.assertTrue(LaborHours*LaborRate==SPTotal, "Labor Total Mismatch");
		if (PresenceofTaxamt()){
        String Taxvalue = TaxAmt.getText();
		}
		else if (PresenceofTaxExempt()){
		String Taxvalue = TaxExempt.getText();	
		}
        //Complicated ass tax check 
        if (PresenceofTaxNA()){
        	String TaxRealValue=Taxvalue.replace("N/A", "0");
        	double Tax= Double.parseDouble(TaxRealValue);
        	String TotalLaborTax = LaborTaxTotal.getAttribute("value");
        	String TotalLaborTax1= TotalLaborTax.replace("$", "");
        	double Total = Double.parseDouble(TotalLaborTax1);
        	
        	
        	Assert.assertTrue(SPTotal+Tax==Total, "Labor + Tax Mismatch");
        	System.out.println(SPTotal+Tax +"  Sum of Labor and Taxes ");
        	System.out.println( Total + "  MyFSN Calculation");
        }
        else if (PresenceofTaxExempt()){
        	String TaxRealValue=Taxvalue.replace("(Tax Exempt)", "0");
        	double Tax= Double.parseDouble(TaxRealValue);
        	String TotalLaborTax = LaborTaxTotal.getAttribute("value");
        	String TotalLaborTax1= TotalLaborTax.replace("$", "");
        	double Total = Double.parseDouble(TotalLaborTax1);
        	
        	
        	Assert.assertTrue(SPTotal+Tax==Total, "Labor + Tax Mismatch");
        	System.out.println(SPTotal+Tax +"  Sum of Labor and Taxes ");
        	System.out.println( Total + "  MyFSN Calculation");
        }
        else if (!PresenceofTaxNA()&!PresenceofTaxExempt()){
        //String TaxRealValue=Taxvalue.replace("N/A", "0");
        double Tax= Double.parseDouble(Taxvalue);
        String TotalLaborTax = LaborTaxTotal.getAttribute("value");
    	String TotalLaborTax1= TotalLaborTax.replace("$", "");
    	double Total = Double.parseDouble(TotalLaborTax1);
		Assert.assertTrue(SPTotal+Tax==Total, "Labor + Tax Mismatch");
        }
        
        
		NextStep1.click();
		NextStep1.click();
		AcceptCalculatedAmountSelection.click();
		
		

	}

@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_gridLabor']/tbody/tr[2]/td[@class='NumericCell'][1]")
WebElement X;

public void SPInvoiceLaboraPartsandSummaryMSI() throws InterruptedException {
	EditbtnLabor.click();
	Thread.sleep(2000);
	HoursSP.clear();
	HoursSP.sendKeys("1");
	UpdatebtnLabor.click();
	Thread.sleep(2000);
/*	driver.switchTo().alert().accept();*/
	double LaborHours = Double.parseDouble(HoursSPInput.getText());
	System.out.println(LaborHours);
	String LaborValue = RateSP.getAttribute("value");
	String LaborValue1 = LaborValue.replace("$", "");
	System.out.println(LaborValue1);
	double LaborRate = Double.parseDouble(LaborValue1);
	String SPTotalValue = LaborTotal.getAttribute("value");
	String SPTotalValue1= SPTotalValue.replace("$", "");
	double SPTotal = Double.parseDouble(SPTotalValue1);
	Assert.assertTrue(LaborHours*LaborRate==SPTotal, "Labor Total Mismatch");

    
    
	NextStep1.click();
	NextStep1.click();
	AcceptCalculatedAmountSelection.click();
	
	

}

	public void SPInvoiceAttachment() {
    InvoiceAttachmenttbnSP.sendKeys("C:\\Users\\dmohamed\\Desktop\\testPDF.pdf");
    NextStep1.click();
    SubmitInvoicebtn.click();
	}
	
	//InvoiceConfirmation 
	@FindBy(id= "ctl00_ContentPlaceHolder1_ucSummary_confMessage")
	WebElement InvoiceConfirmationMessage;
	@FindBy(id= "ctl00_ContentPlaceHolder1_ucSummary_lblSRNumber")
	WebElement SRNumberInvoiceConfirmation;
	@FindBy(id= "ctl00_ContentPlaceHolder1_ucSummary_lblGrandTotal")
	WebElement InvoiceTotalConfirmation;
	
	public String InvoiceConfirmation () throws InterruptedException{
	Utilities.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	if (InvoiceConfirmationMessage.isDisplayed()) {
	System.out.println("MyFSN SP invoice submission successful");	
	}
	else {
	Assert.fail("MyFSN SP invoice submission failed");
	}
	String Srnumber3 = SRNumberInvoiceConfirmation.getText();
	System.out.println(Srnumber3);
	
	return Srnumber3; 
	}
	
	
	
}
