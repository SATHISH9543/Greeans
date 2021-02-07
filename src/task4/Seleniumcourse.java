package task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcourse {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		WebElement trinerbtn = driver.findElement(By.id("home-tab"));
		
	    trinerbtn.click(); 
	    Thread.sleep(6000);
	
	    WebElement fetchpara = driver.findElement(By.xpath("//p[contains(text(), 'Velmurugan curr')]"));

	    String text = fetchpara.getText();
	    
	    System.out.println(text);
	    
//		WebElement para = driver.findElement(By.xpath("//p[contains(text(), 'Velmurugan curr')]"));
				
		//String text = para.getText();
		
		//System.out.println(text);
		
		
		
		
		
	}
	
	
	
	

}
