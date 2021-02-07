package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.snapdeal.com/ ");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.name("keyword"));
		
		searchbox.sendKeys("lgtv \n");
		
		
		WebElement productclick = driver.findElement(By.id("664373719300"));
		
		productclick.click();
		
		
		
		
	}

}
