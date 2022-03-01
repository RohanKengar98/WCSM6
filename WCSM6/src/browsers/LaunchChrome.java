package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Open Chrome Browser
		Thread.sleep(3000);
		driver.manage().window().maximize();//Maximize Window
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev/");//Opening Website
		Thread.sleep(3000);
		driver.close();
	}

}
