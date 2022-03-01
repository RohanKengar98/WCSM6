package javaSriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillPerticulorElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll till a perticular webElement
		
		WebElement feedback = driver.findElement(By.xpath("//img[@src='images/feedback_new.gif']"));
		Point loc = feedback.getLocation();
		int xaxis = loc.getX();
		int yaxis=loc.getY();
		
		System.out.println(xaxis);
		System.out.println(yaxis);
		jse.executeScript("window.scrollBy("+(xaxis)+","+(yaxis)+")");
	}

}