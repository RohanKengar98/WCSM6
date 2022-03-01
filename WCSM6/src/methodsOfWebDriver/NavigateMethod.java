package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");//it is used to launch the web app
		

		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);//curser switched to searchbox(i.e. active element)
		
		
		//NAVIGATIONAL COMMANDS
		driver.navigate().back();// to come back to previous page
		Thread.sleep(3000);
		driver.navigate().forward();//to go to the next page
		String curul = driver.getCurrentUrl();
		System.out.println(curul);
		Thread.sleep(3000);
		driver.navigate().refresh();//to refresh the current page




	}

}