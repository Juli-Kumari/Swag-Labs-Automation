package com.psl.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.psl.common.BasePage;


public class LoginPage extends BasePage{
	public By logoLocator = By.xpath("//*[@class=\"login_logo\"]");
	public By userNameLocator = By.xpath("//input[@id=\"user-name\"]");
	public By passwordLocator = By.xpath("//input[@id=\"password\"]");
	public By loginButtonLocator = By.xpath("//input[@id=\"login-button\"]");
	public By pageTitleLocator = By.xpath("//*[@class=\"app_logo\"]");
	public By errorMessageLocator = By.xpath("//*[@data-test = \"error\"]");
	
	public void logoIsDisplayed() {
		driver.findElement(logoLocator).isDisplayed();
	}
	
	public void enterUsername(String username) {
		driver.findElement(userNameLocator).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButtonLocator).click();
	}
	
	public boolean pageTitleIsDisplayed() {
		
     return driver.findElement(pageTitleLocator).isDisplayed();
		
	}
	
	public String errorMessageIsDisplayed() {
		return driver.findElement(errorMessageLocator).getText();
	}

	public void userLogin() {
		driver.findElement(userNameLocator).sendKeys("standard_user");
		driver.findElement(passwordLocator).sendKeys("secret_sauce");
		driver.findElement(loginButtonLocator).click();
		driver.findElement(pageTitleLocator).isDisplayed();
	}
}
