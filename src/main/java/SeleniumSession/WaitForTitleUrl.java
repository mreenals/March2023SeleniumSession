package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//wait for the right title:
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitForTitleContains("Free CRM", 5);

	}
	
	//can be used in ElementUtils
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				//System.out.println("Exact title is \""+driver.getTitle()+"\"");
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("\"" + titleFraction + "\" string is not present in the title");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForTitleIs(String titleString, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleIs(titleString))) {
				//System.out.println("Exact title is \""+driver.getTitle()+"\"");
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("\"" + titleString + "\" string is not present in the title");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForURLToBe(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
				//System.out.println("Exact url is \""+driver.getCurrentUrl()+"\"");
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("\"" + urlValue + "\" string is not present in the url");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
				//System.out.println("Exact url is \""+driver.getCurrentUrl()+"\"");
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("\"" + urlFraction + "\" string is not present in the url");
			e.printStackTrace();
		}
		return null;
	}

}
