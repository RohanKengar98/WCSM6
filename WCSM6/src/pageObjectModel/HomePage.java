package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(xpath = "Create new tasks") private WebElement createNewTasks;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTime;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;




	//Initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	//Utilization
	public WebElement getCreateNewTasks() {
		return createNewTasks;
	}

	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	//Generic Reusable Method
	public void logout() {
		logoutLink.click();
	}




}