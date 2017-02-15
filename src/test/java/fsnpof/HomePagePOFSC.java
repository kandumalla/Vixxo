package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import java.util.UUID;




public class HomePagePOFSC {
	public String uuid = UUID.randomUUID().toString();
			
	@FindBy(id = "ctl00_Menu1_0")
	WebElement Home;

	@FindBy(id = "ctl00_Menu1_1")
	WebElement Inventory;

	// InventorySublinks
	@FindBy(id = "ctl00_Menu1_2")
	WebElement Cyclecount;
	@FindBy(id = "ctl00_Menu1_3")
	WebElement PartsOnHand;
	@FindBy(id = "ctl00_Menu1_4")
	WebElement TransactionSearch;
	@FindBy(id = "ctl00_Menu1_5")
	WebElement ParManagement;
	// InventorySublinks

	@FindBy(id = "ctl00_Menu1_6")
	WebElement Orders;

	@FindBy(id = "ctl00_Menu1_7")
	WebElement Queues;

	// Queue Sublinks
	@FindBy(id = "ctl00_Menu1_8")
	WebElement InvoiceQueue;
	@FindBy(id = "ctl00_Menu1_9")
	WebElement QuoteQue;
	@FindBy(id = "ctl00_Menu1_10")
	WebElement RequisitionQueue;
	// Queue Sublinks

	@FindBy(id = "ctl00_Menu1_11")
	WebElement MyAccount;

	@FindBy(xpath = "//*[contains(text(),'Create new SR')]")
	WebElement CreateNewSRlink;

	@FindBy(id = "ctl00_Menu1_13")
	WebElement PrintVouchers;

	@FindBy(id = "ctl00_Menu1_14")
	WebElement Tools;
    

	@FindBy(id = "ctl00_Menu1_29")
	WebElement Logout;
//Sr list page 
	
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtSRNumber")
	WebElement SRSearchfield;
	@FindBy(id = "ctl00_ContentPlaceHolder1_btnViewSR")
	WebElement SRSearchBtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_pnlButtons")
	WebElement ProcessSRAsContractorbtn;
	@FindBy(id = "img-expand-filter")
	WebElement FilterBtn;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtSRNumber")
	WebElement SRInvoiceSelection;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueMainGrid_gridMainList_ctl03_btnInvoice")
	WebElement SRInvoicebtn;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_btnApplyFilter")
	WebElement FilterResultbtn;
	
	
	


	
	/*public void NavigateToInvoice() {

			Actions action = new Actions(driver);
			action.moveToElement(Queues).perform();
			WebElement subElement = InvoiceQueue;
			action.moveToElement(subElement).click().perform();
			action.click();
			action.perform
			();
			
	
	}
	
	public void SRSearch (String s) {
	String srnumber = null;
	SRSearchfield.sendKeys(srnumber);	
	SRSearchBtn.click();
		
	}
	/*public static WebDriver driver = Utilities.driver;*/

	public static void webdrive() {
	Utilities.webdrive();

	}
	
	public void NavigateToInvoice(String SRreference) {

		Actions action = new Actions(Utilities.driver);
		action.moveToElement(Queues).perform();
		WebElement subElement = InvoiceQueue;
		action.moveToElement(subElement).click().perform();
		FilterBtn.click();
		SRInvoiceSelection.sendKeys(SRreference);
		FilterResultbtn.click();
		SRInvoicebtn.click();
	
		

}
public void srSearch(){
	Actions action = new Actions(Utilities.driver);
	action.moveToElement(Queues).perform();
	WebElement subElement = InvoiceQueue;
	action.moveToElement(subElement).click().perform();
	
}
public void navigatetoSRCreate(){
 CreateNewSRlink.click();	
}
}

