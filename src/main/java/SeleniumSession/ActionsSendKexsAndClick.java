package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKexsAndClick {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email");//xpath("//input[@id=\"input-email\"]");
		By passwd=By.id("input-password");
		
		Actions act= new Actions(driver);
		
		act.sendKeys(driver.findElement(emailId), args);
 		

	}

}
