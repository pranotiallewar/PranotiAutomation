package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTest {
	public void loginWithValidCreadentialsTest() {
		WebDriver driver=BrowserOpen1.openBrowser("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Velocity@gmail.com");
		
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("12345");
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='login']"));
		submit.click();
		
		
	}
	
	public void loginWithOnlyEmail() {
		WebDriver driver =BrowserOpen1.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Velocity@gmail.com");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='email']"));
		submit.click();
		
	}
	public static void main(String[]args) {
		
	}

}
