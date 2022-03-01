package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Qspiders/AUTOMATION%20NOTES/HTML%20Files/checkbox2.html");
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.id("vehicle2"));
		Thread.sleep(2000);
		String value = checkbox.getAttribute("type");//checkbox
		System.out.println(value);
	}

}
