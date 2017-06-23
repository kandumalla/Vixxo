package FMWebTests;

import org.testng.annotations.Test;

import FMWebPOF.LoginPage;
import FMWebPOF.SevenConnectRFSCreatePOF;
import fsnpof.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class RFSCreateTestSevenConnect {
	WebDriver driver;
	SevenConnectRFSCreatePOF RFSCreate;
	Utilities UtilClass;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		Utilities.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(Utilities.driver, 60), this);
		// initiating elements in page factory
		RFSCreate = PageFactory.initElements(Utilities.driver, SevenConnectRFSCreatePOF.class);
		UtilClass = PageFactory.initElements(Utilities.driver, Utilities.class);

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		Utilities.driver.get("http://hart-appuat01:8080/InboundRequest/seiLocationVerify.jsp");
		RFSCreate.LocationSearch();

	}

	@Test(dataProvider = "dp")
	public void RFSCreateTest(String ProblemArea, String ProblemType, String Description) throws InterruptedException {
		Thread.sleep(2000);
		RFSCreate.RFSCreate(ProblemArea, ProblemType, Description);

	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterTest
	public void afterTest() {
	}

	@DataProvider (name ="dp", parallel=true)
	public Object[][] dp() {
		return new Object[][] { 
			    { "Beverage Equipment", "Slurpee", "Less Than Half Barrels Down - P2" },
				{ "Food Equipment", "Roller Grill", "One Grill Down - P2" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Ice Maker not dispensing Ice - P1" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Won't Accept Credit - Debit Card - P2" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Less than half of fueling positions down - P2" },
				{ "Gas Pumps/Equip/Other", "Out of Gasoline", "Regular - P2" },
				{ "Maintenance Charge Inquiry", "Disputes", "Charge Dispute - P3" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Vault Refrigeration",
						"Not Operating Properly / Temperature Too Warm - P1" },
				{ "Beverage Equipment", "Cappuccino", "Not Operating Properly - P2" },
				{ "Heating/Air Conditioning", "HVAC", "Temperature 80 F or above - P1" },
				{ "Beverage Equipment", "Slurpee", "Half Or More  Barrels Down - P1" },
				{ "Electronics - Security/Cash Handling", "RIS/ POS/ ISP", "Service Needed - P1" },
				{ "Beverage Equipment", "Slurpee", "Minor Leak - P2" },
				{ "Lighting / Signage (interior)", "Sales Floor Ceiling Lights", "Partial Outage - P5" },
				{ "Food Equipment", "Turbo Chef/ ImpingerOven", "Not Operating Properly - P2" },
				{ "General Equipment", "MISC/Fixture/Other", "Repair/Replace/Adjust - P3" },
				{ "Food Equipment", "Turbo Chef/ ImpingerOven", "Completely Down - P1" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Freezer (Merchandising / Storage)",
						"Not Operating Properly / Product Has Been Moved - P2" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Open Air Case / CID",
						"Not Operating Properly / Temperature Too Warm - P1" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Minor Leak - P2" },
				{ "Food Equipment", "Sanden Held Hot", "Lights Out - P2" },
				{ "Beverage Equipment", "Coffee-Hot (Brewers/Urns/Warmers)", "Less Than Half Of Brewers Down - P2" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Bib Pumps Need Repair - P2" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Drive Off - Hose Disconnected - P2" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Nozzle Needs Repair - P2" },
				{ "Building Interior", "Pest Control", "Need Services - P3" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Freezer (Merchandising / Storage)",
						"Product Melting / Can Not Move Product - P1" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Open Air Case / CID",
						"Not Operating Properly / Temperature Too Warm - P2" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Less Than Half Flavors Down - P2" },
				{ "Security System", "Camera", "Camera not working - P2" },
				{ "Beverage Equipment", "Coffee-Hot (Brewers/Urns/Warmers)", "Half Or More Brewers Down - P1" },
				{ "Food Equipment", "Chili/Cheese Dispenser", "Not Operating Properly - P2" },
				{ "Building Interior", "Doors-Interior", "Needs Repair / Adjustment  - P3" },
				{ "Beverage Equipment", "Slurpee", "Making Noise - P2" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Slow Pumping (Filters) - P2" },
				{ "Electrical (Interior / Exterior)", "Electrical Wiring",
						"Wire Management needed (Under Counter / Ceiling) - P3" },
				{ "Building Exterior (Building / Trash Enclosure / Fence)", "Roof",
						"Leaking Inside Store  / Hazard - P1" },
				{ "Heating/Air Conditioning", "HVAC", "Temperature below 66  F or above 76 F - P2" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Drain Clogged - P2" },
				{ "Plumbing (Interior / Exterior)", "Sink (3 Compartment Sink/Hand Sink/Bathroom Sink/Mop Sink)",
						"Leaking - P2" },
				{ "Refrigerator/ Freezer / Ice Merch / Food Storage", "Refrigerated Condiment Station",
						"Not Operating Properly / Temperature Too Warm - P2" },
				{ "Car Wash", "Wash Down", "Wash will not operate after reset attempt - P1" },
				{ "Building Exterior (Building / Trash Enclosure / Fence)", "Front Door",
						"Needs Repair / Adjustment - P3" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Repair Dispenser - No Shutdown - P2" },
				{ "Electronics - Security/Cash Handling", "Cash Controller- Safe", "Not Operating Properly - P2" },
				{ "Beverage Equipment", "Fountain Soft Drink/Ice maker", "Major Leak - P1" },
				{ "Gas Pumps/Equip/Other", "Gasoline Dispenser", "Dispenser Won't Print Credit/Debit Receipt - P2" },
				{ "Gas Pumps/Equip/Other", "Underground Gas", "Liquid Reported on Sump/Spill Bucket - P3" },
				{ "Beverage Equipment", "Slurpee", "Major Leak - P1" },
				{ "Plumbing (Interior / Exterior)", "Toilet", "Clogged / Overflowing - P1" }, };
	}

}
