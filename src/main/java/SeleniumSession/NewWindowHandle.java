package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String windowHandle = driver.getWindowHandle();
		
		//selenium 4.x
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getTitle());
		
		//driver.quit();
		

	}

}
