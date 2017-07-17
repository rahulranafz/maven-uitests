package steps.orocrypt;

import org.openqa.selenium.WebDriver;

import pages.orocrypt.LoginPage;

public class LoginSteps extends LoginPage{
	
	public void fillLoginDetails(WebDriver driver, String userName, String password) {
		enterEmailField(driver, userName);
		enterPasswordField(driver, password);
		clickOnLoginBtn(driver);
	}
}
