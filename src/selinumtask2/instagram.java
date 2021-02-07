package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://www.instagram.com/");
	
	WebElement username = driver.findElement(By.name("password"));
	
	username.sendKeys("9952052015");
	
}
}
