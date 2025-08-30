package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectclassinSelenium {

	public static void main(String[] args) {

		// Chrome Driver Instantiated
		ChromeDriver driver=new ChromeDriver();
		// Loading URL
		driver.get("http://www.facebook.com/");
		//Maximise the Window
		driver.manage().window().maximize();
		//Implesit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		//Firstname
		driver.findElement(By.name("firstname")).sendKeys("Hariharan");
		//Last Name
		driver.findElement(By.name("lastname")).sendKeys("Raja");
		//DateOf birth Selection
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));	
		Select DOB=new Select(day);
		DOB.selectByValue("01");
		//Select month
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		Select mon=new Select(Month);
		mon.selectByIndex(10);
		//Select year
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select DBY=new Select(year);
		DBY.selectByContainsVisibleText("2000");
		//Gender Selection
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//Email
		driver.findElement(By.name("reg_email__")).sendKeys("hariharan@yopmail.com");
		//Password
		driver.findElement(By.id("password_step_input")).sendKeys("Hari@123");
		
	}

}
