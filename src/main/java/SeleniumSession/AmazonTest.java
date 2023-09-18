package SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.LaunchBrowser("edge");
		brUtil.enterUrl("http://amazon.com");
		
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}else {
			System.out.println("Title is not correct");
		}
		
		String actUrl = brUtil.getPageUrl();
		if(actUrl.contains("amazon")) {
			System.out.println("correct url");
		}else {
			System.out.println("Incorrect url");
		}
		
		brUtil.quitBrowser();

	}

}
