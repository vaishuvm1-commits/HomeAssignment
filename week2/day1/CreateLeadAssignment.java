package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);

		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		// Login
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();		

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fenn");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");

		driver.findElement(By.name("submitButton")).click();

		System.out.println(driver.getTitle());

		driver.close();


	}

}