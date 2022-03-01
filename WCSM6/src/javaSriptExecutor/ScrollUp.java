package javaSriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollUp {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//scroll Up
		jse.executeScript("window.scrollBy(0,-500)");
		
	}
}