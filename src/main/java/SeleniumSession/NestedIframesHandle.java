package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframesHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("second crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("destiny crush");
		
		driver.switchTo().parentFrame(); //sel 4.x
		driver.findElement(By.id("jex")).clear();
		driver.findElement(By.id("jex")).sendKeys("crush 2 updated");
		
		driver.switchTo().parentFrame(); //sel 4.x
		driver.findElement(By.id("inp_val")).clear();
		driver.findElement(By.id("jex")).sendKeys("crush 1 updated");
		
		driver.switchTo().parentFrame(); //back to the page/browser context

	}

}
