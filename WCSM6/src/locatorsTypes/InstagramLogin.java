package locatorsTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("rohan");
		
		driver.findElement(By.name("password")).sendKeys("gvsbvhwbdsy");
		
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		
		
	}

}