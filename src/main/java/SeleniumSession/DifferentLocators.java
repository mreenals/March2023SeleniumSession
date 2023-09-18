package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. ID: unique locator:
		//ele -- mreenal
		//ele2 -- selenium
		
		//driver.findElement(By.id("selenium")).sendKeys("");
		
		//2. NAME: can be duplicate
		//ele -- mreenal
		//ele2 -- mreenal
		
		//driver.findElement(By.name("mreenal")).sendKeys("mreenal.singh@gmail.com");
		
		//3. CLASS NAME: can be duplicate and most of the time it is duplicate
		//driver.findElement(By.className("form-control")).sendKeys("Mreenal");
		
		//4. Xpath: not an attribute....address of the element in HTML DOM (//*[@id="input-firstname"]) (//*[@id="content"]/form/div/div/input[2])
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("mreenal");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
//		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
//		
//		doSendKeys(fn_xpath, "");
//		doSendKeys(password_xpath, "");
		
		//5. CSS SELECTOR: not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Mreenal");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Singh");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//6. LinkTest: only for links...with the text of the link.
		//html tag = <a>
		//attributes, linktext
		//driver.findElement(By.linkText("Delivery Information")).click();
		
//		By deliveryInfoLink = By.linkText("Delivery Information");
//		doClick(deliveryInfoLink);
		
		//7. Partial link Test: only for the links....with partial text of the link
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. TAG NAME: Html tag...not an attribute
		//driver.findElement(By.tagName("input")).sendKeys("mreenal");
		System.out.println(driver.findElement(By.tagName("h1")).getText());

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();		
	}

}
