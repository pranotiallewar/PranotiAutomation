package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {
	public static void main(String[] args) {
		WebDriver driver =BrowserOpen.openBrowser("https://www.globlsqa.com/demo-site/draganddrop/");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement source =driver.findElement(By.xpath("//iframe[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		
		WebElement destinations =driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destinations);
		action.perform();
		
		
	}
	
	

}
