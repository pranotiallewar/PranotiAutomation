package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElement2 {

   public static void main(String[]args) {
		
		WebDriver driver=BrowserOpen.openBrowser ("https://www.facebook.com/");
		
		   WebElement heading=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		   
		   String text =heading.getText();
		   System.out.println(text);
		   
				
		
	
   }
}



