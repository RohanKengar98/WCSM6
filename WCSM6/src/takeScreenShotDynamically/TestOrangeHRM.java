package takeScreenShotDynamically;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestOrangeHRM extends BaseTest {
 
  @BeforeMethod
  public void setUp() {
	  initialization();
  }

  @AfterMethod
  public void tearDown() {
	 driver.quit();
  }
  
  @Test
  public void TestOrangeHRM1() {
	  String actualHomePageTitle = driver.getTitle();
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(actualHomePageTitle, "OrangeHRM123");
	  softassert.assertAll();
  }

}
