package pages.orocrypt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage{
	private By emailFieldLocator = By.id("id_username"); ////input[@id='id_username']
	private By passwordFieldLocator = By.id("id_password"); ////input[@id='id_password']
	private By logInBtnLocator = By.xpath("//button[text()='Login']"); ////button[text()='Login']
	private By signUpBtnLocator = By.xpath("//a[text()='Sign up']"); ////a[text()='Sign up']
	private By authorizationCodeFieldLocator = By.id("login_2fa_code"); ////input[@id='login_2fa_code']
	private By authorizationLoginBtnLocator = By.xpath("//button[contains(text(),'Login')]"); ////button[contains(text(),'Login')]
	
	public void enterEmailField(WebDriver driver, String Email) {
		waitForElementVisibility(driver, emailFieldLocator, 30);
		driver.findElement(emailFieldLocator).sendKeys(Email);
	}
	
	public void enterPasswordField(WebDriver driver, String Password) {
		driver.findElement(passwordFieldLocator).sendKeys(Password);
	}
	
	public void clickOnLoginBtn(WebDriver driver) {
		driver.findElement(logInBtnLocator).click();
	}
	
	public void clickOnSignupBtn(WebDriver driver) {
		driver.findElement(signUpBtnLocator).click();
	}
	
	public void enterAuthorizationCode(WebDriver driver, String activationCode) {
		waitForElementVisibility(driver, authorizationCodeFieldLocator, 30);
		driver.findElement(authorizationCodeFieldLocator).sendKeys(activationCode);
	}
	
	public void clickOnAuthorizationLoginBtn(WebDriver driver) {
		driver.findElement(authorizationLoginBtnLocator).click();
	}
}
