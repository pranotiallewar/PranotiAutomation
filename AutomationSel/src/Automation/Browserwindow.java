package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;

public class Browserwindow {
	

public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://WWW.facebook.com");
		
		String title=driver.getTitle();//to get the title of webpage
		System.out.println(title);
		
		String url=driver.getCurrentUrl();//to url of page
	    System.out.println(url);
	    
	    //driver.manage().window().maximize();
	    
	    Options op = driver.manage();//return options interface
	    Window w =op.window();//window method of options interface returns
	    w.maximize();//maximize is the method of window interface
	    
	   // driver.manage().window().minimize();

}
	

}
