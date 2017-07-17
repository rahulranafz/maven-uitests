package tests.orderbook;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driver;
import pages.orderbook.BalancesPage;
import pages.orderbook.HomePage;
import pages.orderbook.TradingPage;
import steps.orderbook.LoginSteps;


public class TradingTest extends TradingPage {
	private WebDriver driver = null;
	Driver driverObj = new Driver();
	SoftAssert softassert = new SoftAssert();
	HomePage homePage = new HomePage();
	TradingPage tradepage = new TradingPage();
	LoginSteps loginsteps = new LoginSteps();
	BalancesPage balancePage = new BalancesPage();
	
	
	String baseCurrency;
	String counterCurrency;
	String orderPrice;
	String orderAmount;
	String orderTotal;
	String askSellPrice;
	String askSellAmount;
	String bidBuyPrice;
	String bidBuyAmount;
	double bc, cc, op, oa, ot, asp, asa, bbp, bba;

	@Test(priority = 0)
	public void buyingWhenOrderPriceLess() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
		
	}
	
	@Test(priority = 1)
	public void buyingWhenOrderPriceEquals() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
	}
	
	@Test(priority = 2)
	public void buyingWhenOrderPriceGreater() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
	}
	
	@Test(priority = 3)
	public void sellingWhenBidPriceLess() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
	}
	
	@Test(priority = 3)
	public void sellingWhenBidPriceEquals() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
	}
	
	@Test(priority = 3)
	public void sellingWhenBidPriceGreater() throws IOException, InterruptedException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrderbookUrl());
		homePage.clickOnLoginLink(driver);
		loginsteps.fillLoginDetails(driver, softassert, driverObj.getUserName(), driverObj.getPassword());
		homePage.clickOnTradeLnk(driver);
		tradepage.clickOnGnoToEthBtn(driver);
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
