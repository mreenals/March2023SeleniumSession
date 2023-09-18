package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//inject JS script/code   using Selenium-Java with JavaScriptExecutor
		
		//RemoteWebDriver --> WebDriver
		//RWD --> JSE -- executeScript()
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("alert('Hi Naveen')");
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Exciting deals']")));
	}

}
