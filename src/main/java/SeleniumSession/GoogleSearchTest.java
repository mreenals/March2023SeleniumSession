package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
			
		
		List<WebElement> suggList=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span"));
		
		System.out.println(suggList.size());

	}

}
