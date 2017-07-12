package steps;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import pages.SignUpPage;

public class SignUpSteps {
	
	SignUpPage signuppage = new SignUpPage();
  
	public void fillSignupDetails(WebDriver driver, SoftAssert softassert, String username, String password, String confirmpassword ) {
		signuppage.enterUserName(driver, username);
		signuppage.enterPassword(driver, password);
		signuppage.enterConfirmPassword(driver, confirmpassword);
		signuppage.checkUserAgreement(driver);
		signuppage.clickOnSignUpBtn(driver);
	}
}
