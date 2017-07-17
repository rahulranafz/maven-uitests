package steps.orocrypt;

import org.openqa.selenium.WebDriver;

import pages.orocrypt.SignupPage;

public class SignupSteps extends SignupPage{

	public void fillSignupDetails(WebDriver driver, String userName, String password, String firstName, String lastName) {
		enterFirstName(driver, firstName);
		enterLastName(driver, lastName);
		enterEmail(driver, userName);
		enterPassword(driver, password);
		enterRepeatPassword(driver, password);
		checkUserAgreement(driver);
		clickOnCreateAccount(driver);
		clickOnPasswordSavedOkBtn(driver);
	}
}
