package testNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest {
	//we dont have to create object of BaseTest
	//it'll automatically done by @beforeMethod annotation 
  @Test
  public void validLogin() {
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		driver.findElement(By.id("loginButton")).click();
  }
}
