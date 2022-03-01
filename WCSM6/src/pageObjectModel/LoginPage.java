package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(xpath="//img[contains(@src, 'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInLabel") private WebElement keepMeLoggedInCheckbox;
	@FindBy(id="loginButton") private WebElement loginbtn;
	
	
	//initialization

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
		
    //Utilization
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepMeLoggedIn() {
		return keepMeLoggedInCheckbox;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
/*	//Operational Methods
	public void sendUsername()
	{
		usn.sendKeys("admin");
	}
	
	public void sendPassword()
	{
		psw.sendKeys("manager");
	}
	
	public void clickOnLohinButton()
	{
		loginbtn.click();
	}
	
	public void delayOfTwoSeconds() throws InterruptedException
	{
		Thread.sleep(2000);
	} */
	
	//Generic Reusable Methods
	public void validLogin(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginbtn.click();
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		Thread.sleep(1500);
		psw.sendKeys(invalidPassword);
		Thread.sleep(1500);
		loginbtn.click();
		Thread.sleep(1500);
		usn.clear();
	}
	
	
	
}
