package automationqsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import keyWordDrivenFramework.Flib;

public class PracticeYouTube extends BaseTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		 BaseTest2 bt = new BaseTest2();
		
		Flib flib = new Flib();
		
		String serach = flib.readPropertyData("./data/configPractice.properties", "srch");
		bt.openBrowser();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(serach, Keys.ENTER);		
		
	}

}
