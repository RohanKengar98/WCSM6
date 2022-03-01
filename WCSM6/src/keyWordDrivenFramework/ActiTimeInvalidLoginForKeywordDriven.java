package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLoginForKeywordDriven extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestData.xlsx", "invalidcreds");
		
		for(int i=1; i<rc; i++) {
			  String username = flib.readExcelData("./data/TestData.xlsx", "invalidcreds", i,0);
			driver.findElement(By.name("username")).sendKeys(username);
			
			 String password = flib.readExcelData("./data/TestData.xlsx", "invalidcreds", i,1);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(1500);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1500);
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
