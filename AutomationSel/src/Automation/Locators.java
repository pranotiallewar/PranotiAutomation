package Automation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Locators {
		public static void main (String []args) {
			WebDriver driver = BrowserOpen.openBrowser(null);
			
			WebElement email=driver.findElement(By.id("email")); // locating element by id
			email.sendKeys("Velocity");
			
			WebElement password =driver.findElement(By.name("pass")); // locating element by name
			password.sendKeys("katraj");
			
			WebElement logIn = driver.findElement(By.tagName("button")); // by tagname
			logIn.click();
			

}
}