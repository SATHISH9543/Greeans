package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		
		Actions s=new Actions(driver);
		
		s.moveToElement(prime).perform();
		
		WebElement click = driver.findElement(By.id("multiasins-img-link"));
		
		s.moveToElement(click).perform();
				
		
		
		
		
	}

}
