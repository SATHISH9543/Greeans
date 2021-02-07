package selinumtask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.redbus.in./");
		
		WebElement userfrom = driver.findElement(By.id("src"));
		
		userfrom.sendKeys("chennai");
		
		
		WebElement distination = driver.findElement(By.id("dest"));
		
		distination.sendKeys("bangolore");
		
		//WebElement userdate = driver.findElement(By.id("onward_cal"));
		
		//userdate.sendKeys("04.01.2021 ");
		
		WebElement srcbusclick = driver.findElement(By.xpath("//button[@id='search_btn']"));
		
		srcbusclick.click();
		
//		WebElement serachbutton = driver.findElement(By.id("search_btn"));
		
	//	serachutton.sendKeys("/n");
		
		
		
		
		
	}

}
