package fsnpof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	//public static WebDriverWait wait = new WebDriverWait(Utilities.driver, 60);
	public static String MYFSNURL = "http://fsndevweb";
	public static String MYFSNPRODURL = "https://www.myfsn.biz/default.aspx?admin=itmyfsn";
	//Direct NTE Links Per Client
	public static String SEINTE = "http://fsndevweb:81/FM-Forms/NTE.aspx?srnumber=1-2073245042&login=FMTESTL3";
	
	 
	public static WebDriver driver;
	public static void webdrive (){
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver= chromedriver;
		
		}
 
}
