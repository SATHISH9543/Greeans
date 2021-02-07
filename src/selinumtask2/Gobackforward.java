package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gobackforward {
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://www.google.com/");
	
	driver.manage().window().maximize();
	
	
	WebElement searchbox = driver.findElement(By.name("q"));
	
	searchbox.sendKeys("facebook.com \n");
	
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	
	
	driver.quit();
	
	
	
	
	}

}
