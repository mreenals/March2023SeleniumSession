package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	FirefoxOptions fo = new FirefoxOptions();
	EdgeOptions eo = new EdgeOptions();
	
	@Parameters({"browser", "url", "headless"})
	@BeforeTest
	public void setup(String browserName , String url, String option) {
		
		System.out.println("Running on browser " + browserName);
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			if(option.equals("true")) {
				co.addArguments("--headless");
			}
			
			driver=new ChromeDriver(co);
			break;
		case "firefox":
			if(option.equals("true")) {
				fo.addArguments("--headless");
			}
			driver=new FirefoxDriver(fo);
			break;
		case "edge":
			if(option.equals("true")) {
				eo.addArguments("--headless");
			}
			driver=new EdgeDriver(eo);
			break;
		default:
			System.out.println("Please pass the right browser....");
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
