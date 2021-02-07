 package task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(" https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame("login_page");
	driver.manage().window().maximize(); 
	Thread.sleep(5000);
	WebElement enterid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	enterid.sendKeys("9952052015");
	
	WebElement loginbtn = driver.findElement(By.xpath("(//*[@valign='bottom'])[2]"));
	loginbtn.click();
	
	WebElement login = driver.findElement(By.xpath("//img[@alt='Login']"));
	login.click();
	
	Alert s = driver.switchTo().alert();
	s.accept();		
	 
	
	
	
	
}  

	
	
	
	
}
