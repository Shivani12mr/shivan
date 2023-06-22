package TrelloEndToEndScenarios;

import com.qspiders.trello.genericutiliyu.BaseClass;

import java.io.IOException;

import javax.swing.text.TabableView;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qspiders.trello.genericutiliyu.BaseClass;

import PomClass.TrelloBordsPage;
import PomClass.TrelloCreatedBordPage;
import PomClass.TrelloHomeWebpage;
import PomClass.TrelloLogOutPage;
import PomClass.TrelloLoginIntoContinueWebpage;
import PomClass.TrelloLoginWebPage;

public class TrelloBoards1 extends BaseClass {
	@Test(priority = 1, groups = { "smoketesting" })
	public void trelloHomePage() throws IOException {
		webdriverutils.implicitywait(driver);
		TrelloHomeWebpage trello = new TrelloHomeWebpage(driver);
		String actualHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = excelutils.stringCommonData("mysheet", 0, 1);
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,
				"Home page title not found correct and verified");
	}

	@Test(priority = 2, groups = { "smoketesting" })
	public void trelloHomePageCheck() throws IOException {
		webdriverutils.implicitywait(driver);
		TrelloHomeWebpage trello = new TrelloHomeWebpage(driver);
		String actualHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = excelutils.stringCommonData("mysheet", 0, 1);
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,
				"Home page title not found correct and verified");
		webdriverutils.explicitywait(driver, trello.getLoginOption()).click();
		String actualLoginPageTitle = driver.getTitle();
		String expectedLoginPageTitle = excelutils.stringCommonData("mysheet", 1, 1);
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,
				"loginPageTitle not Found correct and verified");
		String actualLoginPageUrl = excelutils.stringCommonData("mysheet", 2, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, actualLoginPageUrl), true);
	}

	@Test(priority = 3, groups = { "systemtesting" })
	public void trelloBoardPageCheck() throws IOException, Throwable {
		webdriverutils.implicitywait(driver);
		TrelloHomeWebpage trello = new TrelloHomeWebpage(driver);
		String actualHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = excelutils.stringCommonData("mysheet", 0, 1);
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,
				"Home page title not found correct and verified");
		webdriverutils.explicitywait(driver, trello.getLoginOption()).click();
		String actualLoginPageTitle = driver.getTitle();
		String expectedLoginPageTitle = excelutils.stringCommonData("mysheet", 1, 1);
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,
				"loginPageTitle not Found correct and verified");
		String actualLoginPageUrl = excelutils.stringCommonData("mysheet", 2, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, actualLoginPageUrl), true);
		TrelloLoginWebPage login = new TrelloLoginWebPage(driver);
		webdriverutils.explicitywait(driver, login.getEmailIdTextFeild())
				.sendKeys(fileutils.readCommondata("username"));
		// Actions actions=new Actions(driver);
		webdriverutils.explicitywait(driver, login.getContinueButton()).submit();
		String expectedLoginToContinueTitle = excelutils.stringCommonData("mysheet", 3, 1);
		webdriverutils.explicityWaitPartialTitle(driver, expectedLoginToContinueTitle);
		String actualLoginToContinueTitle = driver.getTitle();
		Assert.assertEquals(actualLoginToContinueTitle, expectedLoginToContinueTitle,
				"Login to Continue Page not found");
		String expectedLoginToContinuePageUrl = excelutils.stringCommonData("mysheet", 4, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLoginToContinuePageUrl), true);
		TrelloLoginIntoContinueWebpage loginIntoContinue = new TrelloLoginIntoContinueWebpage(driver);
		webdriverutils.explicitywait(driver, loginIntoContinue.getPasswordTextFeild())
				.sendKeys(fileutils.readCommondata("password"));
		webdriverutils.explicitywait(driver, loginIntoContinue.getLoginButton()).submit();
		String expectedBordsPageUrl = excelutils.stringCommonData("mysheet", 6, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedBordsPageUrl), true);
		String expectedBordsPageTitle = excelutils.stringCommonData("mysheet", 5, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedBordsPageTitle);
		String actualBordsPageTitle = driver.getTitle();
		Assert.assertEquals(actualBordsPageTitle, expectedBordsPageTitle,
				"Bords page Title found  not correct and verified");
		TrelloBordsPage bordsPage = new TrelloBordsPage(driver);
		webdriverutils.explicitywait(driver, bordsPage.getProfileButton()).click();
		webdriverutils.explicitywait(driver, bordsPage.getLogoutOption()).click();
		String expectedLogoutPageTitle = excelutils.stringCommonData("mysheet", 7, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedLogoutPageTitle);
		String actualLogOutPageTitle = driver.getTitle();
		Assert.assertEquals(actualLogOutPageTitle, expectedLogoutPageTitle,
				"LogoutPage Title found  not correct and verified");
		String expectedLogoutPageUrl = excelutils.stringCommonData("mysheet", 8, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLogoutPageUrl), true);
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
		webdriverutils.explicitywait(driver, LogOutPage.getLogoutButton()).click();
		String expectedHomePagetitleAfterLogOut = excelutils.stringCommonData("mysheet", 9, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedHomePagetitleAfterLogOut);
		String actualHomePagetitleAfterLogOut = driver.getTitle();
		Assert.assertEquals(actualHomePagetitleAfterLogOut, expectedHomePagetitleAfterLogOut,
				"Home page After Logout  Title not found correct and verified");
		String expectedHomePageUrlAfterLogOut = excelutils.stringCommonData("mysheet", 10, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedHomePageUrlAfterLogOut), true);
	}

	@Test(priority = 4, groups = { "systemtesting" })
	public void trelloCreateAndDeleteBoard() throws IOException, Throwable {
		webdriverutils.implicitywait(driver);
		TrelloHomeWebpage trello = new TrelloHomeWebpage(driver);
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, excelutils.stringCommonData("mysheet", 0, 1),
				"Home page title not found correct and verified");
		webdriverutils.explicitywait(driver, trello.getLoginOption()).click();
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, excelutils.stringCommonData("mysheet", 1, 1),
				"LoginPage Title   Found  not Correct and verified");
		String actualLoginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualLoginPageUrl, excelutils.stringCommonData("mysheet", 2, 1),
				"LoginPageUrl   Found  not Correct and verified");
		TrelloLoginWebPage login = new TrelloLoginWebPage(driver);
		webdriverutils.explicitywait(driver, login.getEmailIdTextFeild())
				.sendKeys(fileutils.readCommondata("username"));
		webdriverutils.explicitywait(driver, login.getContinueButton()).submit();
		String expectedLoginToContinueTitle = excelutils.stringCommonData("mysheet", 3, 1);
		webdriverutils.explicityWaitPartialTitle(driver, expectedLoginToContinueTitle);
		String actualLoginToContinueTitle = driver.getTitle();
		Assert.assertEquals(actualLoginToContinueTitle, expectedLoginToContinueTitle,
				"LoginTocontinue page title not found correct and verified");
		String expectedLoginToContinuePageUrl = excelutils.stringCommonData("mysheet", 4, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLoginToContinuePageUrl), true);
		TrelloLoginIntoContinueWebpage loginIntoContinue = new TrelloLoginIntoContinueWebpage(driver);
		webdriverutils.explicitywait(driver, loginIntoContinue.getPasswordTextFeild())
				.sendKeys(fileutils.readCommondata("password"));
		webdriverutils.explicitywait(driver, loginIntoContinue.getLoginButton()).click();
		String expectedBordsPageUrl = excelutils.stringCommonData("mysheet", 6, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedBordsPageUrl), true);
		String expectedBordsPageTitle = excelutils.stringCommonData("mysheet", 5, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedBordsPageTitle);
		String actualBordsPageTitle = driver.getTitle();
		Assert.assertEquals(actualBordsPageTitle, expectedBordsPageTitle,
				"Bords page Title found  not correct and verified");
		TrelloBordsPage bordsPage = new TrelloBordsPage(driver);
		webdriverutils.explicitywait(driver, bordsPage.getCreateOption()).click();
		bordsPage.getCreateBordOption().click();
		if (bordsPage.getBordTitleTextFeild().isDisplayed()) {
			Reporter.log("Bords Title Text Feild is visible ");
		} else {
			Reporter.log("Bords Title Text Feild is not visible ");
		}
		bordsPage.getBordTitleTextFeild().sendKeys(excelutils.stringCommonData("mysheet", 11, 1));

		webdriverutils.explicitywait(driver, bordsPage.getCreateBordButton()).click();
		String expectedCreatedBordsPageTitle = excelutils.stringCommonData("mysheet", 12, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedCreatedBordsPageTitle);
		String actualCreatedBordsPageTitle = driver.getTitle();
		Assert.assertEquals(actualCreatedBordsPageTitle, expectedCreatedBordsPageTitle,
				"Created BORDS PAGE title found  correct and not verified");
		String expectedCreatedBordsPageUrl = excelutils.stringCommonData("mysheet", 13, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedCreatedBordsPageUrl), true);
		TrelloCreatedBordPage createdBordPage = new TrelloCreatedBordPage(driver);
		createdBordPage.getShowMenuOption().click();
		createdBordPage.getMoreOption().click();
		createdBordPage.getCloseBoardOption().click();
		createdBordPage.getCloseOption().click();
		createdBordPage.getPermanentlyDeleteBoard().click();
		createdBordPage.getDeleteButton().click();
		bordsPage.getProfilrButton().click();
		bordsPage.getLogoutOption().click();
		String expectedLogoutPageTitle = excelutils.stringCommonData("mysheet", 7, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedLogoutPageTitle);
		String actualLogOutPageTitle = driver.getTitle();
		Assert.assertEquals(actualLogOutPageTitle, expectedLogoutPageTitle,
				"Logout Page Title Found Corect And Not Verified");
		String expectedLogoutPageUrl = excelutils.stringCommonData("mysheet", 8, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLogoutPageUrl), true);
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
		LogOutPage.getLogoutButton().click();
		String expectedHomePagetitleAfterLogOut = excelutils.stringCommonData("mysheet", 9, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedHomePagetitleAfterLogOut);
		String actualHomePagetitleAfterLogOut = driver.getTitle();
		Assert.assertEquals(actualHomePagetitleAfterLogOut, expectedHomePagetitleAfterLogOut,
				"ActualHome Page Title After Logout Found Corect And Not Verified");
		String expectedHomePageUrlAfterLogOut = excelutils.stringCommonData("mysheet", 10, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedHomePageUrlAfterLogOut), true);
	}

	@Test(priority = 5, groups = { "systemtesting" })
	public void trelloDragAndDropAllCardsIntoAnotherList() throws IOException, Throwable {
		webdriverutils.implicitywait(driver);
		TrelloHomeWebpage trello = new TrelloHomeWebpage(driver);
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, excelutils.stringCommonData("mysheet", 0, 1),
				"Home page title not found correct and verified");
		webdriverutils.explicitywait(driver,trello.getLoginOption()).click();
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, excelutils.stringCommonData("mysheet", 1, 1),
				"LoginPage Title   Found  not Correct and verified");
		String actualLoginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualLoginPageUrl, excelutils.stringCommonData("mysheet", 2, 1),
				"LoginPageUrl   Found  not Correct and verified");
		TrelloLoginWebPage login = new TrelloLoginWebPage(driver);
		webdriverutils.explicitywait(driver, login.getEmailIdTextFeild())
				.sendKeys(fileutils.readCommondata("username"));
		webdriverutils.explicitywait(driver,login.getContinueButton()).submit();
		String expectedLoginToContinueTitle = excelutils.stringCommonData("mysheet", 3, 1);
		webdriverutils.explicityWaitPartialTitle(driver, expectedLoginToContinueTitle);
		String actualLoginToContinueTitle = driver.getTitle();
		Assert.assertEquals(actualLoginToContinueTitle, expectedLoginToContinueTitle,
				"LoginTocontinue page title not found correct and verified");
		String expectedLoginToContinuePageUrl = excelutils.stringCommonData("mysheet", 4, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLoginToContinuePageUrl), true);
		TrelloLoginIntoContinueWebpage loginIntoContinue = new TrelloLoginIntoContinueWebpage(driver);
		webdriverutils.explicitywait(driver, loginIntoContinue.getPasswordTextFeild())
				.sendKeys(fileutils.readCommondata("password"));
		webdriverutils.explicitywait(driver,loginIntoContinue.getLoginButton()).click();
		String expectedBordsPageUrl = excelutils.stringCommonData("mysheet", 6, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedBordsPageUrl), true);
		String expectedBordsPageTitle = excelutils.stringCommonData("mysheet", 5, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedBordsPageTitle);
		String actualBordsPageTitle = driver.getTitle();
		Assert.assertEquals(actualBordsPageTitle, expectedBordsPageTitle,
				"Bords page Title found  not correct and verified");
		TrelloBordsPage bordsPage = new TrelloBordsPage(driver);
		webdriverutils.explicitywait(driver,bordsPage.getCreateOption()).click();
		webdriverutils.explicitywait(driver,bordsPage.getCreateBordOption()).click();
		if (bordsPage.getBordTitleTextFeild().isDisplayed()) {
			Reporter.log("Bords Title Text Feild is visible ");
		} else {
			Reporter.log("Bords Title Text Feild is not visible ");
		}
		bordsPage.getBordTitleTextFeild().sendKeys(excelutils.stringCommonData("mysheet", 11, 1));
		webdriverutils.explicitywait(driver, bordsPage.getCreateBordButton()).click();
		String expectedCreatedBordsPageTitle = excelutils.stringCommonData("mysheet", 12, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedCreatedBordsPageTitle);
		String actualCreatedBordsPageTitle = driver.getTitle();
		Assert.assertEquals(actualCreatedBordsPageTitle, expectedCreatedBordsPageTitle,
				"Created BORDS PAGE title found  correct and not verified");
		String expectedCreatedBordsPageUrl = excelutils.stringCommonData("mysheet", 13, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedCreatedBordsPageUrl), true);
		TrelloCreatedBordPage createdBordPage = new TrelloCreatedBordPage(driver);
		createdBordPage.getAddAnotherList().click();
		createdBordPage.getEnterTheListTitle1().sendKeys(excelutils.stringCommonData("mysheet", 14, 1));
		createdBordPage.getAddList().click();
		webdriverutils.explicitywait(driver, createdBordPage.getAddCard1()).click();
		webdriverutils.explicitywait(driver, createdBordPage.getCard1TextFeild())
				.sendKeys(excelutils.stringCommonData("mysheet", 16, 1));
		createdBordPage.getAddCard2().click();
		webdriverutils.explicitywait(driver, createdBordPage.getCard2TextFeild())
				.sendKeys(excelutils.stringCommonData("mysheet", 17, 1));
		createdBordPage.getAddCard3().click();
		webdriverutils.explicitywait(driver, createdBordPage.getCard3TextFeild())
				.sendKeys(excelutils.stringCommonData("mysheet", 18, 1));
		createdBordPage.getAddCard4().click();
		webdriverutils.explicitywait(driver, createdBordPage.getCard4TextFeild())
				.sendKeys(excelutils.stringCommonData("mysheet", 19, 1));
		webdriverutils.explicitywait(driver,createdBordPage.getAddCard5()).click();
		createdBordPage.getEnterTheListTitle2().sendKeys(excelutils.stringCommonData("mysheet", 15, 1));
		
		createdBordPage.getAddList().click();
		 Actions actions=new Actions(driver);
		actions.clickAndHold(webdriverutils.explicitywait(driver, createdBordPage.getAddedCard1()))
				.dragAndDrop(webdriverutils.explicitywait(driver, createdBordPage.getAddedCard1()),
						webdriverutils.explicitywait(driver, createdBordPage.getPythonCard()))
				.release().build().perform();

		webdriverutils.explicitywait(driver, createdBordPage.getTestingMoreOption()).click();
		//actions.click(createdBordPage.getTestingMoreOption());
		webdriverutils.explicitywait(driver, createdBordPage.getMoveAllCards()).click();
		webdriverutils.explicitywait(driver, createdBordPage.getToPythonCard()).click();

		createdBordPage.getShowMenuOption().click();
		createdBordPage.getMoreOption().click();
		createdBordPage.getCloseBoardOption().click();
		createdBordPage.getCloseOption().click();
		createdBordPage.getPermanentlyDeleteBoard().click();
		createdBordPage.getDeleteButton().click();
		bordsPage.getProfilrButton().click();
		bordsPage.getLogoutOption().click();
		String expectedLogoutPageTitle = excelutils.stringCommonData("mysheet", 7, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedLogoutPageTitle);
		String actualLogOutPageTitle = driver.getTitle();
		Assert.assertEquals(actualLogOutPageTitle, expectedLogoutPageTitle,
				"Logout Page Title Found Corect And Not Verified");
		String expectedLogoutPageUrl = excelutils.stringCommonData("mysheet", 8, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedLogoutPageUrl), true);
		TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
		LogOutPage.getLogoutButton().click();
		String expectedHomePagetitleAfterLogOut = excelutils.stringCommonData("mysheet", 9, 1);
		webdriverutils.explicityWaitCompleteTitle(driver, expectedHomePagetitleAfterLogOut);
		String actualHomePagetitleAfterLogOut = driver.getTitle();
		Assert.assertEquals(actualHomePagetitleAfterLogOut, expectedHomePagetitleAfterLogOut,
				"ActualHome Page Title After Logout Found Corect And Not Verified");
		String expectedHomePageUrlAfterLogOut = excelutils.stringCommonData("mysheet", 10, 1);
		Assert.assertEquals(webdriverutils.explicityWaitPartialUrl(driver, expectedHomePageUrlAfterLogOut), true);
	}
}
