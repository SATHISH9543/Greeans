package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	// title 
			String title = driver.getTitle();
		     System.out.println(title);
		     
		     String s = driver.getCurrentUrl();
		     
		     System.out.println(s);
		     	         	     
		     WebElement txtusername = driver.findElement(By.id("email"));
		     	     
		     txtusername.sendKeys("sathish2428ss@gmail.com");
		    
		     
		     WebElement password = driver.findElement(By.name("pass"));
		     
		     password.sendKeys("24282428");
		    
		     driver.findElement(By.name("login")).click();
		     
		
		     
		
		     
		

	
}
}

