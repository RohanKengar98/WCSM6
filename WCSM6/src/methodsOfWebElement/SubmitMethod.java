package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("rohan");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("rohan12345");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		loginBtn.submit();
	}

}