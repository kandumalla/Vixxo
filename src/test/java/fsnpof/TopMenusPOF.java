package fsnpof;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class TopMenusPOF {
//Customer Top Menu
	WebDriverWait wait = new WebDriverWait(Utilities.driver, 15);
	@FindBy(id = "ctl00_Menu1_0")
	WebElement Home;
	@FindBy(id = "ctl00_Menu1_1")
	WebElement ManageSites;
	@FindBy(id = "ctl00_Menu1_7")
	WebElement CustomerProfile;
	@FindBy(id = "ctl00_Menu1_*")
	WebElement Reports;
	@FindBy(id = "ctl00_Menu1_*")
	WebElement Help;
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement Logoutbtnservicecenter;
	@FindBy(id="ctl00_Menu1_16")
	WebElement Logoutbtnclient;
	@FindBy(id="ctl00_Menu1_14")
	WebElement Logoutbtnsiteclient;

public void NavigateHome (){
Home.click();
}

public void Logoutcust(){
wait.until(ExpectedConditions.elementToBeClickable(Logoutbtnclient));
Logoutbtnclient.click();
}

public void Logoutservicecenter(){
wait.until(ExpectedConditions.elementToBeClickable(Logoutbtnservicecenter));
Logoutbtnservicecenter.click();
}

public void LogoutSiteCustomer(){
wait.until(ExpectedConditions.elementToBeClickable(Logoutbtnsiteclient));
Logoutbtnsiteclient.click();
}

}
