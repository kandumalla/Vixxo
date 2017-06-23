package swttests;

import org.testng.annotations.Test;

import swtPOF.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CustomerWorkPlanSearchTests {
	WebDriver driver;
	LoginPageSWT Login;
	UtilitiesSWT UtilClass;
	NavigationSWT NavigationMenu;
	CustomerWorkPlansPageSWT CustomerPlanSearch;
	

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		UtilitiesSWT.webdrive();
		// setting global explicit wait
		PageFactory.initElements(new AjaxElementLocatorFactory(UtilitiesSWT.driver, 60), this);
		UtilitiesSWT.driver.get(UtilitiesSWT.SWTURL);
		// initiating elements in page factory
		Login = PageFactory.initElements(UtilitiesSWT.driver, LoginPageSWT.class);
		UtilClass = PageFactory.initElements(UtilitiesSWT.driver, UtilitiesSWT.class);
		CustomerPlanSearch = PageFactory.initElements(UtilitiesSWT.driver, CustomerWorkPlansPageSWT.class);
		NavigationMenu = PageFactory.initElements(UtilitiesSWT.driver, NavigationSWT.class);
		
		Login.SendUserName();
		Login.SendPassword();
		Login.LoginAction();
        Thread.sleep(2000);
        Login.Alertcheck();
		Login.LoginIssueWorkAround();

	}

	@Test
	public void f() throws InterruptedException {
	NavigationMenu.NavigatetoCustomerWorkPlans();
	CustomerPlanSearch.CustomerPlanSearchbyCustomerNumber();
	CustomerPlanSearch.CustomerPlanValidSearchResultCheck();
	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterTest
	public void afterTest() {
	}

}
