package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		
		//open the browser -- chrome
		//ChromeDriver driver = new ChromeDriver();
		
		//ctrl+shift+o shortcut for import
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		try {
			
			//enter the url:
			driver.get("https://www.google.com");
			
			//get the title
			String title =  driver.getTitle();
			
			System.out.println(title);
			
			//String urlpulled =  driver.getCurrentUrl();
			//System.out.println(urlpulled);
					
			if(title.toUpperCase().equals("GOOGLE")) {
				System.out.println("correct title");
			}
			else {
				System.out.println("in-correct title");
			}
			
			//WebElement we = driver.findElement(By.tagName("gramarly-desktop-integration"));
			
			//List<WebElement> elList = we.findElements(By.tagName("div"));
			//System.out.println(elList.toArray());
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
			
						
			
		}finally {
			
			//automation testing ---> automation 
			driver.quit();
		}
	}

}
