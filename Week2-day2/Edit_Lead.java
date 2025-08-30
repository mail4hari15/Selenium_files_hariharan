package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {
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
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTech");
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		//Firest name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("HARI");
		//Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		//Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is the sample description");
		//email-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hariharan@yopmail.com");
		//StateSelection
		driver.findElement(By.name("generalStateProvinceGeoId")).click();
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select STA=new Select(State);
		STA.selectByVisibleText("New York");

		//Click the submit button 
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Lead Created successfully");
		//Edit Lead
		driver.findElement(By.partialLinkText("Edit")).click();
		//clear description
		driver.findElement(By.name("description")).clear();
		//Enter the Important Notes
		driver.findElement(By.name("importantNote")).sendKeys("This is the Sample Important Notes");
		//Click the submit button 
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();


	}
}
