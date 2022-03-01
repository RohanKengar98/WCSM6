package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTmeInvalidLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=8bh4p3g4swi2");
		
		
		
		Flib2 flib2 = new Flib2();
		int rc = flib2.getRowCount("./data/TestData.xlsx", "invalidcreds");
		
		for(int i=1; i<rc; i++)
		{
			String username = flib2.readExcelData("./data/TestData.xlsx", "invalidcreds", i, 1);
		driver.findElement(By.name("username")).sendKeys(username);
		String password = flib2.readExcelData("./data/TestData.xlsx", "invalidcreds", i, 1);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear();
		
		int l=i;
		if(l==i)
		{
		WebElement errorMsg = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
		String msg = errorMsg.getText();
		System.out.println(msg+"0"+l);
		Thread.sleep(500);
		
		}
		
	  }
		

	}

}
