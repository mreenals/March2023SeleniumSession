package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigationMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		//driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to(new URL("https://www.amazone.com"));
		
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.amazone.com");
		//System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		//driver.quit();
		

	}

}
