package fsnpof;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NTEWorksheetPOF {

	@FindBy(id = "txtNTERegularHours")
	WebElement RegularHoursField;
	@FindBy(id = "txtNTEOverTimeHours")
	WebElement OverTimeHoursField;
	@FindBy(id = "txtNTEHolidayHours")
	WebElement HolidayHoursField;
	@FindBy(id = "txtParts")
	WebElement PartAmtField;
	@FindBy(id = "txtTravel")
	WebElement TravelAmtField;
	@FindBy(id = "txtServiceFee")
	WebElement ServiceFeeField;
	@FindBy(id = "txtNTERegularRate")
	WebElement RegularRateField;
	@FindBy(id = "txtNTEOverTimeRate")
	WebElement OvertimeRateField;
	@FindBy(id = "txtNTEHolidayRate")
	WebElement HolidayRateField;
	@FindBy(id = "btnNTECalculate")
	WebElement CalculateButton;
	@FindBy(id = "btnNTEReset")
	WebElement ResetButton;

	// Instantiating Hour string, parsing double variable for math operations
	String RegularHoursString = "1";
	Double RegularHoursDouble = Double.parseDouble(RegularHoursString);

	public void RegularHoursWorked() {
		RegularHoursField.sendKeys(RegularHoursString);

	}

	String OverTimeHoursString = "1";
	Double OvertimesDouble = Double.parseDouble(OverTimeHoursString);

	public void OvertimeHoursWorked() {
		OverTimeHoursField.sendKeys(OverTimeHoursString);

	}

	String HolidayHoursString = "1";
	Double HolidaysDouble = Double.parseDouble(HolidayHoursString);

	public void HolidayHoursWorked() {
		HolidayHoursField.sendKeys(HolidayHoursString);

	}

	String RegularRateString = "50.00";
	Double RegularRateDouble = Double.parseDouble(RegularRateString);

	public void RegularRate() {
		RegularRateField.clear();
		RegularRateField.sendKeys(RegularRateString);

	}

	String OvertimeRateString = "75.00";
	Double OvertimeRateDouble = Double.parseDouble(OvertimeRateString);

	public void OvertimeRate() {
		OvertimeRateField.sendKeys(OvertimeRateString);

	}
	
	String HolidayRateString = "100.00";
	Double HolidayRateDouble = Double.parseDouble(OvertimeRateString);

	public void HolidayRate() {
	HolidayRateField.sendKeys(HolidayRateString);

	}
	
	public void CalculateNTE (){
	CalculateButton.click();	
	}
	
	
	public void ResetFields (){
	ResetButton.click();
	}

}
