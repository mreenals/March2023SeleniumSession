package SeleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import customexception.FrameWorkException;

/**
 * 
 * @author Mreenal Singh
 *
 */

public class BrowserUtil {
	
	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * valid browsers = chrome/edge/safari/firefox
	 * @param browserName
	 */
	
	public void LaunchBrowser(String browserName) {
		System.out.println("Browser name is: "+browserName);
		
		if(browserName == null) {
			System.out.println("Browser cannot be null");
			throw new FrameWorkException("BROWSERCANNOTBENULL");
		}
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser name.. "+browserName);
			throw new FrameWorkException("NOTAVALIDBROWSER");
		}
	}
	
	public void enterUrl(String url) {
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			System.out.println("Please pass w3c approved URL");
			throw new FrameWorkException("HTTPORHTTPSISMISSINGINURL");
		}
	}
	
	public void enterUrl(URL url) {
		if(String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}
		else {
			System.out.println("Please pass w3c approved URL");
			throw new FrameWorkException("HTTPORHTTPSISMISSINGINURL");
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}

}
