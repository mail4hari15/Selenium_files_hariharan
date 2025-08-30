package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) {

		// Chrome Driver Instantiated
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options); 
		// Loading URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximise the Window
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTech");
		//firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		//lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		//locate the source DD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate the select class
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		//Marketing selection
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel=new Select(Marketing);
		sel.selectByVisibleText("Automobile");
		//Ownership selection
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel1=new Select(Ownership);
		sel1.selectByValue("OWN_SCORP");
		//Click Button 
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
}
