package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUserCreation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(2500);
		
		//filling the data of new user
		driver.findElement(By.name("username")).sendKeys("rohan");
		driver.findElement(By.name("passwordText")).sendKeys("rohan@1234");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("rohan@1234");
		driver.findElement(By.name("firstName")).sendKeys("rohan");
		driver.findElement(By.name("lastName")).sendKeys("kengar");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
		
		
		
	
		


	}
}