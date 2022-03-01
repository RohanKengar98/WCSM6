package dynamicWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicitlyWait

		driver.findElement(By.name("rohan1234578b")).sendKeys("admin");//NoSuchElementException
	}
}