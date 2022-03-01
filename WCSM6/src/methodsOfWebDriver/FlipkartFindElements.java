package methodsOfWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartFindElements{


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung");
		Thread.sleep(3000);

		List<WebElement> suggessions = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		Thread.sleep(3000);

		for(WebElement option: suggessions)
		{
			String textToPrint=option.getText();
			Thread.sleep(2000);
			System.out.println(textToPrint);
		}

	}
}