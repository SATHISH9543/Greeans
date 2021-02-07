package task6;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard {
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		username.sendKeys("9952052015");
		
		
		
		//Actions s = new Actions(driver);
		 
		//s.doubleClick().perform();

	}
	
	
	
	
	

}
