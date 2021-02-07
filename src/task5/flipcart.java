package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
public static void main(String[] args) {
	    
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	
	close.click();
	
	WebElement filpcart = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
	
	Actions s =new Actions(driver);
	
	s.moveToElement(filpcart).perform();
	
	WebElement bedsheet = driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[26]"));
	
	Actions d = new Actions (driver);
	
	d.moveToElement(bedsheet).perform();
	
	WebElement beedsheetprint = driver.findElement(By.xpath("(//a[ @class='s1Q9rs'])[2]"));
	
	String text = beedsheetprint.getText();
	
	System.out.println(text);
	
	
	 
	
	
	
	
}
}
