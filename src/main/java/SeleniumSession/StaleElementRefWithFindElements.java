package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefWithFindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM v1
		
		List<WebElement> footerList = driver.findElements(By.cssSelector("footer a"));
		System.out.println(footerList.size());
		
//		for (WebElement e : footerList) {
//			System.out.println(e.getText());
//		}
//		
		for(int i=0; i<footerList.size(); i++) {
			footerList.get(i).click();
			driver.navigate().back();
		}
		
		

	}

	
}
