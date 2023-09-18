package SeleniumSession;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,\"twitter\")]")).click();
		
		//1. detching window IDs:
		Set<String> windowHandles = driver.getWindowHandles();
		
		//set to list:
		ArrayList<String> handleList = new ArrayList<String>(windowHandles);
		
		String parentHandle = handleList.get(0);
		String childHandle = handleList.get(1);
		
		Thread.sleep(1500);
		
		driver.switchTo().window(childHandle);
		System.out.println("Child window title: "+driver.getTitle());
		
		driver.close();
		
		Thread.sleep(1500);
		
		driver.switchTo().window(parentHandle);
		System.out.println("Parent window title: "+driver.getTitle());

	}

}
