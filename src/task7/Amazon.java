package task7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(" https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	
	search.sendKeys("motorla mobiles \n");
	
	TakesScreenshot w = (TakesScreenshot)driver;
	File screenshotAs = w.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	
	File s = new File("d:\\sample.png");
	FileHandler.copy(screenshotAs, s);
	System.out.println(screenshotAs);
	
	
	}
	
	
	

}
