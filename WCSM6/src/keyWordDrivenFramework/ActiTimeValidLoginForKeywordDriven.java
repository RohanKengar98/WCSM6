package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLoginForKeywordDriven extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		String username = flib.readPropertyData("./data/Config.properties","un");
		String password = flib.readPropertyData("./data/Config.properties","pass");
		bt.openBrowser();
	
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.id("loginButton")).click();
	}
}
