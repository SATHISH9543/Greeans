package Task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
			
			WebDriver driver= new ChromeDriver();
			
			driver.get(" https://www.snapdeal.com/ ");
			
			driver.manage().window().maximize();
			
			WebElement search = driver.findElement(By.id("inputValEnter"));
			
			search.sendKeys("i phone 7 \n");
			
			WebElement pincode = driver.findElement(By.className("sd-input"));
			pincode.sendKeys("600113 \n");
			
			Thread.sleep(4000);
			
			WebElement iphone = driver.findElement(By.xpath("//p[@class='product-title']"));
			
			iphone.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
