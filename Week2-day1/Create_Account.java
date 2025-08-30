package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Account {

	public static void main(String[] args) {
		// Chrome Driver Instantiated
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options); 
		// Loading URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximise the Window
		driver.manage().window().maximize();
		//Enter the User_name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter the Password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CrmSfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click the Account Tab
		driver.findElement(By.partialLinkText("Accounts")).click();
		//Click the Create Account tab
		driver.findElement(By.partialLinkText("Create Account")).click();
		//Enter the Account Name
		driver.findElement(By.id("accountName")).sendKeys("Hariharan");
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//No.Of Employees
		driver.findElement(By.name("numberEmployees")).sendKeys("10");
		//OffsiteName
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		//Submit
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Account Created successfully");
		//Close
		//driver.close();
	}

}
