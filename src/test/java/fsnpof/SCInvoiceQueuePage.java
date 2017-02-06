package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.jboss.netty.handler.codec.spdy.SpdyRstStreamFrame;
import org.openqa.selenium.Alert;

public class SCInvoiceQueuePage {
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtSRNumber")
	WebElement SRSearchField;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtICAutocomplete")
	WebElement TechnicianSearchField;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueICExceptionGrid_txtICAutocomplete")
	WebElement ApplyFilterButton;
	@FindBy(id = "ctl00_ContentPlaceHolder1_invoiceQueueMainGrid_gridMainList_ctl03_btnInvoice")
	WebElement CreateInvoiceButton;
	
	


public static WebDriver driver = Utilities.driver;


	public static void webdrive() {
		Utilities.webdrive();

	}
public void InvoiceCreateSC() {
	String srnumber = null;
	SRSearchField.sendKeys(srnumber);
	ApplyFilterButton.click();
	CreateInvoiceButton.click();
	
  
		

	}
	
}