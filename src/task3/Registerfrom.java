package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerfrom {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        
		username.sendKeys("sathish");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
		
		lastname.sendKeys("kumar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		
		address.sendKeys("tk kabali street mg nagar tharamani chennai ");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
        email.sendKeys("divyakumar3484@gamail.com");	
        
        WebElement phno = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		
        phno.sendKeys("9940528311");
        
        WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
        
        gender.click();
        
       WebElement hobby = driver.findElement(By.xpath("//input[@value='Cricket']"));
       
       hobby.click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
