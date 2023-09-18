package SeleniumSession;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPwd = By.linkText("Forgotten Password11");
		try {
			driver.findElement(forgotPwd).click();	
		}catch(NoSuchElementException e){
			System.out.println("getting element exception..please check the element");
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());

	}

}
