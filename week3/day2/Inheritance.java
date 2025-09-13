package week3.day2;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestData test = new TestData();
		test.enterCredentials();
		test.navigateToHomePage();
		
		SubClass1 login = new SubClass1();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	
		
	}

}
