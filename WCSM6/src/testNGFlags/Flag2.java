package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {

	@Test(description="this test case is used to perfom login operation")
	public void login(){
		Reporter.log("Login is Successful",true);
	}
}
