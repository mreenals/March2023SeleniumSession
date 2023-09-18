package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingWaitConcept {

	public static void main(String[] args) {
		
		//10 sec to load all elements (polling time 2 sec, polling attempts 4)
		//0 sec --> e1 --> not available
		//2 sec --> e1 --> Not available
		//4 sec --> e1 --> Not available
		//6 sec --> e1 --> Not available
		
		//default polling time in selenium = 500 ms (0.5 sec)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email= By.id("input-email"); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("testing");

	}

}
