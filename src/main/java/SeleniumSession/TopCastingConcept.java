package SeleniumSession;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingConcept {

	public static void main(String[] args) {
		
		//0. Valid but recommended only if there is only one chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//1. valid top casting but not recommended and will never be used
		//SearchContext sc = new ChromeDriver();
		
		//2. Valid and recommended -- local execution
		//WebDriver driver = new ChromeDriver();
		
		//3. valid and recommended -- local execution 
		//RemoteWebDriver driver = new ChromeDriver();

		//4. valid only for chrome/edge
		//ChromiumDriver driver = new ChromeDriver();
		//driver = new EdgeDriver();
		
		//driver = new FirefoxDriver();
		
		//5. valid and recommended - used for remote execution/selenium grid/cloud/docker - aws/browser stack/LT
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. Valid but not recommended 
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		

	}

}
