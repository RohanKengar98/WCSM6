package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		/*lp.sendUsername();
		lp.delayOfTwoSeconds();
		lp.sendPassword();
		lp.delayOfTwoSeconds();
		lp.clickOnLohinButton();
		lp.delayOfTwoSeconds();
		 */
		
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		lp.validLogin(validUsername, validPassword);
		bt.closeBrowser();
	}

}
