package xpathLocator;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependentIndependentMethod {
	//SAMSUNG Galaxy F22 (Denim Blue, 64 GB)

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws InterruptedException {
			Scanner sc= new Scanner(System.in);
			System.out.println("Please type the complete phone name");
			String phoneName = sc.nextLine();
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("samsung");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			String priceOfPhone = driver.findElement(By.xpath("//div[.='"+phoneName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(priceOfPhone);
			

	}


}
