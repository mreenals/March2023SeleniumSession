package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		// //span[text()='Johnson Charles']/ancestor::td/following-sibling::td//span
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-1377006/full-scorecard");
		
		Thread.sleep(4000);
		
		String wkTakerName = driver.findElement(By.xpath("//span[text()='Johnson Charles']/ancestor::td/following-sibling::td//span")).getText();
		
		System.out.println(wkTakerName);

	}

}
