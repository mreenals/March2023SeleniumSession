package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		//headless: No browser
		//invisible browser//without UI
		//Testing happening behind the scene
		//faster than the normal
		//when to use? Linux OS, Jenkins, Docker, NON UI
		//cons - might not work for complex html, navigations, responsive testing: testing of application with different browser size like dessktop, mobile, micro browser, etc.
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new"); //co.Headless deprecated

		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();

	}

}
