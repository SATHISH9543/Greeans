package task7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class toolsqacom {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot sd = (TakesScreenshot)driver;
		
		File source = sd.getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File des1 = new File("d:\\sample.png");
		
		FileHandler.copy(source , des1);
		 
		System.out.println(source);
		
		
	}
	
	
	
	
}
