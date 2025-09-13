package week4.day1;

public class Excecution_Main {


	public static void main(String[] args) {
		// Object of SuperClass
		SuperClass superObj = new SuperClass();
		superObj.displayMessage();  // Calls SuperClass method

		// Object of SubClass
		SubClass subObj = new SubClass();
		subObj.displayMessage();    // Calls Overridden method in SubClass
	}


}
