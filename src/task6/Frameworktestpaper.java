package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameworktestpaper {
	
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		WebElement frame = driver.findElement(By.id("heading304"));
		
		frame.click();
		
		Actions a=new Actions(driver);
		a.contextClick(frame).perform();
		
		Robot s=new Robot();
		
		for (int i = 1; i <=8; i++) 
		{
		
			
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);	
		
		}
		
	}
	
	}
