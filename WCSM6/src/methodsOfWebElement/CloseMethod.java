package methodsOfWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	Thread.sleep(3000);
	
	driver.close();

	}

}
