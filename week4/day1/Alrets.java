package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrets {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following-sibling::button")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Nandha");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		
	}
}
