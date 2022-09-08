package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElement {

	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=BrowserOpen.openBrowser ("https://vctcpune.com/selenium/practice.html");
		
		WebElement text=driver.findElement(By.xpath("//input[@name='show-hide']"));
				
		text.sendKeys("Velocity");
				
		boolean status=text.isDisplayed();
		System.out.println(status);
		
		Thread.sleep(3000);
		
		WebElement hide =driver.findElement(By.xpath("//input[@value='Hide']"));
		hide.click();
		
		boolean newStatus =text.isDisplayed();
		System.out.println(newStatus);
		
		
		
				
		
	}	
	
}




