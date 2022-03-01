package methodsOfWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod{
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.id("input"));
	
		Rectangle rect = searchBox.getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		Thread.sleep(2000);	
		System.out.println(width+ " pxl is the width of webelemnt");
		System.out.println(height+" pxl is the height of webelement");
	

	}
	
	

}