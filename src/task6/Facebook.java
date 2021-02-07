package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("welcome");
		
Actions ass=new Actions(driver);
		
ass.doubleClick(username).perform();
		
		Robot s = new Robot();
		
		//selecting text
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_C);
		s.keyRelease(KeyEvent.VK_CONTROL);
		s.keyRelease(KeyEvent.VK_C);
		
		// press the tab
		
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
		
		// to copy
		
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_CONTROL);
		s.keyRelease(KeyEvent.VK_V);
		
		// press enter
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
}
