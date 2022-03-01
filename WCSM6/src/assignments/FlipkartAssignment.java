package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("www.flipkart.com");
			Thread.sleep(2500);
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//span[.='Cart']")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
			Thread.sleep(2500);
			driver.close();
		
		}		
}
	