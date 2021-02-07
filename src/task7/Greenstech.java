package task7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Greenstech {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(" http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	TakesScreenshot ds = (TakesScreenshot)driver;
	
	File ScreenshotAs = ds.getScreenshotAs(OutputType.FILE);
	
	System.out.println("ScreenshotAs");
	
	File des = new File("d:\\sample.png");
	
	FileHandler.copy(ScreenshotAs, des);
	
	System.out.println(ScreenshotAs);

	
		
		
		
	
	}

}
