package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement twElement = driver.findElement(By.xpath("//a[contains(@href,\"twitter\")]"));
		WebElement fbElement = driver.findElement(By.xpath("//a[contains(@href,\"facebook\")]"));
		WebElement ytElement = driver.findElement(By.xpath("//a[contains(@href,\"youtube\")]"));
		WebElement liElement = driver.findElement(By.xpath("//a[contains(@href,\"linkedin\")]"));
		
		twElement.click();
		fbElement.click();
		ytElement.click();
		liElement.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		System.out.println("What is the URL: " + driver.getCurrentUrl());

	}

}
