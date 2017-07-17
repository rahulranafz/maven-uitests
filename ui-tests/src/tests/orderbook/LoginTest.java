package tests.orderbook;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import base.Driver;
import pages.orderbook.HomePage;
import pages.orderbook.LoginPage;
import steps.orderbook.LoginSteps;

public class LoginTest extends LoginPage {

	private WebDriver driver = null;
	Driver driverObj = new Driver();
	LoginSteps loginStep = new LoginSteps();
	SoftAssert softassert = new SoftAssert();
	HomePage homePage = new HomePage();

	/**
	 * <h1>Login with the valid credentials</h1>
	 * <p>
	 * This test case verify that user is able to login with valid credentials
	 */
	@Test(priority = 0)
	public void LoginApplication() throws IOException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginStep.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.verifylogin(driver, softassert);
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
