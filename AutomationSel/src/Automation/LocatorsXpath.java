package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsXpath {
	public static void main(String[]args) {
		WebDriver driver = BrowserOpen.openBrowser(null);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));//By attribue
		email.sendKeys("Velocity");
		 
		//WebElement forgot =driver.findElement(By.xpath("//a text()='Forgotten password?']")); // By Text
		//forgot.click();
		//
		WebElement signUp =driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")); // by contains
		signUp.click();
		
		
		
	}

}



