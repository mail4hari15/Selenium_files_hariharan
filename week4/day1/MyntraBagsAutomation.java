package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MyntraBagsAutomation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Load Myntra URL
        driver.get("https://www.myntra.com/");

        // Search for "bags"
        WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
        searchBox.sendKeys("bags");
        driver.findElement(By.className("desktop-submit")).click();
        Thread.sleep(2000);

        // Apply filter: Gender → Men
        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
        Thread.sleep(2000);

        // Apply filter: Category → Laptop Bags
        driver.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
        Thread.sleep(2000);

        // Get total count of items
        String itemCount = driver.findElement(By.className("title-count")).getText();
        System.out.println("Total items found: " + itemCount);

        // Get list of brands
        List<WebElement> brands = driver.findElements(By.className("product-brand"));
        System.out.println("\nBrands:");
        for (WebElement brand : brands) {
            System.out.println(brand.getText());
        }

        // Get list of product names
        List<WebElement> bagNames = driver.findElements(By.className("product-product"));
        System.out.println("\nBag Names:");
        for (WebElement name : bagNames) {
            System.out.println(name.getText());
        }

        // Close browser
        driver.quit();
    }
}
