package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SotAssertion {
	@Test
	public void vctc() {
		WebDriver driver = BrowserOpen.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement hide = driver.findElement(By.xpath("//input[@id ='hide-textbox']"));
		hide.click();
		
		WebElement textBox =driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result =textBox.isDisplayed();
		
		SoftAssert softAssert= new SoftAssert();
		
		
	}
	

}
