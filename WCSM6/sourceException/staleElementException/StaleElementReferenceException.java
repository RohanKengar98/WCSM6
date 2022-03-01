package staleElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {										 //	Q. Why we get StaleElementException?
																					 // when we refresh the browser the address of the 
	@SuppressWarnings("deprecation")												 // webElement gets older and we cannot perform  
	public static void main(String[] args) throws InterruptedException {			 // any action with that old(Stale) element.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // If we try to use that old address then we get
		WebDriver driver=new ChromeDriver();										 // StaleElementReferenceException.
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
