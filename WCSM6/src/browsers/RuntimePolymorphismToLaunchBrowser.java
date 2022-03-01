package browsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphismToLaunchBrowser {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Browser Name");
		String browserValue=sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
		}
		
		else if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.close();
		}
		
		else
		{
			System.out.println("Enter either chrome or firefox");
		}
		

	}
}
