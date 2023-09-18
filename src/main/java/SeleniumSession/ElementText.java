package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By registierHeader = By.tagName("h1");
		By forgottenPwd = By.linkText("Forgotten Password");
		
		doElementGetText(registierHeader);
		doElementGetText(forgottenPwd);
		

	}
	
	public static String doElementGetText(By locator) {
		System.out.println("Element text is ==>" + getElemnet(locator).getText());
		return getElemnet(locator).getText();
	}
	
	public static WebElement getElemnet(By locator) {
		return driver.findElement(locator);
	}

}
