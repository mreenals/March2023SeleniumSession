package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSAssesmentTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By first_name = By.id("input-firstname");
		
		driver.findElement(first_name).sendKeys("Mreenal");
		
		
		
		//driver.quit();
		
	}

}
