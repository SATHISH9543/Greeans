
package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com/");
	
	driver.manage().window().maximize();
	
	WebElement serachbox = driver.findElement(By.name("q"));
	
	serachbox.sendKeys("Search greens velmurugan \n");
	
	WebElement link = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
	
	link.click();
	
	
	
	
	
	
}
}
