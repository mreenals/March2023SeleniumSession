package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		
		WebElement tgtElement = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
//		act
//			.clickAndHold(srcElement)
//				.moveToElement(tgtElement)
//					.release()
//						.build().perform();
		
		act.dragAndDrop(srcElement, tgtElement).perform();
		

	}

}
