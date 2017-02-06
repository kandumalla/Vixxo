package swtPOF;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NavigationSWT {

	@FindBy(xpath = "//*[@id='menu']/li[1]/a")
	WebElement CustomerWorkPlans;

	public void NavigatetoCustomerWorkPlans() {
		CustomerWorkPlans.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[2]/a")
	WebElement SiteWorkPlan;

	public void NavigatetoSiteWorkPlan() {
		SiteWorkPlan.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[3]/a")
	WebElement SitesWithoutCoverage;

	public void NavigatetoSitesWithoutCoverage() {
		SitesWithoutCoverage.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[4]/a")
	WebElement UploadScheduledWork;

	public void NavigatetoUploadScheduledWork() {
		UploadScheduledWork.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[5]/a")
	WebElement CopyPlanstoSites;

	public void NavigatetoCopyPlanstoSites() {
		CustomerWorkPlans.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[6]/a")
	WebElement PendingApprovals;

	public void NavigatetoPendingApprovals() {
		PendingApprovals.click();
	}

	@FindBy(xpath = "//*[@id='menu']/li[7]/a")
	WebElement Home;

	public void NavigatetoHome() {
		Home.click();
	}

}
