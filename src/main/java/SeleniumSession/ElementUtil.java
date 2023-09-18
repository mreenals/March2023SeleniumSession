package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public void SelectDropDownByIndex(By locator, int index){
		
		if(index<0) {
			System.out.println("please pass the right (+ve) index");
			return;
		}
		
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public void closeDriver(WebDriver driver) {
		driver.close();
		return;
	}
	
	//*************** Action utils ***************//
	
	public void rightClickAndClickSubMenu(By contextMenuLocator, String optionValue){
		
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()=\""+optionValue+"\"]");
		doClick(optionLocator);

	}
	
	//*************** wait utils *****************//
	public WebElement waitForElementVisible(By locator, int timeOut, int pollingtime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public String waitForTitleContains(String titleFraction, int timeOut) {
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
	
	public String waitForTitleIs(String titleString, int timeOut) {
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
	
	public String waitForURLToBe(String urlValue, int timeOut) {
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
	
	public String waitForURLContains(String urlFraction, int timeOut) {
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
	
	public void sleepTime(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		}catch(InterruptedException e1){
			e1.printStackTrace();
		}
	}
	
	public boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
		return Boolean.parseBoolean(flag);
	}
	
	/**
	 * Custom wait function with 500 milliseconds of fixed polling time
	 * Function provided by Selenium library not used here
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement retryingElement(By locator, int timeOut) {		
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found ..."+ locator + "in attempt "+ attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found ..." + locator + " in attemps "+ attempts);
				sleepTime(500);
			}
			finally {
				
			}
			attempts++; 
			
		}
			
		if(element == null) {
			System.out.println("element is not found.."+ locator + " in teempt "+ attempts);
		}
		return element;
	}
	
	/**
	 * Custom wait function without any Selenium library function
	 * @param locator
	 * @param timeOut
	 * @param pInterval
	 * @return
	 */
	public WebElement retryingElement(By locator, int timeOut, int pInterval) {		
		
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found ..."+ locator + "in attempt "+ attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found ..." + locator + " in attemps "+ attempts);
				sleepTime(pInterval);
			}
			attempts++; 
			
		}
			
		if(element == null) {
			System.out.println("element is not found.."+ locator + " in teempt "+ attempts);
		}
		return element;
	}

}
