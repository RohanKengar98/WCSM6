package actionsClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///D:/Qspiders/AUTOMATION%20NOTES/HTML%20Files/dragdrop.html");
		
	
		WebElement source = driver.findElement(By.id("draggable-2"));//Draging the element from source Using SOURCE VARIABLE
		WebElement target = driver.findElement(By.id("droppable-2"));//Droping the element to target Using TARGET VARIABLE
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		
		
	
	}
}