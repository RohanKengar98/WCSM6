package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocactionMethod{
	
	//Getting Location of the WebElement
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
	
		Point loc = searchBox.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println("the location of webelement is "+xaxis+ " * "+yaxis);
		
	

	}
	
	

}