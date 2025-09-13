package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Load URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        // Switch to frame
        driver.switchTo().frame("iframeResult");

        // Click "Try it" button to trigger prompt
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();

        // Switch to alert
        Alert promptAlert = driver.switchTo().alert();

        // Send text to prompt
        promptAlert.sendKeys("Hari");
        Thread.sleep(1000);

        // Accept the alert
        promptAlert.accept();

        // Verify the action
        WebElement resultText = driver.findElement(By.id("demo"));
        String displayedText = resultText.getText();

        if (displayedText.contains("Hari")) {
            System.out.println("Test Passed: Alert accepted and text displayed correctly: " + displayedText);
        } else {
            System.out.println("Test Failed: Unexpected text: " + displayedText);
        }

        // Optional: Click "Try it" again and dismiss
        tryItButton.click();
        Alert cancelAlert = driver.switchTo().alert();
        cancelAlert.dismiss();

        String displayedTextAfterCancel = resultText.getText();
        System.out.println("Text after cancel: " + displayedTextAfterCancel);

        // Close browser
        driver.quit();
    }
}
