package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_leafTaps {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']//following-sibling::button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		
		//Alert (Confirm Dialog)
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following-sibling::button")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		
		//Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']//following-sibling::button")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[1]")).getText());
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[1]")).click();

		
		//sweet Alert
		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']//following-sibling::button")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']//p)[2]")).getText());
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]/..")).click();

		//prompt alert
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following-sibling::button")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Nandha");
		Alert aler = driver.switchTo().alert();
		aler.accept();
		
		//maximize
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']//following-sibling::button")).click();
		driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p)[3]")).click();
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();

		
		
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		driver.close();
	}

}
