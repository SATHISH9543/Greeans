package task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filpcart2 {

	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
		
		WebElement eletronices = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		
		eletronices.click();
		
		Actions s = new Actions(driver);
		
		Robot d = new Robot();
		
		for (int i = 0; i <=3 ; i++) {
			
			d.keyPress(KeyEvent.VK_DOWN);
			d.keyRelease(KeyEvent.VK_DOWN);
			d.keyPress(KeyEvent.VK_ENTER);
			d.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		

	}

}
