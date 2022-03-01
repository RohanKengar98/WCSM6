package methodsOfWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String handle:allHandles)
		{
			System.out.println(handle);
		}
		
		driver.close();

}

}