package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table1 {
	public static void main(String[]args) {
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
	
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
		double max = 0;
		for (int i =1; i< currentPrice.size(); i++)
		{
			WebElement column = currentPrice.get(i);
			String price = column.getText();//100.0,150.8,35,500.0
			double value = Double.parseDouble(price);
			
			if(value > max)
			{
				max = value;//500.0
			}
		}
	
		System.out.println("Max current price is "+ max);
	}

}
