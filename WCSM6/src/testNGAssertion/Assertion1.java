package testNGAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void TestScript1() 
  {
	  Reporter.log("open the browser",true);
	  Reporter.log("launch the web app",true);
	  
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(false, true);
	//  SoftAssert softassert = new SoftAssert();
	//  softassert.assertEquals(false, true);
	  Reporter.log("verify the login page title",true);
	  
	  Reporter.log("send username",true);
	  
	  Reporter.log("send password",true);
	  Reporter.log("click on login button",true);
	  Reporter.log("verify the home page title",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  softassert.assertAll();
	//  softassert.assertAll();
  }
}
