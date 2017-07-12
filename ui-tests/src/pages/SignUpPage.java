package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import baseclasses.BasePage;
import baseclasses.Driver;
import pages.LoginPage;


public class SignUpPage extends BasePage{

	private By usernameFldLocator = By.xpath("//input[@placeholder='example@ambisafe.co']");
	private By passwordFldLocator = By.xpath("//input[@placeholder='Type your password']");
	private By confirmPasswordFldlocator = By.xpath("//input[@placeholder='Confirm your password']");
	private By userAgreementFldLocator = By.xpath("//input[@type='checkbox']");
	private By signUpBtnLocator = By.className("SignUpForm__signUpButton");
	private By emailSentPopupGotItBtnLocator = By.xpath("//button[contains(text(),'Got it!')]");
	private By activateLaterBtnLocator = By.xpath("//button[contains(text(),'Activate later')]");	
	HomePage homepage = new HomePage();
	LoginPage loginpage = new LoginPage();
	Driver driverObj= new Driver();
	
	public void enterUserName(WebDriver driver, String username) {
		waitForElementVisibility(driver, usernameFldLocator, 30);
		driver.findElement(usernameFldLocator).sendKeys(username);
	}
	
	public void enterPassword(WebDriver driver, String password) {
		driver.findElement(passwordFldLocator).sendKeys(password);
	}
	
	public void enterConfirmPassword(WebDriver driver, String password) {
		driver.findElement(confirmPasswordFldlocator).sendKeys(password);
	}
	
	public void checkUserAgreement(WebDriver driver) {
		driver.findElement(userAgreementFldLocator).click();
	}
	
	public void clickOnSignUpBtn(WebDriver driver) {
		driver.findElement(signUpBtnLocator).click();
	}
	
	public void clickOnEmailPopUpGotItBtn(WebDriver driver) {
		waitForElementVisibility(driver, emailSentPopupGotItBtnLocator, 30);
		driver.findElement(emailSentPopupGotItBtnLocator).click();
	}
	
	public void clickOnActivateLaterBtn(WebDriver driver) {
		waitForElementVisibility(driver, activateLaterBtnLocator, 30);
		driver.findElement(activateLaterBtnLocator).click();
	}
		
}
