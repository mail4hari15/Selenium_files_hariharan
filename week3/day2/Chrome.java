package week3.day2;

public class Chrome extends Browser {
	public void openIncognito()
	{
		System.out.println("openIncognito: Subclass function No.1");
	}
	public void clearCache() {
		System.out.println("clearCache: Subclass function No.2");
	}
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	}

}
