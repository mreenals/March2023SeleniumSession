package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgottenPwd = By.linkText("Forgotten Password");
		By firstName = By.id("input-firstname");
		By logoImage = By.className("img-responsive"); 
		
		String forgotpwd_href = driver.findElement(forgottenPwd).getAttribute("href");
		System.out.println(forgotpwd_href);
		
		String fn_placeholder_val = driver.findElement(firstName).getAttribute("placeholder");
		System.out.println(fn_placeholder_val);
		
		WebElement logo_ele= driver.findElement(logoImage);
		String srcVal = logo_ele.getAttribute("Src");
		String titleVal =logo_ele.getAttribute("title");
		
		System.out.println(srcVal);
		System.out.println(titleVal);

	}

}
