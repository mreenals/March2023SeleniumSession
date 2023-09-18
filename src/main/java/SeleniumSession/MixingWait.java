package SeleniumSession;

public class MixingWait {

	public static void main(String[] args) {
		
		//imp wait = 10 secs -- for all the elements
		//webdriverwait = 15 secs -- username
		
		//username:
		//imp:		10 secs --> 2 secs --> 2 secs
		//WDWait:	15 secs --> 5 secs --> 5 secs
		//total: 2+5 = 7 secs
		
		//username:
		//imp:		10 secs --> 9 secs --> 9 secs
		//WDWait:	15 secs --> 14 secs --> 14 secs
		//total: 9+14 = 23 secs
		
		//username:
		//imp:		10 secs --> 10 secs --> 10 secs (not found)
		//WDWait:	15 secs --> 15 secs --> 15 secs (not found)
		//total: 10+15 = 25 secs
		
		//username:
		//imp:		10 secs --> 10 secs --> 10 secs (not found)
		//WDWait:	15 secs --> 4 secs --> 4 secs
		//total: 10+4 = 14 secs
		
		System.out.println("Warning: Do not mix implicit and explicit waits. Doing so can cause unpredictable wait times. For example, setting"); 
		System.out.println("an implicit wait of 10 seconds and an explicit wait of 15 seconds could cause a timeout to occur after 7 seconds or");
		System.out.println("23 seconds etc as shown in examples as a part of comments in this file.");

	}

}
