package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenstech {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	WebElement greens = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;']"));
	
	String text = greens.getText();
	
	System.out.println(text);
	
	
	
	
}
}
