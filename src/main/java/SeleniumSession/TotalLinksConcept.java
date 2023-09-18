package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//open any URL
		//get the count of links on the page
		//print the text of each link
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links= By.tagName("a");
		
		List<WebElement> linksList = driver.findElements(links);
		int linksCount = linksList.size();
		System.out.println("total links = "+ linksCount);
		
		//1. Index based loop
//		for(int i=0; i< linksList.size();i++) {
//			String text = linksList.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(i+" : "+text);
//			}
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				System.out.println(count+" : "+text);
				
		}
			count++;
			
		}

	}

}
