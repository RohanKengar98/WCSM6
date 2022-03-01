package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod2 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("car");
		Thread.sleep(3500);
		List<WebElement> suggessionOfBike = driver.findElements(By.xpath("//div[@class='rohan']/span"));
		Thread.sleep(3500);
		
		// using for each loop
		for(WebElement option: suggessionOfBike)
		{
			String textToPrint = option.getText();
			Thread.sleep(2000);
			System.out.println(textToPrint); //It gives empty list because the specified webelements are not found 
		}
		
	}

}