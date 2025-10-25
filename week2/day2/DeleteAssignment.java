package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
        driver.get("http://leaftaps.com/opentaps/");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();		

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("7889");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();

		String leadIDs= driver.findElement(By.xpath("//table/tbody/tr/td/div[contains(@ class,'x-grid3-cell-inner')]/a")).getText();
        driver.findElement(By.xpath("//table/tbody/tr/td/div [contains(@ class,'x-grid3-cell-inner')]/a")).click();

		driver.findElement(By.linkText("Delete")).click();

		

		//Close the browser
		driver.close();
	}


}