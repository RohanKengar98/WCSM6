package staleElementReferenceEcxeption;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		driver.navigate().refresh();
		Thread.sleep(3000);
		//username.clear();//StaleElementReferenceException  
		driver.findElement(By.name("username")).clear();//Handling Exception Temporary
	}

}
