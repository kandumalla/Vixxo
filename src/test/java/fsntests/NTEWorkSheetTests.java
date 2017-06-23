package fsntests;

import org.testng.annotations.Test;

import fsnpof.*;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NTEWorkSheetTests {
	WebDriver driver;
	Utilities UtilClass;
	NTEWorksheetPOF NTEWorkSheet;

	@BeforeSuite
	public void beforeTest() {
		Utilities.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		Utilities.driver.get(Utilities.SEINTE);
		// initiating elements in page factory
		NTEWorkSheet=PageFactory.initElements(Utilities.driver, NTEWorksheetPOF.class);

	}

	@Test
	public void LaborCalculateTest() throws InterruptedException {
	NTEWorkSheet.RegularHoursWorked();
	NTEWorkSheet.RegularRate();
	NTEWorkSheet.CalculateNTE();
	}

	@AfterTest
	public void afterTest() {
	}

}
