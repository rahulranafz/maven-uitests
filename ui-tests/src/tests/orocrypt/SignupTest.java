package tests.orocrypt;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driver;
import pages.orocrypt.LoginPage;
import pages.orocrypt.SignupPage;
import steps.orocrypt.LoginSteps;
import steps.orocrypt.SignupSteps;
import utilities.MailReader;
import utilities.SearchUrl;
import utilities.UtilityMethods;

public class SignupTest extends SignupPage{
	private WebDriver driver = null;
	Driver driverObj = new Driver();
	LoginPage loginPage = new LoginPage();
	SoftAssert softAssert = new SoftAssert();
	MailReader mailReader = new MailReader();
	SearchUrl searchUrl = new SearchUrl();
	LoginSteps loginSteps = new LoginSteps();
	SignupSteps signUpSteps = new SignupSteps();
	String signupUsername;
	String firstName = "Gaurav";
	String lastName = "Singh";
	String host = "imap.gmail.com";
	String userName = "qa.gauravsingh01@gmail.com";
	String password = "ronnit1029";
	
	/**
	 * <h1>Creating Account on Orocrypt</h1>
	 * <p>
	 * This test case verify that user is able to Sign Up with valid credentials
	 * 
	 * @throws IOException
	 */

	@Test(priority = 0)
	public void CreateAccount() throws IOException {
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrocryptUrl());
		loginPage.clickOnSignupBtn(driver);
		signupUsername = "gaurav+test" + UtilityMethods.getRandomInteger() + "@gmail.com";
		System.out.println(signupUsername);	
		signUpSteps.fillSignupDetails(driver, signupUsername, password, firstName, lastName);
		driver.close();
	}
	
	@Test(priority = 1)
	public void readingMailsForConfirmationLink() throws IOException {
		String activationUrlMailSub = "Please verify your email address";
		String activationCodeMailSub = "Authentication verification";
		String activationUrl = mailReader.FetchMails(host, userName, password, activationUrlMailSub);
		driver = driverObj.createDriver();
		driver.get(activationUrl); 
		driver.close();
		driver.get(activationUrl);
		loginSteps.fillLoginDetails(driver, driverObj.getUserName(), driverObj.getPassword());
		String activationCode = mailReader.FetchMails(host, userName, password, activationCodeMailSub);
		loginPage.enterAuthorizationCode(driver, activationCode);
		loginPage.clickOnAuthorizationLoginBtn(driver);
		
	}
}
