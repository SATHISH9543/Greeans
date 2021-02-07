package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class teslaform {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		
		firstname.sendKeys("k.sathish");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("kumar");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("sathish2428ss@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		
		gender.click();
		
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9952052015");
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.sendKeys("28 DEC 1995");
		
		WebElement sub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		sub.sendKeys("selenium");
		
		WebElement hobby = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		hobby.click();
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("tk kabali street mg nagar tharamni");
		
		WebElement state = driver.findElement(By.className("css-1hwfws3"));
		state.sendKeys("tamilnadu");
		
		
		
		
		
		
		
		
		
	}

}
