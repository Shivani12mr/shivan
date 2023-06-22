package com.qspiders.trello.genericutiliyu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

 

public class BaseClass {
	public WebDriver driver;
	public FileUtilituy fileutils = new FileUtilituy();
	public WebDriverUtility webdriverutils = new WebDriverUtility();
	public ExcelUtility excelutils=new ExcelUtility();

	@BeforeMethod
	//@Parameters("browserName")
	public void configBeforeMethod( ) throws IOException {
		String browserName = fileutils.readCommondata("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileutils.readCommondata("url"));

	}

	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();

	}

}
