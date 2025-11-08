package week4.day1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("http://www.amazon.in");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MobilePhones");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> price = driver.findElements(By.className("a-price-whole"));
			
			int size = price.size();
			System.out.println(size);
			
			List<String> list=new ArrayList<String>();
			for (WebElement each : price) {
				String text2 = each.getText();
				
				list.add(text2);
			}
			System.out.println(list);
	}

}
