package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators1 {
	

	public static void main (String []args) {
		WebDriver driver = BrowserOpen.openBrowser(null);
		
		WebElement email=driver.findElement(By.id("email")); // locating element by id
		email.sendKeys("Velocity");
		
		WebElement password = driver.findElement(By.name("pass"));//locating element by name
		password.sendKeys("katraj");
		
		//WebElement logIn = driver.findElement(By.tagname("button")); // By tagname
		//logIn.click();
		
		//WebElement forgot =driver.findElement(BY.className("_61tj"));//duplicate
		//forgot.click();
		   
		
		//CSS cannot find  and cannot make locator unique if we have multiple matching
		//WebElement signUp =driver.findElement(By.cssSelector("a[data-test id='open-registration-from-button']"));
		//signUp.click();
		
		WebElement createPage =driver.findElement(By.partialLinkText("Create a"));
		createPage.click();
		
		
		
		
	}	
	

}



