package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {

	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement interviewqus = driver.findElement(By.id("heading20"));
		
		interviewqus.click();
		
      Robot r=new Robot();
      for (int i = 1; i <=7; i++)
      {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
		WebElement ctsRk = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		
		Actions a=new Actions(driver);
        a.contextClick(ctsRk).perform();
        
        
        for (int i = 1; i <=2; i++)
        {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
	}
	
	
	
	
}
