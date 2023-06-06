package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SweetAlert {
	
	public static void main(String[] args) {
		
		//Load the url https://www.irctc.co.in/nget/train-search
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Chennai Egmore");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		//Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("CAPE");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();

		//click search button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		//Click refresh button
		driver.findElement(By.xpath("(//table/tr/td[@class='ng-star-inserted'])[2]")).click();
		//Click WL and Click BookNow button
		driver.findElement(By.xpath("(//td[@class='link ng-star-inserted'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[text()=' Book Now '])[1]")).click();
		//Click No button in the alert
		driver.findElement(By.xpath("//span[text()='No']/parent::button")).click();
		driver.close();

		
	}

}
