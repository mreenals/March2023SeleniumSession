package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		try {
			Alert alert = waitForAlertJS(10);
			alert.accept();
		}catch(TimeoutException e) {
			System.out.println("No alert ditected");
			e.printStackTrace();
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(alert.getText());
		//alert.accept();

	}
	
	/**
	 * 
  	 * Open Declaration   <Alert> Alert org.openqa.selenium.support.ui.FluentWait.until(Function<? super WebDriver, Alert> isTrue)
	 *
	 *
	 *	Repeatedly applies this instance's input value to the given function until one of the following occurs: 
	 *	1.the function returns neither null nor false
	 *	2.the function throws an unignored exception
	 *	3.the timeout expires
	 *	4.the current thread is interrupted
	 *
	 *	Specified by: until(...) in Wait
	 *	Type Parameters:<V> The function's expected return type.Parameters:isTrue the parameter to pass to the 
	 *	ExpectedConditionReturns:The function's return value if the function returned something different from null 
	 *	or false before the timeout expired.Throws:TimeoutException - If the timeout expires.
	 * @param timeOut
	 * @return
	 */
	public static Alert waitForAlertJS(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

}
