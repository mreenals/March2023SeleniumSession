package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoContextMenu {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//By locatMenu = By.xpath("//*[text()=\"Copy\"]");
		
		By locatClick = By.xpath("//*[text()=\"right click me\"]");
		//WebElement click_ele = driver.findElement(locatClick); 
		
//		Actions act = new Actions(driver);
//		
//		act
//			.contextClick(click_ele)
//				.click(driver.findElement(locatMenu))
//					.perform();
		
		rightClickAndClickSubMenu(locatClick, "Delete");
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void rightClickAndClickSubMenu(By contextMenuLocator, String optionValue){
		
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()=\""+optionValue+"\"]");
		driver.findElement(optionLocator).click();

	}

}
