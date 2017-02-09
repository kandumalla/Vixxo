package fsnpof;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VixxoTopMenuClientPOF {
	// Customer Top Menu
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[1]/a")
	WebElement Home;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[2]/a")
	WebElement ManageSites;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[3]/a")
	WebElement CreateSR;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[4]/a")
	WebElement SearchSR;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[5]/a")
	WebElement OpenQuotes;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[6]/a")
	WebElement SearchRFPs;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[7]/a")
	WebElement MySites;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[8]/a")
	WebElement CustomerProfile;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[9]/a")
	WebElement MyAccount;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[10]/a")
	WebElement Reports;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[11]/a")
	WebElement Help;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[12]/a")
	WebElement logoutlink;

	public void NavigateHome() {
		Home.click();
	}

	public void NavigateToManageSites() {
		ManageSites.click();
	}

	public void NavigateToSRCreate() {
		CreateSR.click();
	}

	public void NavigateToSRSearch() {
		SearchSR.click();
	}

	public void NavigateToQuoteSearch() {
		OpenQuotes.click();
	}

	public void NavigateToRFPSearch() {
		SearchRFPs.click();
	}

	public void NavigateToMySites() {
		MySites.click();
	}

	public void NavigateToCustomerProfile() {
		CustomerProfile.click();
	}

	public void NavigateToMyAccount() {
		MyAccount.click();

	}

	public void NavigateToReports() {
		Reports.click();
		//There are sublinks

	}

	public void NavigateToHelp() {
		Help.click();
		//There are sublinks 

	}

	public void LogOut() {
		logoutlink.click();

	}

}
