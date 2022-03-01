package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOfTheBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Point targetPosition = new Point(700, 300);
		driver.manage().window().setPosition(targetPosition);;
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
}
	
}