package fsnpof;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;

public class HomePagePOF {
	//TopLinks
	@FindBy (id="ctl00_Menu1_0")
	WebElement Homebtnsp;
	@FindBy (id="ctl00_Menu1_1")
	WebElement InvoiceRejectedListbtnsp;
	@FindBy (id="ctl00_Menu1_2")
	WebElement MySitesbtnsp;
	@FindBy (id="ctl00_Menu1_3")
	WebElement MyAccountsbtnsp;
	@FindBy (id="ctl00_Menu1_4")
	WebElement ReferenceMaterialsbtnsp;
	@FindBy (id="ctl00_Menu1_10")
	WebElement Logoutbtnsp;
	// TopLink Methods 
	
	public void HomePageNaviate (){
	Homebtnsp.click();	
		
	}
	public void InvoiceRejectedListNaviate (){
		InvoiceRejectedListbtnsp.click();	
			
		}
	public void MySitesNaviate (){
		MySitesbtnsp.click();	
			
		}
	public void MyAccountNaviate (){
		MyAccountsbtnsp.click();	
			
		}
	public void Logout (){
		Logoutbtnsp.click();	
			
		}
	//Buckets
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
	WebElement NeedanETAsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
	WebElement NeedaTimeINsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
	WebElement NeedaTimeOUTsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
	WebElement NeedaQuotesp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl04_HyperlinkCatDet")
	WebElement QuotesNeedingApprovalsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl05_HyperlinkCatDet")
	WebElement PartsOnOrdersp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl06_HyperlinkCatDet")
	WebElement NeedAnInvoicesp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl07_HyperlinkCatDet")
	WebElement ProblemInvoicesp;
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl08_HyperlinkCatDet")
	WebElement UnderFSNreviewsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_trFSNPM")
	WebElement PlannedMaitenancesp; 
	@FindBy (id="ctl00_ContentPlaceHolder1_ibSRNum")
	WebElement SRSearchButtonsp;
	//bucket methods 

	public void NeedanETAClick (){
		NeedanETAsp.click();
		
	}
	public void NeedaTimeINclick (){
		NeedaTimeINsp.click();
		
	}
	public void Needatimeoutclick (){
		NeedaTimeOUTsp.click();
		
	}
	public void NeedaQuoteclick (){
		NeedaQuotesp.click();
		
	}
	public void QuoteApprovalClick (){
		QuotesNeedingApprovalsp.click();
		
	}
	public void PartsonOrderclick (){
		PartsOnOrdersp.click();
		
	}
	public void NeedanInvoiceClick (){
		NeedAnInvoicesp.click();
		
	}
	public void ProblemInvoiceClick (){
		ProblemInvoicesp.click();
		
	}
	public void UnderReviewClick (){
		UnderFSNreviewsp.click();
		
	}
	
	@FindBy (id="ctl00_ContentPlaceHolder1_tbSingleInvNum")
	WebElement InvoiceSearchFieldsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_ibSearchInv")
	WebElement InvoiceSearchbtnsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbSRNum")
	WebElement SRSearchFieldsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_ibSRNum")
	WebElement SRSearchbtnsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_ibSRNum")
	WebElement SRDateSearchsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_ibSROpenDate")
	WebElement SRDateSearchbtnsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_TextboxSite")
	WebElement SearchSiteTextBoxsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_cbSiteAssets")
	WebElement IncludeAssetscheckboxsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_btnSiteHistory")
	WebElement ViewHistoryBtnsp;
	@FindBy (id="ctl00_ContentPlaceHolder1_rptrSRData_ctl01_hlSR#")
	WebElement SRNumberLinksp;


	

	

	
	
	public static WebDriver driver;

	public static void webdrive() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver = chromedriver;

	}
	

}
