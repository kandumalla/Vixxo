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
	@FindBy(xpath="//*[text()='Logout']")
	WebElement Logoutbtn;

public void NavigateHome (){
Home.click();
}

public void Logout(){
wait.until(ExpectedConditions.elementToBeClickable(Logoutbtn));
Logoutbtn.click();
}

}
