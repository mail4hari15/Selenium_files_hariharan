package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Lead {

	public static void main(String[] args) throws InterruptedException {
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
		//click crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTech");
		//Title
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium Sample_Project");
		//Click the submit button 
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Lead Created successfully");
		//Close
		//driver.close();
	
	}
}
