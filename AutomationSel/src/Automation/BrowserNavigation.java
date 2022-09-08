package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://WWW.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
	}
		
	

}
