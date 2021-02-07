 package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzon {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement serachbtn = driver.findElement(By.id("twotabsearchtextbox"));
		
		serachbtn.sendKeys("iphone \n");
		
		
		
		
		 
		
		
	
		
		
		
	}

}
