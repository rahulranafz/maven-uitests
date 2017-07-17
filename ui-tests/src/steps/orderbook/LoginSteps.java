package steps.orderbook;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import pages.orderbook.LoginPage;

public class LoginSteps extends LoginPage{

	public void fillLoginDetails(WebDriver driver,SoftAssert softAssert,String username,String password) {
		enterUserName(driver, username);
		enterPassword(driver,password);
		clickOnLoginBtn(driver);
			
	}

}
