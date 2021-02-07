  package task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promtalret {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
				
				WebDriver driver= new ChromeDriver();
				
				driver.get(" http://demo.automationtesting.in/Alerts.html");
				
				driver.manage().window().maximize();
				
				WebElement okbtn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
				
				okbtn.click();
				
				WebElement promt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
				
				promt.click();
				
				Thread.sleep(2000);
				
				Alert a = driver.switchTo().alert();
				a.sendKeys("sathish");
				a.accept();

}
} 