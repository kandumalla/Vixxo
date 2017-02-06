package swtPOF;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CustomerWorkPlansPageSWT {
	String CustomerID = "SEI01";
	String CustomerIDInvalid = "InvalidID";
	String LOS = "HVAC";
	String LOSInvalid = "InvalidLOS";
	String ExpectedInvalidSearchMessage = "There are no Work Plans for the selected criteria.";

	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/h3/button")
	WebElement AddNewPlanBttn;

	public void AddnewplanAction() {
		AddNewPlanBttn.click();
	}

	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/div[1]/input")
	WebElement CustomerSearchField;

	public void CustomerPlanSearchbyCustomerNumber() throws InterruptedException {
		Thread.sleep(1500);
		CustomerSearchField.sendKeys(CustomerID, Keys.TAB);
		Thread.sleep(1500);
		SearchButton.click();
		Thread.sleep(1500);

	}

	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/div[2]/input")
	WebElement LineofServiceSearchField;

	public void CustomerPlanSearchbyCustomerNumberandLOS() {
		CustomerSearchField.sendKeys(CustomerID, Keys.TAB);
		LineofServiceSearchField.sendKeys(LOS, Keys.TAB);
		SearchButton.click();

	}

	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/div[3]/span/button")
	WebElement SearchButton;
	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/div[6]/div[1]/h4/span")
	WebElement SearchResult1;
	@FindBy(xpath = "//*[@id='page-content-wrapper']/div/div[2]/div/div[6]/div[1]/h4/button")
	WebElement SearchResult1EditBttn;
	
	public void CustomerPlanValidSearchResultCheck(){
	Assert.assertTrue(SearchResult1.isDisplayed(), "Search results expected but none returned");
	}
	
	@FindBy (xpath ="//*[@id='page-content-wrapper']/div/div[2]/div/div[5]")
	WebElement InvalidSearchAlert;
	public void CustomerPlanInValidSearchResultCheck(){
		String ActualInvalidSearchAlertMessage = InvalidSearchAlert.getText();
		Assert.assertTrue(InvalidSearchAlert.isDisplayed());
		Assert.assertTrue(ActualInvalidSearchAlertMessage==ExpectedInvalidSearchMessage,"Alert text present does not match expected value. Expected:"+ExpectedInvalidSearchMessage+"Actual:"+ActualInvalidSearchAlertMessage);
		}

}
