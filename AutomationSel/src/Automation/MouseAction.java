package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver =BrowserOpen.openBrowser("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rClick =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(rClick);//to right click
		action.perform();
		
		WebElement dClick = driver.findElement(By.xpath("//button[text()='Double-click Me To Alert']"));
		action.doubleClick(dClick);//to double click on webpage  element
		action.perform();
		
	}	
		
	

}
