package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		WebElement mob = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		
		Actions s = new Actions(driver);
		
		s.moveToElement(mob).perform();
		
		WebElement mobcovers = driver.findElement(By.xpath("(//span[@class='linkTest'])[49]"));
		
		s.moveToElement(mobcovers).perform();
		
		mobcovers.click();
		
		
	}

}
