package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		WebElement login = driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
		
		login.click();
		
		WebElement username = driver.findElement(By.id("ap_email"));
		
		username.sendKeys("sathish2428ss@gmail.com");
		
		Actions acc = new Actions(driver);
		
		Robot w = new Robot();
		
		w.keyPress(KeyEvent.VK_CONTROL);
		w.keyPress(KeyEvent.VK_A);
		w.keyRelease(KeyEvent.VK_CONTROL);
		w.keyRelease(KeyEvent.VK_A);
		
		Actions s = new Actions(driver);
		s.contextClick(username).perform();
		
		for (int i =0 ; i  <=1; i++) {
			
			w.keyPress(KeyEvent.VK_DOWN);
			w.keyRelease(KeyEvent.VK_DOWN);
			
			w.keyPress(KeyEvent.VK_ENTER);
			w.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		
		
		
		
		
		
		

	}

}
