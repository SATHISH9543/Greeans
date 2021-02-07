package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://www.google.com/");
	
	driver.manage().window().maximize();
	
	WebElement searchengine = driver.findElement(By.name("q"));
	
	searchengine.sendKeys("wwww.amazon.com \n");
	
	WebElement pageclick = driver.findElement(By.className("iUh30 Zu0yb tjvcx"));
	
	pageclick.click();
	
	
	
}
}
