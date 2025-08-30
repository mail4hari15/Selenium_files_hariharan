package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

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
		//Click the Account Tab
		driver.findElement(By.partialLinkText("Accounts")).click();
		//Click the Create Account tab
		driver.findElement(By.partialLinkText("Create Account")).click();
		//Enter teh Account Name
		//Enter the Account Name
		driver.findElement(By.id("accountName")).sendKeys("Hariharan");
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Industry Dropdown selection
		driver.findElement(By.name("industryEnumId")).click();
		WebElement dd =driver.findElement(By.name("industryEnumId"));
		Select owner= new Select(dd);
		owner.selectByValue("IND_SOFTWARE");
		//Select ownership dropdown
		driver.findElement(By.name("ownershipEnumId")).click();
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sel=new Select(Ownership);
		sel.selectByVisibleText("S-Corporation");
		//Select Source Dropdown
		driver.findElement(By.id("dataSourceId")).click();
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select sel1=new Select(Source);
		sel1.selectByValue("LEAD_EMPLOYEE");
		//Marketing Campaign Dropdown
		driver.findElement(By.id("marketingCampaignId")).click();
		WebElement MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select select=new Select(MarketingCampaign);
		select.selectByIndex(6);
		//State Dropdown selection
		driver.findElement(By.id("generalStateProvinceGeoId")).click();
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statet1=new Select(state);
		statet1.selectByValue("TX");
		//Click submit
		driver.findElement(By.className("smallSubmit")).click();
        //Account Name Print
		//driver.wait(10000);
		WebElement element = driver.findElement(By.id("accountName"));
		@SuppressWarnings("deprecation")
		String fieldValue = element.getAttribute("value");
		System.out.println("Account Name is: " + fieldValue);
		



	}

}
