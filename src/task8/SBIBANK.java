package task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIBANK {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://retail.onlinesbi.com/retail/login.htm");
		
		driver.manage().window().maximize();
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[@class='login_button']"));
		
		loginbtn.click();
		
		WebElement userid = driver.findElement(By.id("username"));
		
		userid.sendKeys("9952052015");
		 
		WebElement login = driver.findElement(By.id("Button2"));
		
		login.click();
		
		Thread.sleep(5000);
		
		Alert sss= driver.switchTo().alert();
		
		sss.accept();
		
		
		
		
	}
	
	
	

}
