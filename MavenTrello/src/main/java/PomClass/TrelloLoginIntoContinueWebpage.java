package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginIntoContinueWebpage {
	WebDriver driver;
	public TrelloLoginIntoContinueWebpage(WebDriver driver) {
		this.driver=driver;
		PageFactory. initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextFeild;
	
	@FindBy(xpath = "//button[@id='login-submit']")
	private WebElement loginButton;
	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
