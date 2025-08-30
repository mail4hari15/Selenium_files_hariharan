package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		//Click the Lead 
		driver.findElement(By.partialLinkText("Leads")).click();
		//Click the Find lead
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Phone")).click();
		//Enter the Phonenumber
		driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("44");
		driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(10000);
		//Capturing the lead ID 
		String LeadID=driver.findElement(By.xpath("//div[@id='findLeads']//div//div[3]//div[2]//div[2]//div[1]//div[1]//tr[1]//td[1]//a[1]")).getText();
		System.out.println(LeadID);
		driver.findElement(By.xpath("//div[@id='findLeads']//div//div[3]//div[2]//div[2]//div[1]//div[1]//tr[1]//td[1]//a[1]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//Click Find lead
		driver.findElement(By.partialLinkText("Find Leads")).click();
		//Enter the Captured LeadID
		driver.findElement(By.name("id")).sendKeys(LeadID);
		//Click the Find Lead button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.close();

	}

}
