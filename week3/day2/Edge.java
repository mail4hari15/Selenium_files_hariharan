package week3.day2;

public class Edge extends Browser{
	public void takeSnap() {
		System.out.println("takeSnap: Subclass No.3");
	}
	public void clearCookies() {
		System.out.println("clearCookies -Subclass No.4");
	}
public static void main(String[] args) {
	Edge e= new Edge();
	e.takeSnap();
	e.clearCookies();
	e.openURL();
	e.closeBrowser();
	e.navigateBack();
	
	
}
}
