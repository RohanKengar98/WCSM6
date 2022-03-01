package xpathLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction {
	//Instagram Login Using TextFuction

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("royalKing1234");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(2000);
		String errorMessage = driver.findElement(By.xpath("//div[@class='eiCW-']")).getText();
		System.out.println(errorMessage);
		
	}

}