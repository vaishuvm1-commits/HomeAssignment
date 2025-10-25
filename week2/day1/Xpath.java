package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	
	public static class LearnDD {

		public static void main(String[] args) {
			/**
			 * Steps to handle the dropdown:
			 * 1)identify whether the dd elemnt is present in the<select>
			 * 2)if the element is present in the select tag ,locate the locate the element and store in a variable.
			 * 3)instantiate the select class and pass the webelement as an args to the constructor
			 * 4)with the object,use any helper method to locate the dropdown elemnt
			 */
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");	
			ChromeDriver driver=new ChromeDriver(options);
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			//maximize
			driver.manage().window().maximize();
			//enter uname
			//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			 //input[@id='username']
			
			//password
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//click login
			driver.findElement(By.className("decorativeSubmit")).click();
			//click crmsfa
			driver.findElement(By.partialLinkText("SFA")).click();
			//click leads
			driver.findElement(By.linkText("Leads")).click();
			//click createlead
			driver.findElement(By.linkText("Create Lead")).click();
			//companyname
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			//fname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
			//lname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			//sourcedd
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//instantiate select class
			
			Select sel=new Select(sourceDD);
			sel.selectByIndex(4);
			//industryDD
			WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select sel1=new Select(industryDD);
			sel1.selectByValue("IND_MEDIA");

		}

	}

}
