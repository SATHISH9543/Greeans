package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpathmethod {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		username.sendKeys("sathish2428ss@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		
		password.sendKeys("24282428 \n");
		
		
		
		
	}

}
