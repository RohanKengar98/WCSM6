package handlingDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMultipleOptions {
//multiSelect
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///D:/Qspiders/AUTOMATION/HTML%20Files/multiselectdropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		//multiple option selection
		for(int i=0;i<=5;i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		sel.deselectAll();
		
		
	}

}