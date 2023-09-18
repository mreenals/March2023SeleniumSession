package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	
	//WebDriverWait --> FluentWait --> Wait (until();)
						//until(){}
						//own methon
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email= By.id("input-email"); 
		
		waitForElementVisibleWithFluentWait(email, 10, 2).sendKeys("testing");

	}
	/**
	 * Implementations should wait until the condition evaluates to a value that is neither null norfalse. Because of this contract, 
	 * the return type must not be Void. 
	 *
	 * If the condition does not become true within a certain time (as defined by the implementingclass), this method will 
	 * throw a non-specified Throwable. This is so that animplementor may throw whatever is idiomatic for a given test infrastructure 
	 * (e.g. JUnit4 wouldthrow AssertionError).
	 *
	 * @param locator
	 * @param timeOut
	 * @param pollingTime
	 * @return
	 */
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("-----time out... element not found..."+ locator);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
