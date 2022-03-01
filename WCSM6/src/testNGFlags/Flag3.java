package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {

	@Test(invocationCount = 49)
	public void login(){
		Reporter.log("Generates the inconsistant bug",true);
	}
}

