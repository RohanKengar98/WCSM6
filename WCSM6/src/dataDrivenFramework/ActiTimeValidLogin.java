package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=8bh4p3g4swi2");
		
		Flib2 flib = new Flib2();
		String username = flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 0);
		String password = flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		Object gt = driver.getTitle();
		System.out.println(gt);
		Thread.sleep(2000);
		driver.close();


	}

}
