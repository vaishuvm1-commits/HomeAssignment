package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Locator {
	
	public static class LearnDD {

		public static void main(String[] args) {
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");	
			ChromeDriver driver=new ChromeDriver(options);
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.partialLinkText("SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
		
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			
			Select sel=new Select(sourceDD);
			sel.selectByIndex(4);
			//industryDD
			WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select sel1=new Select(industryDD);
			sel1.selectByValue("IND_MEDIA");

		}

	}

}
