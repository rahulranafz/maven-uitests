package tests.orderbook;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driver;
import pages.orderbook.BalancesPage;
import pages.orderbook.HomePage;
import steps.orderbook.LoginSteps;

public class BalancesTest extends BalancesPage {
	private WebDriver driver = null;
	Driver driverObj = new Driver();
	LoginSteps loginStep = new LoginSteps();
	SoftAssert softassert = new SoftAssert();
	HomePage homePage = new HomePage();
	ArrayList<String> balanceList = new ArrayList<String> ();
	/**
	 * <h1>Login with the valid credentials</h1>
	 * <p>
	 * This test case verify that user is able to login with valid credentials
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 0)
	public void CheckAllBalances() throws IOException, InterruptedException {
		
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());

		homePage.clickOnLoginLink(driver);
		loginStep.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		Thread.sleep(5000);
		homePage.clickOnBalancesLnk(driver);
		balanceList = getBalances(driver);
		System.out.println(balanceList);
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
