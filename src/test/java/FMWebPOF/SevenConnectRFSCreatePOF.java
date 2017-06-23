package FMWebPOF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.Submit;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

import fsnpof.Utilities;

public class SevenConnectRFSCreatePOF {
	
	@FindBy(xpath = "//*[@class='main']/table/tbody/tr[2]/td[2]/input[@id='newStoreNumber']")
	WebElement LocationNumberField;
	@FindBy(id = "nextButton")
	WebElement NextButton;
	
	@FindBy(xpath = "//*/input[@id='newCaseButton']")
	WebElement AcceptButton;
	
	public void LocationSearch () throws InterruptedException{
		String storenumber = "34222";
		LocationNumberField.sendKeys(storenumber);
		Thread.sleep(2000);
		NextButton.click();
		Thread.sleep(2000);
		AcceptButton.click();
		Thread.sleep(2000);
	}

	//RFSCreatePage
	@FindBy(id="irInitiatorName")
	WebElement SubmitterNameField;
	@FindBy(id="irShortDescription")
	WebElement BriefDescriptionField;
	@FindBy(id="classes")
	WebElement ProblemAreaDropDown;
	@FindBy(id="subclasses")
	WebElement ProblemTypeDropDown;
	@FindBy(id="subsubclasses")
	WebElement DescriptionDropDown;
	@FindBy(id="irDescription")
	WebElement DetailedDescriptionField;
	@FindBy(id="submitButton")
	WebElement SubmitBtn;
	
	@FindBy (xpath="//*[@class='main']/table/tbody/tr[2]/td[2]" )
	WebElement StoreNumberConfirmation;
	@FindBy (xpath="//*[@class='main']/table/tbody/tr[2]/td[4]" )
	WebElement CaseNumberConfirmation;
	@FindBy (xpath="//*[@class='main']/table/tbody/tr[4]/td/div/button" )
	WebElement CreateNewCaseButton;
	
	
	public void RFSCreate (String ProblemArea, String ProblemType, String Description) throws InterruptedException{
    SubmitterNameField.sendKeys("Tester");
	Utilities.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	BriefDescriptionField.sendKeys("Testing");
	ProblemAreaDropDown.sendKeys(ProblemArea);
	Thread.sleep(1000);
	ProblemTypeDropDown.sendKeys(ProblemType);
	Thread.sleep(1000);
	DescriptionDropDown.sendKeys(Description);
	Thread.sleep(1000);
	DetailedDescriptionField.sendKeys("Testing Testing Testing");
	Thread.sleep(1000);
	SubmitBtn.click();
	Thread.sleep(1000);
	Utilities.driver.switchTo().alert().accept();
//	if (SubmitBtn.isDisplayed()){
//	SubmitBtn.click();	
//	Utilities.driver.switchTo().alert().accept();}
	
	Utilities.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/*WebDriverWait wait = new WebDriverWait(Utilities.driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated((By) StoreNumberConfirmation));*/
	Assert.assertTrue(StoreNumberConfirmation.getText().contains("34222"), "RFS Create confirmation page contains unexpected Store Number");
	Assert.assertTrue(CaseNumberConfirmation!=null, "Null Casenumber");
	Assert.assertTrue(CreateNewCaseButton.isEnabled(), "Create New Case Function Not Displayed");
	
	}
}
