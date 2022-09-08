package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String[]args) {
		WebDriver driver =BrowserOpen.openBrowser("https://vctcpune.com/#");
		//String handle= driver.getWindowHandle();
		//System.out.println(handle);
		
		WebElement practise =driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		practise.click();
		practise.click();
		practise.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i= handles.iterator();//2
		
	
	}

}



