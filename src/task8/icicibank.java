package task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(" https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n"
			+ "");
	
	  driver.manage().window().maximize();
	  
	  driver.switchTo().frame("loginpage");
	  
	  WebElement userid = driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
	
	  userid.click();
	  
	 userid.sendKeys("sathishkumar");
	 
	 
	 
	  
	  

}

		
	}
	
