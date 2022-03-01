package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement usernameTextBox = driver.findElement(By.name("txtUsernamesuraj"));
		//If we try to print the element which is having wrong locator(xpath) we get NoSuchElementException
		
		System.out.println(usernameTextBox);//address of the weblelement
	}

}