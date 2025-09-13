package week4.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Marathon {
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver(); 		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("cinemas-inactive")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/span[contains(text(),'Select Cinema')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='PVR Sathyam Royapettah Chennai']")).click();
		Thread.sleep(10000);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(10000);
		//Select Movie Dropdown
		//driver.findElement(By.xpath("//div/span[contains(text(),'Select Movie')]")).click();
		//Movie Selection
		//driver.findElement(By.className("p-card-title")).click();
		//driver.findElement(By.xpath("//div/span[contains(text(),'MADHARAASI')][1]")).click();
		driver.findElement(By.xpath("(//span[text()='MADHARAASI'])[2]")).click();
		
		
		//driver.findElement(By.xpath("//div/span[contains(text(),'Select Timing')]")).click();
	
		Thread.sleep(10000);
		//driver.findElement(By.className("p-dropdown-items")).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//span[text()='09:00 AM']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
				Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='BU.BUDGET|W:15']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Seat info
		WebElement seatInfo = driver.findElement(By.className("seat-info"));
		String SeatNUmber = seatInfo.getText();
		System.out.println("Seat Number: " + SeatNUmber);
		
		//grand-total
		WebElement GrandTotal = driver.findElement(By.className("all-grand"));
		String Total = GrandTotal.getText();
		System.out.println("Grand Total Amount: " + Total);
		//Continue Button
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"pr_id_256_content\"]/div/div/div[3]/div/div/div[1]/span/i")).click();
		WebElement closeButton = null;
		closeButton.click();
		
		
		
		
			
	}

}
