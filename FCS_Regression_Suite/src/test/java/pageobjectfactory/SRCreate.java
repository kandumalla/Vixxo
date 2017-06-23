package pageobjectfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.thoughtworks.selenium.Wait;

import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SRCreate {
	WebDriverWait wait = new WebDriverWait(driver,60); 
	
	//Home Page 
	@FindBy (id="ctl00_Menu1_1")
	WebElement Managesitestab; 
	@FindBy (id="ctl00_Menu1_2")
	WebElement CreateSRLink;
	
	//Create SR Page 
	@FindBy (id="ctl00_ContentPlaceHolder1_TextboxSite")
	WebElement SelectSitebox;
	@FindBy (id="ctl00_ContentPlaceHolder1_DdlSiteArea")
	WebElement SiteAreaDropDown;
	@FindBy (id="ctl00_ContentPlaceHolder1_DdlSiteSubArea")
	WebElement SubSiteAreaDropDown;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlSLOS")
	WebElement TypeofService;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlSshortDesc")
	WebElement ReasonForCall;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlCategory")
	WebElement Category;
	@FindBy (id="ctl00_ContentPlaceHolder1_TextBoxSiteLimit")
	WebElement SiteLimit;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbxRequestor")
	WebElement RequesterInfo;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbxWO")
	WebElement WorkOrder;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbxPO")
	WebElement PurchaseOrder;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlPrio")
	WebElement Priority;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbDueDate")
	WebElement DueDate;
	@FindBy (id="ctl00_ContentPlaceHolder1_ddlOT")
	WebElement Overtime;
	@FindBy (id="ctl00_ContentPlaceHolder1_tbxDesc")
	WebElement DetailedDescription;
	@FindBy (id="ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement Submitbtn;
	//SR Confirmation 
	@FindBy (id="ctl00_ContentPlaceHolder1_lblnewSRNum")
	WebElement SRNumberMessage;
	@FindBy (id="ctl00_ContentPlaceHolder1_hplViewSR")
	WebElement SRConfirmationLink;


	/*//Methods 
SR Detail Page confirmation link:
[http://www.ourfsn.com/myfsn/SRdetail.aspx?srid=]

Select oSelection = new Select(SiteAreaDropDown).selectByVisibleText("Core Store");
	 */
	public static WebDriver driver;
	public static void webdrive (){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver= chromedriver;
		
		}
	

	public void NavigateToSRCreate(){
		Actions action = new Actions(driver);
		action.moveToElement(Managesitestab).perform();
		WebElement subElement = CreateSRLink;
				//driver.findElement(By.id("ctl00_Menu1_2"));
		action.moveToElement(subElement);
		action.click();
		action.perform();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://www.ourfsn.com/myfsn/SRCreate.aspx"));
		
	}
	
	public void SRCreationTest() throws InterruptedException{
	
	SelectSitebox.sendKeys("(0047) PetSmart - 575 Rohnert Park Expy W Rohnert Park, CA ");
	Thread.sleep(3000);
	SelectSitebox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	Select siteareadd= new Select(SiteAreaDropDown);
	Thread.sleep(3000);
	siteareadd.selectByVisibleText("Core Store");
	Select subsiteareadd= new Select(SubSiteAreaDropDown);
	Thread.sleep(3000);
	subsiteareadd.selectByVisibleText("Sales floor");
	Select typeofservicedd= new Select(TypeofService);
	Thread.sleep(3000);
	typeofservicedd.selectByVisibleText("Automatic Doors");
	Select reasondd= new Select(ReasonForCall);
	Thread.sleep(3000);
	reasondd.selectByVisibleText("Off Track");
	RequesterInfo.sendKeys("deonte.mohamed@vixxo.com");
	DetailedDescription.sendKeys("brokenalarm");
	Submitbtn.click();
  wait.until(ExpectedConditions.visibilityOf(SRConfirmationLink));
	SRConfirmationLink.click();
	String urlsrconfirmation= driver.getCurrentUrl();
	Assert.assertTrue(urlsrconfirmation.contains("http://www.ourfsn.com/myfsn/SRdetail.aspx?"), "SR processing unsuccessful");
	
	
	
	
	
	}
	
	
	
	}