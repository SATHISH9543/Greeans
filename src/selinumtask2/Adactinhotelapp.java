package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapp {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/ ");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		
		txtusername.sendKeys("SATHISH");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("24282428 \n");
		
	}	

}
