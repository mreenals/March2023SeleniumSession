package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleLangLinks {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println("total link langs: "+langLinks.size());
		
		for(WebElement element : langLinks) {
			String text=element.getText();
			System.out.println(text);
			
			if(text.equals("Italiano")) {
				System.out.println("This is Italy");
				element.click();
				break;
			}
		}

	}

}
