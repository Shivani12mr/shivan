package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginWebPage {
	WebDriver driver;

	public TrelloLoginWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user']")
	private WebElement emailIdTextFeild;

	public WebElement getEmailIdTextFeild() {
		return emailIdTextFeild;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

}
