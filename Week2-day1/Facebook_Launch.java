package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_Launch {

	public static void main(String[] args) 
	{
		// Chrome Driver Instantiated
		ChromeDriver driver=new ChromeDriver(); 
		// Loading URL
		driver.get("https://www.facebook.com/");
		//Maximise the Window
		driver.manage().window().maximize();
		//Facebook login with Credentials
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
