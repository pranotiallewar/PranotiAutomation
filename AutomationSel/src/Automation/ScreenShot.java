package Automation;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class ScreenShot {
		public static void main(String[]args) throws IOException {
			
			WebDriver driver=BrowserOpen1.openBrowser("https://vctcpune.com/");
			
			TakesScreenshot sc=((TakesScreenshot)driver);//upcast driver to TakesScreenshot
			
			File source =sc.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\Pranoti_Allewar\\Desktop\\Screenshot\\vctc.jpg");
			 FileHandler.copy(source,destination);
		}


}
