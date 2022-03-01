package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTitleMatch {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		String actualloginPageTitle = driver.getTitle();
		Thread.sleep(2000);
		
		if(actualloginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("THE LOGIN PAGE TITLE IS VERIFIED !  TEST CASE IS PASSED");
		}
		
		else
		{
			System.out.println("THE LOGIN PAGE TITLE IS not VERIFIED !  TEST CASE IS FAILED");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1500);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		String actualHomePageTitle = driver.getTitle();
		
		
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("THE HOME PAGE TITLE IS VERIFIED ! TEST CASE IS PASSED");
		}
		
		else
		{
			
				System.out.println("THE HOME PAGE TITLE IS NOT  VERIFIED ! TEST CASE IS FAILED ");
			
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}