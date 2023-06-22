package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogOutPage {
	WebDriver driver;
	public TrelloLogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory. initElements(driver, this);
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	@FindBy(xpath = "//*[@id=\"logout-submit\"]")
    private  WebElement logoutButton;

}
