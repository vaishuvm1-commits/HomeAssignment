package week3.day2;

public class Chrome extends Browser {

	
		
		
		// TODO Auto-generated method stub
		public  void openIncognito()
		{
			System.out.println("Opened Incognito ");
		}
		
		public void clearCache()
		{
			System.out.println( "Cache cleared");
		}

		public static void main(String[] args) {
			Chrome chrome = new Chrome();
			chrome.openUrl("chrome");
			chrome.openIncognito();
			chrome.clearCache();
			chrome.closebrowser("done");
			
		}
	

}
