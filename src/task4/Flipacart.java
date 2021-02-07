package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipacart {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/ ");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 
		WebElement searchbtn = driver.findElement(By.name("q"));
		
		searchbtn.sendKeys("ipnone12 \n");
		
		Thread.sleep(5000);
		
		WebElement firstproduct = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		
		
		firstproduct.click();
		
		
		
		
		
		
		
		
		
	}

}
