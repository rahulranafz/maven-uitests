package pages.orocrypt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

	private By firstNameFieldLocator = By.id("id_first_name"); 
	private By lastNameFieldLocator = By.id("id_last_name"); 
	private By emailFieldLocator = By.id("id_email"); 
	private By passwordFieldLocator = By.id("id_password1");
	private By confirmPasswordFieldLocator = By.id("id_password2"); 
	private By checkUserAgreementCbLocator = By.id("terms_check"); 
	private By createAccountBtnLocator = By.id("register-btn");
	private By passwordSaveOkBtnLocator = By.className("password-saved__ok btn-orange"); 
	
	public void enterFirstName(WebDriver driver, String FirstName) {
		driver.findElement(firstNameFieldLocator).sendKeys(FirstName);
	}

	public void enterLastName(WebDriver driver, String LastName) {
		driver.findElement(lastNameFieldLocator).sendKeys(LastName);
	}

	public void enterEmail(WebDriver driver, String Email) {
		driver.findElement(emailFieldLocator).sendKeys(Email);
	}

	public void enterPassword(WebDriver driver, String Password) {
		driver.findElement(passwordFieldLocator).sendKeys(Password);
	}

	public void enterRepeatPassword(WebDriver driver, String ConfirmPassword) {
		driver.findElement(confirmPasswordFieldLocator).sendKeys(ConfirmPassword);
	}

	public void checkUserAgreement(WebDriver driver) {
		driver.findElement(checkUserAgreementCbLocator).click();
	}

	public void clickOnCreateAccount(WebDriver driver) {
		driver.findElement(createAccountBtnLocator).click();
	}
	
	public void clickOnPasswordSavedOkBtn(WebDriver driver) {
		driver.findElement(passwordSaveOkBtnLocator).click();
	}

}
