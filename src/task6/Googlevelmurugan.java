package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlevelmurugan {

	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
					
	WebDriver driver= new ChromeDriver();
					
	driver.get(" https://www.google.co.in/webhp");
	
	WebElement search = driver.findElement(By.name("q"));
	
	search.sendKeys("velmurugan");	 
	
	Actions s =new Actions(driver);
	
	s.doubleClick(search).perform();
	
	Robot e = new Robot();
	
	e.keyPress(KeyEvent.VK_CONTROL);
	e.keyPress(KeyEvent.VK_X);
	e.keyRelease(KeyEvent.VK_CONTROL);
	e.keyRelease(KeyEvent.VK_X);
	
	}
	
	
}
