package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;

public class QueuesPOFSC {
	// Invoice Queue
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtICAutocomplete")
	WebElement TechnicianField;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtSRNumber")
	WebElement SRNumberField;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_lstRegions")
	WebElement RegionFieldd;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_ddlLOS")
	WebElement LOSdd;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_ddlCustNumber")
	WebElement CustomerNumberdd;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_ddlCRM")
	WebElement CRMdd;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_ddlExceptionTypes")
	WebElement ExceptionTypedd;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtStartDate")
	WebElement WorkDateFrom;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtEndDate")
	WebElement WorkDateTo;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtAssignedTo")
	WebElement AssignedTOfield;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_btnApplyFilter")
	WebElement ApplyFilterbtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_btnClearFilte")
	WebElement Clearfilterbtn;
	@FindBy(id = "tl00_ContentPlaceHolder1_invoiceQueueMainGrid_gridMainList_ctl03_btnInvoice")
	WebElement InvoiceBtn;

	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;

	}
}
