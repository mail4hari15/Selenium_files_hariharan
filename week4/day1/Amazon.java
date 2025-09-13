package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> listValue = driver.findElements(By.className("a-price-whole"));
		List<String> Prices = new ArrayList<String>();

		for (WebElement iter : listValue) {

			String text2 = iter.getText();
			Prices.add(text2);
		}

		System.out.println(Prices);
	}

}
