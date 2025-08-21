package week1.day2;

public class Browser {

	public static void main(String[] args) {
		 Browser browser = new Browser();
         browser.launchBrowser("Chrome");
	     browser.loadUrl();
	}
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName + " browser is launched.");
	}
	public void loadUrl()
	{
		   System.out.println("Browser is closed.");
	}
	
}
