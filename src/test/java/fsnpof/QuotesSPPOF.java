package fsnpof;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class QuotesSPPOF {
@FindBy (id="ctl00_ContentPlaceHolder1_createQuoteButton")
WebElement CreateQuoteBtn; 

public void QuoteCreateStart (){
CreateQuoteBtn.click();	
}
@FindBy (id="ctl00_TextboxStepInfo")
WebElement QuoteStartPage;

public void QuotePageAssertion (){
Assert.assertTrue(QuoteStartPage.isDisplayed(), "Quote Page Not Displayed");

}

@FindBy (id="Anthem_ctl00_ContentPlaceHolder1_workDonePartsUsed_lnkManageAssets__")
WebElement ManageAssets;			
@FindBy (xpath="//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_DivRegular']/table[1]/tbody/tr/td[2]/a")
WebElement AddNewWorkPerformed;
@FindBy (xpath="//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_gridWorkPerf']/tbody/tr[2]/td[3]/a[1]")
WebElement EditWorkPerformed;
@FindBy (xpath="//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_gridWorkPerf']/tbody/tr[2]/td[3]/a[1]")
WebElement UpdateWorkPerformed;
@FindBy (xpath="//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_gridWorkPerf']/tbody/tr[2]/td[3]/a[2]")
WebElement DeleteWorkPerformed;
@FindBy (id= "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_ddlLabor")
WebElement LaborTypeDD;
@FindBy (id= "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtSCQty")
WebElement LaborHoursField; 
@FindBy (id= "ctl00_ContentPlaceHolder1_laborTaxes_gridLabor_ctl02_txtSCRate")
WebElement LaborRateField; 
@FindBy (id= "txtQuoteNote")
WebElement QuoteDescriptionBox; 
//Add work.parts <Iframe>

@FindBy (id="frameAddWPorParts")
WebElement AddworkPerformedsSearchIframe;
@FindBy (id="btnSearch")
WebElement WorkPerformedSearchBtn;
@FindBy (id="txtSearch")
WebElement WorkPerformedSearchField;
@FindBy (id="btnAddCheckedItems")
WebElement AddCheckedItems;
@FindBy (id="ui-id-5")
WebElement AssetSelectDD1; 
@FindBy (id="ui-id-47-button")
WebElement AssetSelectDD2;


//Add work.parts </Iframe>
@FindBy (id="ctl00_ContentPlaceHolder1_workDonePartsUsed_btnCloseAddWPorParts")
WebElement CloseWorkPartsIframebtn;
@FindBy (id="ctl00_ContentPlaceHolder1_ImageNext")
WebElement Nextbtn;
@FindBy (xpath="//*[@id='ctl00_ContentPlaceHolder1_workDonePartsUsed_gridWorkPerf']/tbody/tr[2]/td[2]")
WebElement AssetSelected1;


public void WorkPerformedEquipmentCheck(){
EditWorkPerformed.click();
//Update
UpdateWorkPerformed.click();


	
}

String LaborType = "TECHNICIAN LABOR";
public void LaborSelection (){

Select LaborDD = new Select(LaborTypeDD);
LaborDD.selectByVisibleText(LaborType);
}

String LaborQuantity = "1";

public void LaborHours(){
LaborHoursField.sendKeys(LaborQuantity);	
}

public void QuoteDescriptionEntry(){
QuoteDescriptionBox.sendKeys("Test Description");
}

public void QuoteNextStep (){
Nextbtn.click();
}

@FindBy (id="ctl00_ContentPlaceHolder1_ImageNext")
WebElement QuoteSummaryPage;


public void QuoteSummaryPageCheck (){
Assert.assertTrue(QuoteSummaryPage.getText().contains("Summary for"), "Incorrect Page");

}







}
