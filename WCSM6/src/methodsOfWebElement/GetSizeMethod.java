package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod{
	// Getting The Size Of Google SearchBox
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		Dimension size = searchBox.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println(height);//34
		System.out.println(width);//487
	}
}