package greens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Greenstech {
public static void main(String[] args) {
	
	
	System.getProperty("webderiver.Edge.driver", "C:\\Users\\Selfish\\eclipse-workspace\\Selinum1class\\selinumlibery\\driver\\msedgedriver.exe");	
	
	WebDriver driver = new EdgeDriver();

	
	driver.get("http://www.greenstechnologys.com/");
	driver.get("http://www.facebook.com/");

}
}
