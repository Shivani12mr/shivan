package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBordsPage {
	WebDriver driver;

	public  TrelloBordsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProfilrButton() {
		return profileButton;
	}
	

	public WebElement getLogoutOption() {
		return logoutOption;
	}
	@FindBy(xpath = "//span[@title='Shivani M R (shivanimr1)']")
	private WebElement profileButton;
	
	@FindBy(xpath = "//button[@data-testid='account-menu-logout']")
	private WebElement logoutOption;
	
	@FindBy(xpath = "//button[@aria-label='Create board or Workspace']")
	private WebElement createOption;
	
	@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
	private WebElement createBordOption;
	
	@FindBy(xpath = "//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")
	private WebElement bordTitleTextFeild;
	
	public WebElement getProfileButton() {
		return profileButton;
	}
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	private WebElement createBordButton;

	public WebElement getCreateOption() {
		return createOption;
	}
	public WebElement getCreateBordOption() {
		return createBordOption;
	}
	public WebElement getBordTitleTextFeild() {
		return bordTitleTextFeild;
	}
	public WebElement getCreateBordButton() {
		return createBordButton;
	}
}
