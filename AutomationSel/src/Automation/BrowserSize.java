package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserSize {
	
	public static void main(String[]args) {
		
		WebDriver driver =BrowserOpen.openBrowser("https://www.facebook.com/");
		
		Dimension d = new Dimension(600,900);
		driver.manage().window().setSize(d);
		
		
		
		
	}

}
