package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greentechselenium {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement interview = driver.findElement(By.id("heading20"));
		
		interview.click();
		
		WebElement ctsquestions = driver.findElement(By.id("pointer"));
		
		ctsquestions.click();
		
		
		
	}
	
	
	
	

}
