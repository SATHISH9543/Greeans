package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmethod {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='text']"));
		
		txtUsername.sendKeys("sathish2428ss@gmail.com");
		
	}
	
	
	
}
