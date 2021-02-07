package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggyform {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.swiggy.com/");
	
	driver.manage().window().maximize();
	
	WebElement sing = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	sing.click();
	
	WebElement mob = driver.findElement(By.id("mobile"));
	mob.sendKeys("9025375817");
	
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("k.sathishkumar");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("sathish2428ss@gmail.com");
	
    WebElement pass = driver.findElement(By.id("password"));
    pass.sendKeys("24282428 \n");



}



}
