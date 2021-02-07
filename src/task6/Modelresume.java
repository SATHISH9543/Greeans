package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Modelresume {
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement MODELRESUME = driver.findElement(By.xpath("(//h2[@CLASS='mb-0'])[2]"));
		
		MODELRESUME.click();
		
		Actions s=new Actions(driver);
		s.contextClick().perform();
		
		Robot d = new Robot();
		
		for (int i = 1; i <=4; i++) {
			
			d.keyPress(KeyEvent.VK_DOWN);
			d.keyRelease(KeyEvent.VK_DOWN);
		}
		
		WebElement test = driver.findElement(By.xpath("(//li[@class='pointer'])[62]"));
		
		Actions a = new Actions(driver);
		a.contextClick().perform();
		
		Robot f= new Robot();
		
		for (int i = 1; i <=4 ; i++) {
			
		f.keyPress(KeyEvent.VK_DOWN);
		f.keyRelease(KeyEvent.VK_DOWN);	
		
		f.keyPress(KeyEvent.VK_ENTER);
		f.keyRelease(KeyEvent.VK_ENTER);
		}
		
	}
	
}
