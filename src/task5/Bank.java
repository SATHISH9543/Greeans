package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement dest = driver.findElement(By.id("bank"));
		
		Actions acc = new Actions(driver);
		
		acc.dragAndDrop(source, dest).perform();
		
		WebElement amount = driver.findElement(By.xpath("//a[text()= ' 5000 ']"));
	
		WebElement loc = driver.findElement(By.id("amt7"));	
	
		Actions a = new Actions(driver);
		
		a.dragAndDrop(amount, loc).perform();
		
		WebElement loan = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		
		WebElement path = driver.findElement(By.className("placeholder"));
		
		Actions b = new Actions(driver);
		
		b.dragAndDrop(loan, path).perform();
		
		
		WebElement debit = driver.findElement(By.xpath("//a[text()=' -5000 ']"));
	
	WebElement minusamount = driver.findElement(By.id("amt8"));
		
	Actions c = new Actions(driver);
		
		c.dragAndDrop(debit, minusamount).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
