package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfTheBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension targetSize = new Dimension(300, 700);
		driver.manage().window().setSize(targetSize);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
}
	
}