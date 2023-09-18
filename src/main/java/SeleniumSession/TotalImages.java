package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {

		//open any URL
		//get the count of links on the page
		//print the text of each link
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By images= By.tagName("img");
		List<WebElement> imgList = driver.findElements(images);
		int imagesCount = imgList.size();
		System.out.println("total images = "+ imagesCount);
		
		for(WebElement e : imgList) {
			String srcVal = e.getAttribute("src");
			String altVal = e.getAttribute("alt");
			System.out.println(srcVal+" : "+altVal);
		}

	}

}
