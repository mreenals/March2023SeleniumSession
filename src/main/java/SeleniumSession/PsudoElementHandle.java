package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsudoElementHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//::before/::after
		
		//JS:

		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"), '::before').getPropertyValue('content')";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String man_text= js.executeScript(script).toString();
		System.out.println(man_text);
		
		if(man_text.contains("*")) {
			System.out.println("Element is mandatory");
		}
		
	}

}
