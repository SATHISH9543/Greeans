package Task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
			
			WebDriver driver= new ChromeDriver();
			
			driver.get(" https://www.amazon.com/");
			
			driver.manage().window().maximize();
			
			WebElement serach = driver.findElement(By.id("twotabsearchtextbox"));
			
		    serach.sendKeys("i phone x \n");
		    
		    WebElement iphonewindow = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		    
		    iphonewindow.click();
		    
		    String parentwindow = driver.getWindowHandle();
		    System.out.println(parentwindow);
		    
		    Set<String> windowHandles = driver.getWindowHandles();
		    
		    System.out.println("windowhandles");
		    
		    for (String eachwindow : windowHandles) {
				if (!parentwindow.equals(windowHandles)) {
					driver.switchTo().window(eachwindow);
				}
			}
		    
		    
		    
		    
		
	}
	
	
	
	

}
