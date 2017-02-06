package swtPOF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilitiesSWT {
	public static String SWTURL = "http://vixxoswmweb-dev.us-east-1.elasticbeanstalk.com/";
	//http://vixxoswmweb-dev.us-east-1.elasticbeanstalk.com/welcome#/welcome
	
	public static WebDriver driver;
	public static void webdrive (){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dmohamed\\Documents\\Testing Environment\\Testing Environment\\Web Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		driver= chromedriver;
		
		}

}
