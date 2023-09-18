package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM v1
		
		WebElement username = driver.findElement(By.id("input-email")); //v1
		
		username.sendKeys("aadya@gmail.com"); 
		
		driver.navigate().refresh(); //DOM v2
		//DOM get refreshed even when we go back & forward in the web page
		
		username=driver.findElement(By.id("input-email"));
		
		username.sendKeys("test@test.com"); //e1(v1) --> v2 
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found 
		//nothing  to do with session Id, it is just that page got reinitialized
		
		
		
		
		

	}

}
