package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import baseclasses.BasePage;

public class HomePage extends BasePage {

	private By loginLnkFldLocator = By.xpath("//a[contains(text(),'Log In')]");
	private By userIconFldLocator = By.xpath("//img[@src='./assets/media/usericon.a9001b35.svg']");
	private By logOutBtnLocator = By.className("Menu__logout-text");
	private By signUpLnkFldLocator = By.xpath("//a[contains(text(),'Sign Up')]");
	private By tradeLnkLocator = By.xpath("//a[contains(text(),'Trade')]");
	//private By balancesLnkLocator = By.xpath(xpathExpression);
	private By emailconfirmationBtnLocator = By.className("EmailConfirmationForm__button");
	private By emailconfirmationCloseBtnLocator = By.className("Popup__close");
	SoftAssert softassert = new SoftAssert();
	
	public void clickOnLoginLink(WebDriver driver) {
		waitForElementVisibility(driver, loginLnkFldLocator, 30);
		driver.findElement(loginLnkFldLocator).click();
	}

	public void verifylogin(WebDriver driver,SoftAssert softAssert){
		waitForElementVisibility(driver, userIconFldLocator, 30);
		softAssert.assertTrue(driver.findElement(userIconFldLocator).isDisplayed());
	}
	
	public void clickOnSignUpLink(WebDriver driver) {
		waitForElementVisibility(driver, signUpLnkFldLocator, 30);
		driver.findElement(signUpLnkFldLocator).click();
	}
	
	public void clickOnEmailCnfGotItBtn(WebDriver driver) {
		waitForElementVisibility(driver, emailconfirmationBtnLocator, 30);
		driver.findElement(emailconfirmationBtnLocator).click();
	}
	
	public void clickOnEmailCnfCloseBtn(WebDriver driver) {
		waitForElementVisibility(driver, emailconfirmationCloseBtnLocator, 30);
		driver.findElement(emailconfirmationCloseBtnLocator).click();
	}
	
	public void verifySignUP(WebDriver driver) {
		waitForElementVisibility(driver, userIconFldLocator, 30);
		driver.findElement(userIconFldLocator).click();
		softassert.assertTrue(driver.findElement(logOutBtnLocator).isDisplayed());
	}
	
	public void  clickOnTradeLnk(WebDriver driver) {
		waitForElementVisibility(driver, tradeLnkLocator, 30);
		driver.findElement(tradeLnkLocator).click();
	}
	
}
