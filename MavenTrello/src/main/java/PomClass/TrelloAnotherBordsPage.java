package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloAnotherBordsPage {
	WebDriver driver;

	public  TrelloAnotherBordsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//button[@aria-label='Add board'])[1]")
	private WebElement addAnotherBoardButton;

	public WebElement getAddAnotherBoardButton() {
		return addAnotherBoardButton;
	}
	
	@FindBy(xpath = "(//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst'])[1]")
	private WebElement  newBoardTitleTextFeild;

	public WebElement getNewBoardTitleTextFeild() {
		return newBoardTitleTextFeild;
	}
	
	
	@FindBy(xpath = "(//button[contains(text(),'Create')])[1]")
	private WebElement  newCreateButton;

	public WebElement getNewCreateButton() {
		return newCreateButton;
	}
	
	@FindBy(xpath = "//a[normalize-space()='SHIVANI']")
	private WebElement oldBoard;

	public WebElement getOldBoard() {
		return oldBoard;
	}
	
	@FindBy(xpath = "(//a[@aria-label='List actions'])[4]")
	private WebElement oldBoardListThreeDots;

	public WebElement getOldBoardListThreeDots() {
		return oldBoardListThreeDots;
	}
	
	
	@FindBy(xpath = "(//a[contains(text(),'Move list…')])[1]")
	private WebElement moveList;

	public WebElement getMoveList() {
		return moveList;
	}

	@FindBy(xpath = "(//select[@class='js-select-board'])[1]")
	private WebElement selectBoardName;
	
	public WebElement getSelectBoardName() {
		return selectBoardName;
	}
	
	
	
	
	
}
