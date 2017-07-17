package tests.orderbook;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driver;
import pages.orderbook.HomePage;
import pages.orderbook.SignUpPage;
import steps.orderbook.LoginSteps;
import steps.orderbook.SignUpSteps;
import utilities.MailReader;
import utilities.SearchUrl;
import utilities.UtilityMethods;

public class SignUpTest extends SignUpPage {

	private WebDriver driver = null;
	Driver driverObj = new Driver();
	SignUpPage signuppage = new SignUpPage();
	HomePage homePage = new HomePage();
	LoginSteps loginsteps = new LoginSteps();
	SoftAssert softassert = new SoftAssert();
	SignUpSteps signUpSteps = new SignUpSteps();
	MailReader mailreader = new MailReader();
	SearchUrl searchurl = new SearchUrl();
	String signupusername;

	/**
	 * <h1>SignUp for Account</h1>
	 * <p>
	 * This test case verify that user is able to Sign Up with valid credentials
	 * 
	 * @throws IOException
	 */

	@Test(priority = 0)
	public void SignUpApplication() throws IOException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnSignUpLink(driver);
		signupusername = "gaurav+test" + UtilityMethods.getRandomInteger() + "@gmail.com";
		System.out.println(signupusername);
		signUpSteps.fillSignupDetails(driver, softassert, signupusername, driverObj.getPassword(),
				driverObj.getPassword());
		signuppage.clickOnActivateLaterBtn(driver);
		homePage.verifySignUP(driver);
		softassert.assertAll();

	}

	/**
	 * <h1>Close Browser</h1>
	 * <p>
	 * This method close the browser after the execution of all tests
	 * </p>
	 */

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}

}
