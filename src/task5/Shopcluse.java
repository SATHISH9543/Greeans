package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopcluse {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		WebElement mobileandeletronices = driver.findElement(By.id("promo-9"));
		
		mobileandeletronices.click();
		
		WebElement phneletro = driver.findElement(By.xpath("//label[text()='Mobile & Tablet Accessories']"));
		
		phneletro.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
