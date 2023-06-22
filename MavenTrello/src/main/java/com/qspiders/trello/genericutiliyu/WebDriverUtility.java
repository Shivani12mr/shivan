package com.qspiders.trello.genericutiliyu;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void implicitywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	 
	public WebElement explicitywait(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public boolean explicityWaitPartialTitle(WebDriver driver,String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		boolean value = wait.until(ExpectedConditions.titleContains(expectedTitle));
		return value;
	}
	public boolean explicityWaitCompleteTitle(WebDriver driver,String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(35));
		boolean value = wait.until(ExpectedConditions.titleIs(expectedTitle));
		return value;
	}
		public boolean  explicityWaitPartialUrl(WebDriver driver,String expectedUrl) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			boolean value = wait.until(ExpectedConditions.urlContains(expectedUrl));
			return value;
		}
		
	}
