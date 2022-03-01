package takeSreenshotMethod;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot3 {
	//way2 of taking screenshot
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com");


		//how to take the screenshot using downcasting
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot3.png");
		Files.copy(src,dest);
	}

}