package pages.orderbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LoginPage extends BasePage {
	
	private By usernameFldLocator=By.xpath("//div[@class='Popup']//input[@type='email']");
	private By passwordFldLocator=By.xpath("//input[@type='password']");
	private By loginBtnFldLocator=By.className("LogInForm__loginButton");
	
	public void enterUserName(WebDriver driver, String username) {
		waitForElementVisibility(driver, usernameFldLocator, 30);
		driver.findElement(usernameFldLocator).sendKeys(username);
	}
	
	public void enterPassword(WebDriver driver, String password) {
		driver.findElement(passwordFldLocator).sendKeys(password);
	}
	
	public void clickOnLoginBtn(WebDriver driver) {
		driver.findElement(loginBtnFldLocator).click();
	}
	
}
