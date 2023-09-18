package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,\"twitter\")]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		//switch driver to child window (twitter)
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		
		//close the child window
		driver.close();
		
		//come back to parent window
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
