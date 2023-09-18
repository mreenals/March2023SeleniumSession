package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWithFluentWaitFeatures {

	//WebDriverWait --> FluentWait --> Wait (until();)
						//until(){}
						//own methon
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email= By.id("input-email"); 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
					.withMessage("----time out...No such element..---"+email)
						.until(ExpectedConditions.presenceOfElementLocated(email))
							.sendKeys("testing");

	}

}
