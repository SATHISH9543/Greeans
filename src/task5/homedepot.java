package task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepot {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Selfish\\\\eclipse-workspace\\\\Selinum1class\\\\selinumlibery\\\\driver\\\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		
		WebElement alldepartment = driver.findElement(By.id("//a[@class='ShoppingLinks__link js__flyout--open ShoppingLinks__link--force-open']"));
		
		Actions s = new Actions(driver);
		
		s.moveToElement(alldepartment).perform();

		WebElement heatingandcooling = driver.findElement(By.xpath("(//a[@class='MainFlyout__link'])[10]"));
		
		s.moveToElement(heatingandcooling).perform();
		
		WebElement aircondinor = driver.findElement(By.xpath("(//a[@class='MainFlyout__link MainFlyout__link--active'])[2]"));
		
		s.moveToElement(aircondinor).perform();
		
		WebElement portableac = driver.findElement(By.xpath("(//a[@class='MainFlyout__link'])[34]"));
		
		s.moveToElement(portableac).perform();
		
		portableac.click();
	}

}
