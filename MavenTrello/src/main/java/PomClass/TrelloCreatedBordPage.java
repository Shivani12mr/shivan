package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloCreatedBordPage {
	WebDriver driver;

	public TrelloCreatedBordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Show menu']//span[@class='css-snhnyn']")
	private WebElement showMenuOption;

	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-open-more']")
	private WebElement moreOption;

	@FindBy(xpath = "//a[contains(text(),'Close board…')]")
	private WebElement closeBoardOption;

	@FindBy(xpath = "//input[@value='Close']")
	private WebElement closeOption;

	@FindBy(xpath = "//button[normalize-space()='Permanently delete board']")
	private WebElement permanentlyDeleteBoard;

	@FindBy(xpath = "//button[normalize-space()='Delete']")
	private WebElement deleteButton;

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getShowMenuOption() {
		return showMenuOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseOption() {
		return closeOption;
	}

	public WebElement getPermanentlyDeleteBoard() {
		return permanentlyDeleteBoard;
	}

	@FindBy(xpath = "//span[@class='placeholder']")
	private WebElement addAnotherList;

	@FindBy(xpath = "//input[@placeholder='Enter list title…']")
	private WebElement EnterTheListTitle1;

	@FindBy(xpath = "//input[@placeholder='Enter list title…']")
	private WebElement EnterTheListTitle2;

	@FindBy(xpath = "//input[@value='Add list']")
	private WebElement addList;

	public WebElement getAddAnotherList() {
		return addAnotherList;
	}

	public WebElement getEnterTheListTitle1() {
		return EnterTheListTitle1;
	}

	public WebElement getEnterTheListTitle2() {
		return EnterTheListTitle2;
	}

	public WebElement getAddList() {
		return addList;
	}

	@FindBy(xpath = "(//a[@aria-label='List actions'])[4]")
	private WebElement addedList1;

	public WebElement getAddedList1() {
		return addedList1;
	}

	@FindBy(xpath = "(//a[@aria-label='List actions'])[5]")
	private WebElement addedList2;

	public WebElement getAddedList2() {
		return addedList2;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[4]/div[1]/div[3]/a[1]")
	private WebElement addCard1;

	public WebElement getAddCard1() {
		return addCard1;
	}

	public WebElement getCard1TextFeild() {
		return card1TextFeild;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement card1TextFeild;

	@FindBy(xpath = "(//input[@value='Add card'])[1]")
	private WebElement addCard2;

	public WebElement getAddCard2() {
		return addCard2;
	}

	public WebElement getCard2TextFeild() {
		return card2TextFeild;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement card2TextFeild;

	@FindBy(xpath = "//input[@value='Add card']")
	private WebElement addCard3;

	public WebElement getAddCard3() {
		return addCard3;
	}

	public WebElement getCard3TextFeild() {
		return card3TextFeild;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement card3TextFeild;
	

	public WebElement getCard4TextFeild() {
		return card4TextFeild;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement card4TextFeild;

	
	@FindBy(xpath = "//input[@value='Add card']")
	private WebElement addCard4;

	public WebElement getAddCard4() {
		return addCard4;

	}
	
	@FindBy(xpath = "(//input[@value='Add card'])[1]")
	private WebElement addCard5;

	public WebElement getAddCard5() {
		return addCard5;

	}
	
	@FindBy(xpath = "(//span[@class='list-card-title js-card-name'])[1]")   //(//span[@class='list-card-title js-card-name'])[1]
	private WebElement addedCard1;

	public WebElement getAddedCard1() {
		return addedCard1;
	}
	@FindBy(xpath = "(//div[@class='js-list list-wrapper list-wrapper-with-margins'])[5]") //
	private WebElement pythonCard;

	public WebElement getPythonCard() {
		return pythonCard;
	}
	@FindBy(xpath = "//div[@class='list-header js-list-header u-clearfix is-menu-shown']//a[@aria-label='List actions']")
	private WebElement testingMoreOption;
	
	@FindBy(xpath = "(//a[contains(text(),'Move all cards in this list…')])[1]")
	private WebElement moveAllCards;
	
	@FindBy(xpath = "//a[normalize-space()='PYTHON']")
	private WebElement  toPythonCard;

	public WebElement getTestingMoreOption() {
		return testingMoreOption;
	}

	public WebElement getMoveAllCards() {
		return moveAllCards;
	}

	public WebElement getToPythonCard() {
		return toPythonCard;
	}
	 
}
