package testNGFramework;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
 WebDriver driver;
  @BeforeMethod
  public void openBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		Thread.sleep(1500);
		driver.get("http://127.0.0.1/login.do");
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
