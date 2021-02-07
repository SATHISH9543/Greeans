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

public class Flipcart {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement addclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	addclose.click();
	
	WebElement search = driver.findElement(By.name("q"));
	
	search.sendKeys("I phones \n");
	
	
	TakesScreenshot z=(TakesScreenshot)driver;
	
	File screenshotFile = z.getScreenshotAs(OutputType.FILE);
	
	System.out.println("ScreenshotAs");
	
	File ass= new File("d:\\sample.png");
	FileHandler.copy(screenshotFile, ass);
	System.out.println(screenshotFile);
	 
	
	
	

	}

}
