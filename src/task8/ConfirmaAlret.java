package task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmaAlret {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement alretokandcancel = driver.findElement(By.xpath("//a [@href='#CancelTab']"));
		
		alretokandcancel.click();
		
		WebElement alretbtn= driver.findElement(By.xpath(" //button[@class='btn btn-primary']"));
		
		alretbtn.click();
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		
		
	}

}
