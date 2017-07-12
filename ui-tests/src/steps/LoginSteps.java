package steps;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	public void fillLoginDetails(WebDriver driver, SoftAssert softAssert, String username, String password) {
		loginPage.enterUserName(driver, username);
		loginPage.enterPassword(driver, password);
		loginPage.clickOnLoginBtn(driver);
	}

}
