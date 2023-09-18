package SeleniumSession;

import java.security.PublicKey;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By locate_ele= By.xpath("//span[text()=\"right click me\"]");
		
		//Actions act = new Actions(driver);
		
		//act.contextClick(findElement).perform();
		
//		List<WebElement> optionList = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		
//		System.out.println(optionList.size());
//		
//		for (WebElement e : optionList) {
//			System.out.println(e.getText());
//			
//			if(e.getText().equals("Paste")) {
//				e.click();
//				break;
//			}
//		}
		
		//driver.findElement(By.xpath("//span[text()=\"Edit\"]")).click();
		
		selectRightClickOption(locate_ele, "Edit");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectRightClickOption(By contextMenuLocator, String option){
		
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		getElement(By.xpath("//*[text()=\""+option+"\"]")).click();
		
		
	}

}
