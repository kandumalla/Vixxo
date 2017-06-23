package fcstestingsuite.fsnrgn;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectfactory.Ourfsnlogin;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageobjectfactory.RequestsAtAGlancePOF;

public class PointerExceptionDebugging {
	static WebDriver driver;
	RequestsAtAGlancePOF RequestsataGlance;
	Ourfsnlogin LoginPage;

	
	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		//setting global explicit wait 
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		driver.get("http://www.ourfsn.com/myfsn");
		//initiating elements in page factory 
		RequestsataGlance= PageFactory.initElements(driver, RequestsAtAGlancePOF.class);
		LoginPage= PageFactory.initElements(driver, Ourfsnlogin.class);

		LoginPage.sendUserName("ebluth");
		LoginPage.sendPassword("password");
		LoginPage.clicksubmit();
		LoginPage.USclick();


	}
	/*		String url = driver.getCurrentUrl();
    System.out.println(url);
*/   
	@Test
	public void RFPsCreatedStatusTest(){
		RequestsataGlance.RFPinProgressbtnclick();
		RequestsataGlance.CreatedClick();
		RequestsataGlance.Createdassertion();

	
	}

}
