package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopcluses {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html ");
		
		driver.manage().window().maximize();
		
		WebElement searchbtn = driver.findElement(By.id("autocomplete"));
		
		searchbtn.sendKeys("shrits for men \n");
		
		WebElement product = driver.findElement(By.className("ori_price"));
		
		product.click();
		
		
		
		
		
		
		
		
	}
	
	

}
