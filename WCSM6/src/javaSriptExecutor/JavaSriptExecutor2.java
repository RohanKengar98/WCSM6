package javaSriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSriptExecutor2 {

		public static void main(String[] args) {
			//to handle the disabled element we need to use the JavaScriptExecutor(I)
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("file:///D:/Qspiders/AUTOMATION%20NOTES/HTML%20Files/diabledTextBox.html");
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement username = driver.findElement(By.id("i2"));
			

}
}
