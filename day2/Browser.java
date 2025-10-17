package week1.day2;

public class Browser {
	
	
	
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}

	public String loadUrl()
	{
		return "URL loaded successfully";

	}

	public static void main(String[] args) {

		Browser b = new Browser();
		b.launchBrowser("FireFox");
		String url = b.loadUrl();
		System.out.println(url);

	}

}
