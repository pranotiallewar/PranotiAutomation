package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
public class Facebook {
	public static void main(String[] args) throws EncryptedDocumentException,IOExcepttion {
		WebDriver driver = BrowserOpen.openBrowser("https://www..facebook.com/");
		
	String emailID = Parametrization.getData("Credentials", 0, 0);
	String pass = Parametrization.getData("Credentials",1,0);
	
	WebElement email = driver.findElement(By.xpath("//input[@name='email'])"));
	email.sendKeys(emailID);
	
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	password.sendKeys(pass);
	
	}	
}	
	
	


