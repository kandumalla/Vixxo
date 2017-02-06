package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

import java.sql.Driver;

import org.openqa.selenium.Alert;

public class InvoicePOFSC extends ServiceRequestDetail {

	@FindBy(id = "ctl00_ContentPlaceHolder1_ImageNext")
	WebElement Nextbtnmain;

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
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxSCQty")
	WebElement SCMaterialQuantity;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxCustQty")
	WebElement CustMaterialQuantity;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxSCPrice")
	WebElement SCMaterialPrice;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxCustPrice")
	WebElement CustMaterialPrice;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxSCTotal")
	WebElement SCMaterialTotal;
	@FindBy(id = "ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts_ctl02_TextboxCustTotal")
	WebElement CustMaterialTotal;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_gridParts']/tbody/tr[2]/td[12]")
	WebElement DeleteMaterialbtn;

	// navigate to asset with keyboard commands, select using enter

	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_btnEdit")
	WebElement LaborEditbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_btnUpdate ")
	WebElement LaborUpdatebtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_ddlLabor")
	WebElement LaborTypeDD;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_laborTaxes_gridLabor']/tbody/tr[2]/td[@class='NumericCell SCDataCell SCDataCell-1']")
	WebElement SCHours;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_laborTaxes_gridLabor']/tbody/tr[2]/td[@class='NumericCell SCDataCell SCDataCell-2']")
	WebElement SCRate;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtSCAmount")
	WebElement SCLaborTotal;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_laborTaxes_gridLabor']/tbody/tr[2]/td[@class='NumericCell CustDataCell CustDataCell-1']")
	WebElement CustomerHours;
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_laborTaxes_gridLabor']/tbody/tr[2]/td[@class='NumericCell CustDataCell CustDataCell-2']")
	WebElement CustomerRate;
	@FindBy(id = "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtCustAmount")
	WebElement CustomerLaborTotal;


	public void NavigatetoInvoice (){
		
	
	}
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_finalValidation_chkAcceptDiff")
	WebElement CalculatedAmountCheckBox;

	public void NextStep() throws InterruptedException {
		Nextbtnmain.click();
		Thread.sleep(2000);
		if (CalculatedAmountCheckBox.isEnabled());
		CalculatedAmountCheckBox.click();
		Nextbtnmain.click();
	}

	public void SCTotalVerification() {
		double SCLaborQty = Integer.parseInt(SCHours.getText());
		
		String RateString = SCRate.getText();
		String RateStringParse = RateString.replace("$","");
		double SCLaborPrc = Double.parseDouble(RateStringParse);
		
		String SCTotalValue = SCLaborTotal.getAttribute("value");
		String SCTotalValueParse = SCTotalValue.replace("$", "");
		System.out.println(SCTotalValueParse);
		double SCTotal = Double.parseDouble(SCTotalValueParse);

		Assert.assertTrue(SCLaborQty * SCLaborPrc == SCTotal);

	}

	public void CustTotalVerification() {
		int CustLaborQuantity = Integer.parseInt(CustomerHours.getText());
		
		String CustLaborString = CustomerRate.getText();
		String CustLaborStringParse= CustLaborString.replace("$", "");
		double CustLaborPrice = Double.parseDouble(CustLaborStringParse);
		
		String CustLaborTotalValue = CustomerLaborTotal.getAttribute("value");
		String CustLaborTotalValueParse = CustLaborTotalValue.replace("$","");
		double CustLaborTotal = Double.parseDouble(CustLaborTotalValueParse);

		Assert.assertTrue(CustLaborPrice * CustLaborQuantity == CustLaborTotal);

	}
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblScTotal")
	WebElement SCTotalSummary;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblCustTotal")
	WebElement CustTotalSummary;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblMarginTotal")
	WebElement MarginPercentageSummary;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ImageSubmit")
	WebElement Submitbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_ucSummary_lblConfirmationMessage")
	WebElement InvoiceConfirmation;
	@FindBy(id = "InvoicingContainer")
	WebElement InvoiceProcessingPage;
	
	
	
	public void SummaryPageValidation() throws InterruptedException{
	
    String SCTotalString= SCTotalSummary.getText();
    String SCTotalParse= SCTotalString.replace("$", "");
    double SCTotalSummary= Double.parseDouble(SCTotalParse);
    
    String CustTotalString= CustTotalSummary.getText();
    String CustTotalParse= CustTotalString.replace("$", "");
    double CustTotalSummary= Double.parseDouble(CustTotalParse);
    
    String MarginString= MarginPercentageSummary.getText();
    String MarginParse= MarginString.replace("%", "");
    double MarginDigits= Double.parseDouble(MarginParse);
    double MarginPercentage= MarginDigits/100;
    System.out.println(MarginPercentage);
    
    double MarginValue = CustTotalSummary-SCTotalSummary;
    System.out.println(MarginValue + " Margin Value");
    double CalculatedMargin = MarginValue/CustTotalSummary;
    System.out.println(CalculatedMargin + " Calculated Margin Percentage");
    double CalculatedMargin2= CalculatedMargin*10000;
    System.out.println(CalculatedMargin2 + " Prerounding");
    double CalculatedMarginBigRounded= Math.round(CalculatedMargin2);
    double CalculatedMarginRounded= CalculatedMarginBigRounded/100;
  
    System.out.println(CalculatedMarginRounded + " Rounded Value");
    
    Assert.assertTrue("Margin Calculation Error", CalculatedMarginRounded==MarginDigits);
    
    Submitbtn.click();
    Assert.assertTrue(InvoiceProcessingPage.isDisplayed());
    Thread.sleep(10000);
    if (InvoiceConfirmation.isEnabled()){
    	
    System.out.println("Invoice Submitted Successfully");	
    
    }  else { 
    	Assert.fail("Invoice did not process");
    	
    }
    
    
		
    }
    
	

	@FindBy(id = "ctl00_ContentPlaceHolder1_lnkAttach")
	WebElement AttachFilebtn;
	@FindBy(id = "frmShowAttachment")
	WebElement FileAttachmentFrame;
	@FindBy(id = "attachment")
	WebElement Choosefilebtn;
	@FindBy(id = "ImageNext")
	WebElement Nextbtnframe;
	@FindBy(id = "lnkAttachAnother")
	WebElement AttachAnotherFile;
	
	

	public void FileAttachment() {
		AttachFilebtn.click();
		driver.switchTo().frame(FileAttachmentFrame);
		Choosefilebtn.sendKeys("C:\\Users\\dmohamed\\Desktop\\testPDF.pdf");
		Assert.assertTrue("File Attachment Successful",AttachAnotherFile.isDisplayed() );
		if (AttachAnotherFile.isDisplayed()){
			System.out.println("File Attachment Successful");
			
		}

	
	
	}

	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;

	}
}
