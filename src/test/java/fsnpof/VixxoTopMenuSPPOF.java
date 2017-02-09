package fsnpof;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VixxoTopMenuSPPOF {

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[1]/a")
	WebElement Home;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[2]/a")
	WebElement InvoiceRejectedList;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[3]/a")
	WebElement MySites;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[4]/a")
	WebElement MyAccount;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[5]/a")
	WebElement ReferenceMaterials;
	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/nav/div/div/ul/li[6]/a")
	WebElement Logoutlink;

	public void NavigateHome() {
		Home.click();
	}

	public void NavigatetoInvoiceRejectedList() {
		InvoiceRejectedList.click();
	}

	public void NavigateToMyAccount() {
		MyAccount.click();
	}

	public void NavigateToReferenceMaterials() {
		// Sublinks present
	}

	public void NavigateToMySites() {
		MySites.click();

	}

	public void Logout() {
		Logoutlink.click();

	}

}
