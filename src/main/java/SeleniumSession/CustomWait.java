package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eUtil = new ElementUtil(driver);

		By email= By.id("input-email11"); 
		eUtil.retryingElement(email, 10).sendKeys("testing");
		
	}

}
