package week4.day1;

public class Overloading {

	public void Overloadingsample(String msg,String status)
	{
		System.out.println("Message "+ msg +" | Status " + status);
	}

	public void Overloadingsample(String msg,String status,Boolean snap) {

		System.out.println("Message "+ msg +"| Status " + status);
		if (snap) {
			System.out.println("Snapshot: Captured");
		} else {
			System.out.println("Snapshot: Skipped");
		}
	}
	public static void main(String[] args) {
		Overloading demo = new Overloading();
		// Calling first overloaded method (2 parameters)
		demo.Overloadingsample("Browser launched successfully", "PASS");
		// Calling second overloaded method (3 parameters)
		demo.Overloadingsample("Login button clicked", "PASS", true);
		// Another call with snapshot skipped
		demo.Overloadingsample("Error message displayed", "FAIL", false);

	}
}