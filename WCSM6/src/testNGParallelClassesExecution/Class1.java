package testNGParallelClassesExecution;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Class1 {
 WebDriver driver;
 @Test
 public void test1() {
	 driver.switchTo().activeElement().sendKeys("Mumbai Indians",Keys.ENTER);
 }
  @BeforeMethod
  public void openBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		Thread.sleep(1500);
		driver.get("https://www.google.co.in/");
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
