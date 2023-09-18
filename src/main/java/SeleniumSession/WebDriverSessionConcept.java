package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		//enter the url:
		driver.get("https://www.google.com");
		
		//get the title
		String title =  driver.getTitle();
		System.out.println("act title is :"+title);
		
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
		//System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
		System.out.println(driver.getTitle()); //sessions id exist but session id is invalid

	}

}
