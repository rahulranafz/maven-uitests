package tests.orocrypt;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Driver;
import pages.orocrypt.LoginPage;
import steps.orocrypt.LoginSteps;
import utilities.MailReader;

public class LoginTest extends LoginPage{
	
	private WebDriver driver = null;
	Driver driverObj = new Driver();
	MailReader mailReader = new MailReader();
	LoginSteps loginSteps = new LoginSteps();
	String host = "imap.gmail.com";
	String userName = "qa.gauravsingh01@gmail.com";
	String password = "ronnit1029";

	@Test(priority = 0)
	public void readingMailsForConfirmationLink() throws IOException {
		String activationCodeMailSub = "Authentication verification";
		driver = driverObj.createDriver();
		driver.get(driverObj.getOrocryptUrl()); 
		loginSteps.fillLoginDetails(driver, driverObj.getUserName(), driverObj.getPassword());
		String activationCode = mailReader.FetchMails(host, userName, password, activationCodeMailSub);
		enterAuthorizationCode(driver, activationCode);
		clickOnAuthorizationLoginBtn(driver);
		
	}
}
