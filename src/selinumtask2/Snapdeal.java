package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.snapdeal.com/");
		
		WebElement login  = driver.findElement(By.className("accountInner"));
		
		login.click();
		
		WebElement click = driver.findElement(By.className("adfgd"));
		
		WebElement username = driver.findElement(By.id("userName"));
		
		username.sendKeys("sathish2428ss@gmail.com \n");
	}

}
