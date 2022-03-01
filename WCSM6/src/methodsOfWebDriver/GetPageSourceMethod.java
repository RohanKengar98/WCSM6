package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Qspiders/AUTOMATION%20NOTES/HTML%20Files/Confirmation.html");
		String webPageSourceCode = driver.getPageSource();
		System.out.println(webPageSourceCode);

	}

}