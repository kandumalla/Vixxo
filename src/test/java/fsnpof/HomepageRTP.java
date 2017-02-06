
package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;

public class HomepageRTP {
	
		//Navigation Links
		@FindBy(id = "ctl00_Menu1_0")
		WebElement Home;

		@FindBy(id = "ctl00_Menu1_1")
		WebElement MyAccount;

		
		@FindBy(id = "ctl00_Menu1_2")
		WebElement Tools;
			@FindBy(id = "ctl00_Menu1_3")
			WebElement SRInvoicing;
		@FindBy(id = "ctl00_Menu1_4")
		WebElement LogOut;

	//HomePage Text Fields
		
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtSRNumber")
		WebElement SRNumberSearchField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_btnStartInvoicing")
		WebElement StartInvoicingBtn;
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtSCName")
		WebElement SCNameField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtSCNumber")
		WebElement SCNumberField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtSiteNumber")
		WebElement SiteNumberField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtSiteName")
		WebElement SiteNameField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_ddlSRType")
		WebElement SRTypeDD;
		@FindBy(id = "ctl00_ContentPlaceHolder1_btnSearchSR")
		WebElement SearchBtn;
		@FindBy(id = "ctl00_ContentPlaceHolder1_lnkLoadHistory")
		WebElement ShowSRInvoicedbyMeLink;
		@FindBy(id = "ctl00_ContentPlaceHolder1_txtHistoryBySRNumber")
		WebElement HistorybySRNumberField;
		@FindBy(id = "ctl00_ContentPlaceHolder1_btnHistoryBySRNumber")
		WebElement HistorySRLookupBtn;
		@FindBy(id = "ctl00_ContentPlaceHolder1_btnYes")
		WebElement ContinueProcessingThisInvoice;
		@FindBy(id = "ctl00_ContentPlaceHolder1_btnYes")
		WebElement MatchingPaperworkYes;
		
		
		public void NavigateToInvoice(String SRreference) {
		SRNumberSearchField.sendKeys(SRreference);
		StartInvoicingBtn.click();
		ContinueProcessingThisInvoice.click();
		MatchingPaperworkYes.click();

			

	}
		




		public static void webdrive() {
		Utilities.webdrive();

		}
		


	}





