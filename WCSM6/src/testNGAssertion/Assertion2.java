package testNGAssertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 {

	@Test
	public void OrrangeHRM() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String loginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginPageTitle, "OrangeHRM");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Assert.assertEquals(loginPageTitle, true);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();


		
		
		
	}
}
