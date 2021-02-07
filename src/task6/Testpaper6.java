package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testpaper6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement tasksix = driver.findElement(By.id("heading201"));
		
		tasksix.click();
		
		Actions s =new Actions(driver);
		s.contextClick(tasksix).perform();
		
		Robot d = new Robot();
		
		for (int i =0 ; i <=8 ; i++) {
			
			Thread.sleep(2000);
			
			d.keyPress(KeyEvent.VK_DOWN);
			d.keyRelease(KeyEvent.VK_DOWN);
			
			d.keyPress(KeyEvent.VK_ENTER);
			d.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		
	
	}
	
	
	
}
