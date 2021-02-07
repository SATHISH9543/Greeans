package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {

	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
	 

		WebElement selenium = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions sel = new Actions(driver);
		
		sel.moveToElement(selenium).perform();
		
		
		WebElement s = driver.findElement(By.xpath("//span[text()='Selenium']"));
		
		sel.moveToElement(selenium).perform();
	
		s.click();		
		
		
		
		
		
		
		
		
	
}
}
