package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();//Upcasting of chromedriver to webdriver
		
		driver.get("https:\\vctcpune.com");//helps to get a url on browser
		
	}

}
