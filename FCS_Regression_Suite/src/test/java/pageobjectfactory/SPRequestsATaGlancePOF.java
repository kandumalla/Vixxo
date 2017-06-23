package pageobjectfactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert; 

public class SPRequestsATaGlancePOF {



//Buckets 
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl00_HyperlinkCatDet")
WebElement NeedanETA;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl01_HyperlinkCatDet")
WebElement NeedaTimeIN;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl02_HyperlinkCatDet")
WebElement NeedaTimeOUT;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl03_HyperlinkCatDet")
WebElement NeedaQuote;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl04_HyperlinkCatDet")
WebElement QuotesNeedingApproval;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl05_HyperlinkCatDet")
WebElement PartsOnOrder;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl06_HyperlinkCatDet")
WebElement NeedAnInvoice;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl07_HyperlinkCatDet")
WebElement ProblemInvoice;
@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterReqCat_ctl00_RepeaterReqCatDetails_ctl08_HyperlinkCatDet")
WebElement UnderFSNreview;
@FindBy (id="ctl00_ContentPlaceHolder1_trFSNPM")
WebElement PlannedMaitenance; 

//bucket methods 

public void NeedanETAClick (){
	NeedanETA.click();
	
}
public void NeedaTimeINclick (){
	NeedaTimeIN.click();
	
}
public void Needatimeoutclick (){
	NeedaTimeOUT.click();
	
}
public void NeedaQuoteclick (){
	NeedaQuote.click();
	
}
public void QuoteApprovalClick (){
	QuotesNeedingApproval.click();
	
}
public void PartsonOrderclick (){
	PartsOnOrder.click();
	
}
public void NeedanInvoiceClick (){
	NeedAnInvoice.click();
	
}
public void ProblemInvoiceClick (){
	ProblemInvoice.click();
	
}
public void UnderReviewClick (){
	UnderFSNreview.click();
	
}

//Service Request Detail Page 
@FindBy (id="ctl00_ContentPlaceHolder1_siteNumLink")
WebElement SiteHistoryLink; 

@FindBy (id="ctl00_ContentPlaceHolder1_siteInfoLink")
WebElement SiteInfoLink; 

@FindBy (id="ctl00_ContentPlaceHolder1_contactButton")
WebElement EmailContactBtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_helpButton")
WebElement HelpBtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_btnManageAssets")
WebElement ManageAssetsbtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_createInvoiceButton")
WebElement CreateInvoicebtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_createQuoteButton")
WebElement QuoteBtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_createFSNNoteButton")
WebElement CreateNoteBtn; 

@FindBy (id="ctl00$ContentPlaceHolder1$createNoteButton")
WebElement CreateNewSRNotebtn ; 

@FindBy (id="ctl00_ContentPlaceHolder1_checkInButton")
WebElement CheckInbtn; 
	
@FindBy (id="ctl00_ContentPlaceHolder1_checkOutButton")
WebElement CheckOutbtn; 
//Service Request Detail Page Methods 

//Invoice Creation
@FindBy (id="ctl00_ContentPlaceHolder1_LabelSRNumberHeader")
WebElement SRNumberText; 

@FindBy (id="ctl00_ContentPlaceHolder1_TextboxInvNum")
WebElement InvoiceNumberField; 

@FindBy (id="ctl00_ContentPlaceHolder1_TextboxInvAmt")
WebElement InvoiceAmountField; 

@FindBy (id="ctl00_ContentPlaceHolder1_TextboxWorkDate")
WebElement WorkDateField; 

@FindBy (id="ctl00_ContentPlaceHolder1_ImageNext")
WebElement Nextbtn; 

@FindBy (id="ctl00_ContentPlaceHolder1_gridParts_ctl02_TextboxQty")
WebElement QuantityMaterialBox ;

@FindBy (id="ctl00_ContentPlaceHolder1_gridParts_ctl02_TextboxPrice")
WebElement MaterialPriceBox;

@FindBy (linkText="Manage Assets")
WebElement ManageAssestsLink;

@FindBy (linkText="Update")
WebElement UpdateLink;

@FindBy (linkText="Add New Work Performed")
WebElement AddNewWorkLink;

@FindBy (id="ctl00_ContentPlaceHolder1_txtSubTotal")
WebElement LaborTotal;

@FindBy (id="ctl00_ContentPlaceHolder1_txtSubTotal")
WebElement TaxLineBox;


}
