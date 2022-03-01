package takeScreenshotDynamically2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
@Listeners(CustomListener.class)
public class FlipkartScreenShot extends BaseTest {
 
  @BeforeMethod
  public void setUp() {
	  initialization();
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
  @Test
  public void flipKart() {
	  String actualPageTitle = driver.getTitle();
	 SoftAssert softassert = new SoftAssert();
	 softassert.assertEquals(actualPageTitle, "Instagram123");
	 softassert.assertAll();
  }
  
  /*@Test
  public void flipKart2() {
	  String actualPageTitle = driver.getTitle();
	 SoftAssert softassert = new SoftAssert();
	 softassert.assertEquals(actualPageTitle, "Instagram123");
	 softassert.assertAll();
  }
  
  @Test
  public void flipKart3() {
	  String actualPageTitle = driver.getTitle();
	 SoftAssert softassert = new SoftAssert();
	 softassert.assertEquals(actualPageTitle, "Instagram123");
	 softassert.assertAll();
  }*/

}
