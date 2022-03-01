package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("car");
		Thread.sleep(3500);
		List<WebElement> suggessionOfCar = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		Thread.sleep(3500);
		
		// using for loop
		for(int i=0;i<suggessionOfCar.size();i++)
		{
			WebElement option = suggessionOfCar.get(i);
			String textToPrint = option.getText();
			System.out.println(textToPrint);//printing searched suggessions
			Thread.sleep(2000);
		}
		
	}

}