package Automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
public class BrowserPosition {
	
    public static void main(String[]args) {
			
			WebDriver driver =BrowserOpen.openBrowser("https://www.facebook.com/");
			
			 Point p = new Point(300,400);
			driver.manage().window().setPosition(p);
			
			
	}
	
	
	
	

}
