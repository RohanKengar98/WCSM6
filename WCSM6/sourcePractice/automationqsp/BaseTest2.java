package automationqsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyWordDrivenFramework.Flib;

public class BaseTest2 {
	static WebDriver driver;

	@SuppressWarnings({ "deprecation" })
	public void openBrowser() throws IOException, InterruptedException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("./data/configPractice.properties", "browser");
		String url = flib.readPropertyData("./data/configPractice.properties", "url");

		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}

		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}


		else
		{
			System.out.println("No bro only enter either chrome or firefox");
		}


	}

	public void closeBrowser()
	{
		driver.quit();
	}

}
