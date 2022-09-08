package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import graphql.Assert;

public class Assertion {
	
	
	@Test
	public void vctc() {
		WebDriver driver = BrowserOp.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement hide = driver.findElement(By.xpath("//input[@id ='hide-textbox']"));
		hide.click();
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result =textBox.isdisplayed();
		
		Assert.assertEquals(result,false);//hard assertion
		Assert.assertFalse(result);
		
		String title =driver.getTitle();
		
		Assert.assertEquals(title,"practice page");//hard assertion
		
		System.out.println("Thank you");
		
	}
	

}
