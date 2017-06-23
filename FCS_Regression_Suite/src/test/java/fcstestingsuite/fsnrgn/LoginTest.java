package fcstestingsuite.fsnrgn;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import pageobjectfactory.Ourfsnlogin;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginTest {
	static WebDriver driver;
	Ourfsnlogin LoginPage; 

	@Test (priority=1)
	public void USPageTest() {
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();
		LoginPage.USPageValidation();
	}

	@Test(priority=2)
	public void CAPageTest(){
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.CAclick();
		LoginPage.CAPageValidation();
	}


	@Test (priority=3)
	public void PRPageTest(){
		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.PRclick();
		LoginPage.PRPageValidation();
	}


	@AfterMethod 
	public void aftermethod(){
		LoginPage.Logout();
	}



	@BeforeTest
	public void beforeTest() {
		Ourfsnlogin.cdriver();
		//Ourfsnlogin.driver=new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(Ourfsnlogin.driver, 20), this);
		Ourfsnlogin.driver.get("http://www.ourfsn.com/myfsn");
		//initiating elements in page factory 
		LoginPage= PageFactory.initElements(Ourfsnlogin.driver, Ourfsnlogin.class);

	}

	@AfterTest
	public void afterTest() {
		Ourfsnlogin.driver.quit();


	}

}
