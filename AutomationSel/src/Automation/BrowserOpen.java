package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
	public static WebDriver openBrowser(String s) {
		
		System.setProperty("webdriver.chrome.driver.","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		return driver;
		
		}
	
		}


