package testNGFlags;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 
	////TC1
    {
	@Test(groups = "Functional")
	public void ft1() {
		Reporter.log("Functional Test Case 1", true);
	}

	@Test(groups = "Smoke")
	public void st1() {
		Reporter.log("Smoke Test Case 1", true);
	}

	@Test
	public void it1() {
		Reporter.log("Integration Test Case 1", true);
	}

	////TC2
	@Test(groups = "Functional")
	public void ft2() {
		Reporter.log("Functional Test Case 2", true);
	}

	@Test(groups = "Smoke")
	public void st2() {
		Reporter.log("Smoke Test Case 2", true);
	}

	@Test(groups = "Integration")
	public void it2() {
		Reporter.log("Integration Test Case 2", true);
	}

	////TC3
	@Test(groups = "Functional")
	public void ft3() {
		Reporter.log("Functional Test Case 3", true);
	}

	@Test(groups = "Smoke")
	public void st3() {
		Reporter.log("Smoke Test Case 3", true);
	}

	@Test(groups = "Integration")
	public void it3() {
		Reporter.log("Integration Test Case 3", true);
	}

	////TC4
	@Test(groups = "Functional")
	public void ft4() {
		Reporter.log("Functional Test Case 4", true);
	}

	@Test(groups = "Smoke")
	public void st4() {
		Reporter.log("Smoke Test Case 4", true);
	}

	@Test(groups = "Integration")
	public void it4() {
		Reporter.log("Integration Test Case 4", true);
	}

	////TC5
	@Test(groups = "Functional")
	public void ft5() {
		Reporter.log("Functional Test Case 5", true);
	}

	@Test(groups = "Smoke")
	public void st5() {
		Reporter.log("Smoke Test Case 5", true);
	}

	@Test(groups = "Integration")
	public void it5() {
		Reporter.log("Integration Test Case 5", true);
	}

	////TC6
	@Test(groups = "Functional")
	public void ft6() {
		Reporter.log("Functional Test Case 6", true);
	}

	@Test(groups = "Smoke")
	public void st6() {
		Reporter.log("Smoke Test Case 6", true);
	}

	@Test(groups = "Integration")
	public void it6() {
		Reporter.log("Integration Test Case 6", true);
	}

}
