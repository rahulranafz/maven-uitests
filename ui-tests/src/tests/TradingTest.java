package tests;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import baseclasses.BasePage;
import baseclasses.Driver;
import pages.HomePage;

public class TradingTest extends BasePage {
	
	private WebDriver driver = null;
	Driver driverObj = new Driver();
	HomePage homepage = new HomePage();
	SoftAssert softassert = new SoftAssert();
	
}
