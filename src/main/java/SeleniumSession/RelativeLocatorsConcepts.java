package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List; 

public class RelativeLocatorsConcepts {

	public static void main(String[] args) {

		//sel 4.x feature:
		
		//				above
		//		left<---- ele ---> right
		//				below
		//near
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele= driver.findElement(By.linkText("Brampton, Canada"));
		
		//right of ele:
		
		String rightIndexString = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndexString);
		
		//below of ele:
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		//near of element:
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id=\"most_pollutedCitiesRank\"]/p")).below(ele));
		
		System.out.println(belowElements.size());

	}

}
