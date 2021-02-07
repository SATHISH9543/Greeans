 package task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.source.tree.ContinueTree;

public class hdfcbank {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("  https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		Thread.sleep(5000);
	
		WebElement continubtn = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		continubtn.sendKeys("sathish");
		
		WebElement cont = driver.findElement(By.xpath("//img[@alt='continue']"));
		 
		cont.click();
		
		WebElement pass = driver.findElement(By.name("fldPassword"));
		
		pass.sendKeys("9952052015");
		
		WebElement login = driver.findElement(By.xpath("//img[@alt='Login']"));
		
		login.click();
		
		Thread.sleep(2000);
		
		Alert sd = driver.switchTo().alert();
		sd.accept();
		
		
		 
		
		
		
		
		
		
	}

}
