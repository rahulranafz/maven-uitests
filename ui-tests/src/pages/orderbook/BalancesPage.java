package pages.orderbook;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class BalancesPage extends BasePage {

	/*private By taasLnkLocator = By.xpath("//div[contains(text(),'TAAS')]");
	private By taasBalanceLeftLocator = By.xpath("//div[@class='Balances__content']/div[6]/div[1]/div[2]/div/div[1]");
	private By taasBalanceRightLocator = By.xpath("//div[@class='Balances__content']/div[6]/div[1]/div[2]/div/div[2]");
	private By gnoLnkLocator = By.xpath("//div[contains(text(),'GNO')]");
	private By gnoBalanceLeftLocator = By.xpath("//div[@class='Balances__content']/div[3]/div[1]/div[2]/div/div[1]");
	private By gnoBalanceRightLocator = By.xpath("//div[@class='Balances__content']/div[3]/div[1]/div[2]/div/div[2]");
	private By antLnkLocator = By.xpath("//div[contains(text(),'ANT')]");
	private By antBalanceLeftLocator = By.xpath("//div[@class='Balances__content']/div[4]/div[1]/div[2]/div/div[1]");
	private By antBalanceRightLocator = By.xpath("//div[@class='Balances__content']/div[4]/div[1]/div[2]/div/div[2]");
	private By firstBloodLnkLocator = By.xpath("//div[contains(text(),'1ST')]");
	private By firstBloodBalanceLeftLocator = By
			.xpath("//div[@class='Balances__content']/div[5]/div[1]/div[2]/div/div[1]");
	private By firstBloodBalanceRightLocator = By
			.xpath("//div[@class='Balances__content']/div[5]/div[1]/div[2]/div/div[2]");
	private By ethLnkLocator = By.xpath("//div[contains(text(),'ETH')]");
	private By ethBalanceLeftLocator = By.xpath("//div[@class='Balances__content']/div[6]/div[1]/div[2]/div/div[1]");
	private By ethBalanceRightLocator = By.xpath("//div[@class='Balances__content']/div[6]/div[1]/div[2]/div/div[2]");*/


	public ArrayList getBalances(WebDriver driver) {

		ArrayList<String> balanceList = new ArrayList<String>();
		for (int i = 2; i <= 8; i++) {
			String balances = driver
					.findElement(By.xpath("//div[@class='Balances__content']/div[" + i + "]/div[1]/div[2]/div/div[1]"))
					.getText()
					+ driver.findElement(
							By.xpath("//div[@class='Balances__content']/div[" + i + "]/div[1]/div[2]/div/div[2]"))
							.getText();
			balanceList.add(balances);
		}
		System.out.println(balanceList);
		return balanceList;
	}
}
