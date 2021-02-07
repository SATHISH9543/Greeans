package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RPAclick {
	
	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement RAP = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		RAP.click();
		
		Robot w = new Robot();
		
		for (int i = 1; i <=3 ; i++) {
			w.keyPress(KeyEvent.VK_DOWN);
			w.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		Actions s=new Actions(driver);
		s.contextClick(RAP).perform();
		
		Robot q =new Robot();
		
		for (int i = 1; i<=9 ; i++) {
			
		q.keyPress(KeyEvent.VK_DOWN);
		q.keyRelease(KeyEvent.VK_DOWN);
		q.keyPress(KeyEvent.VK_ENTER);
		q.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
		
		
			
		}
		
		
		
	}
	

	


