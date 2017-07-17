package steps.orderbook;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import pages.orderbook.SignUpPage;

public class SignUpSteps extends SignUpPage{
	
	public void fillSignupDetails(WebDriver driver, SoftAssert softassert, String username, String password, String confirmpassword ) {
		enterUserName(driver, username);
		enterPassword(driver, password);
		enterConfirmPassword(driver, confirmpassword);
		checkUserAgreement(driver);
		clickOnSignUpBtn(driver);
		clickOnEmailPopUpGotItBtn(driver);
	}
}
