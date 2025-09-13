package week4.day1;

public class MainExecutionClass {
public static void main(String[] args) {
	// Object for BasePage
    BasePage base = new BasePage();
    base.findElement("Username Field");
    base.enterText("Username Field", "admin");
    base.clickElement("Login Button");
    base.performCommonTasks();

    System.out.println("---------------------------");

    // Object for LoginPage
    LoginPage login = new LoginPage();
    login.findElement("Password Field");
    login.enterText("Password Field", "password123");
    login.clickElement("Submit Button");
    login.performCommonTasks();  // Calls overridden method
}
}
