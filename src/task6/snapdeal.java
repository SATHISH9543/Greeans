package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {
	
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
				
				WebDriver driver= new ChromeDriver();
				
				driver.get(" https://www.snapdeal.com/");
				
				driver.manage().window().maximize();
				
		WebElement wobble = driver.findElement(By.xpath("(//img[@class='wooble'])[4]"));

		wobble.click();
		
		
		Actions s =new Actions(driver);
		s.contextClick(wobble).perform();
		
		Robot d = new Robot();
		
		for (int i = 0; i <=1 ; i++) {
			
			d.keyPress(KeyEvent.VK_DOWN);
			d.keyRelease(KeyEvent.VK_DOWN);
			
			d.keyPress(KeyEvent.VK_ENTER);
			d.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
		
	}

}
