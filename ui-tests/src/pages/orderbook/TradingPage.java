package pages.orderbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class TradingPage extends BasePage{
	
	private By taasEthBtnLocator = By.xpath("//div[@class='MarketSelector__tabs']/div[1]/button");
	private By gnoEthBtnLocator = By.xpath("//div[@class='MarketSelector__tabs']/div[2]/button");
	private By antEthBtnLocator  = By.xpath("//div[@class='MarketSelector__tabs']/div[3]/button");
	private By firstBloodEthBtnLocator = By.xpath("//div[@class='MarketSelector__tabs']/div[4]/button");
	private By minDateFldLocator = By.name("min");
	private By maxDateFldLocator = By.name("max");
	private By aboutTokenBtnLocator = By.xpath("//button[contains(text(),'About Token')]");
	private By icoRatingReportLnkLocator = By.xpath("//div[@class='TokenAbout__button-row']/a[2]");
	private By buyBtnLocator = By.xpath("//button[contains(text(),'BUY')]");
	private By sellBtnLocator = By.xpath("//button[contains(text(),'SELL')]");
	private By submitBtnLocator = By.className("buyButton");
	private By bidBuyAmountLocator = By.xpath("//div[@class='Orderbook__body']/div[1]/div/div/div[1]/div/div[@class='amount']");
	private By bidBuyPriceLocator = By.xpath("//div[@class='Orderbook__body']/div[1]/div/div/div[1]/div/div[@class='price']");
	private By askSellingPriceLocator = By.xpath("//div[@class='Orderbook__body']/div[2]/div/div/div[1]/div/div[@class='price']");
	private By askSellingAmountLocator = By.xpath("//div[@class='Orderbook__body']/div[2]/div/div/div[1]/div/div[@class='amount']");
	
	public void clickOnTaasToEthBtn(WebDriver driver) {
		waitForElementVisibility(driver, taasEthBtnLocator, 30);
		driver.findElement(taasEthBtnLocator).click();
	}
	
	public void clickOnGnoToEthBtn(WebDriver driver) {
		waitForElementVisibility(driver, gnoEthBtnLocator, 30);
		driver.findElement(gnoEthBtnLocator).click();
	}
	
	public void clickOnAntToEthBtn(WebDriver driver) {
		waitForElementVisibility(driver, antEthBtnLocator, 30);
		driver.findElement(antEthBtnLocator).click();
	}
	
	public void clickOnFirstBloodToEthBtn(WebDriver driver) {
		waitForElementVisibility(driver, firstBloodEthBtnLocator, 30);
		driver.findElement(firstBloodEthBtnLocator).click();
	}
	
	public void selectFromDate(WebDriver driver) {
		driver.findElement(minDateFldLocator).click();
		driver.findElement(minDateFldLocator).sendKeys("2017-06-26");
	}
	
	public void selectToaDate(WebDriver driver) {
		driver.findElement(maxDateFldLocator).click();
		driver.findElement(maxDateFldLocator).sendKeys("2017-07-06");
	}
	
	public void clickOnAboutTokenBtn(WebDriver driver) {
		driver.findElement(aboutTokenBtnLocator).click();
	}

	public void clickOnIcoRatingReportLnk(WebDriver driver) {
		driver.findElement(icoRatingReportLnkLocator).click();
	}
	
	public void clickOnBuyBtn(WebDriver driver) {
		driver.findElement(buyBtnLocator).click();
	}
	
	public void clickOnSellBtn(WebDriver driver) {
		driver.findElement(sellBtnLocator).click();
	}
	
	public void clickOnSubmitBtn(WebDriver driver) {
		driver.findElement(submitBtnLocator).click();
	}
	
	public String getBidBuyAmount(WebDriver driver) {
		return driver.findElement(bidBuyAmountLocator).getText();
	}
	
	public String getBidBuyPrice(WebDriver driver) {
		return driver.findElement(bidBuyPriceLocator).getText();
	}
	
	public String getAskSellAmount(WebDriver driver) {
		return driver.findElement(askSellingAmountLocator).getText();
	}
	
	public String getAskSellPrice(WebDriver driver) {
		return driver.findElement(askSellingPriceLocator).getText();
	}
	
}
