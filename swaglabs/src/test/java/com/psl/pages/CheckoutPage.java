package com.psl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.psl.common.BasePage;

public class CheckoutPage extends BasePage {

	public By firstNameLocator = By.cssSelector("input#first-name");
	public By lastNameLocator = By.cssSelector("input#last-name");
	public By postalCodeNameLocator = By.cssSelector("input#postal-code");
	public By continueBtnLocator  = By.cssSelector("#continue");
	public By errorMsgLocator = By.xpath("//*[@data-test=\"error\"]");
	public By checkoutOverviewLocator  = By.cssSelector(".title");
	public By finishLocator  = By.cssSelector("#finish");
	public By confirmationMsgLocator  = By.cssSelector(".complete-header");
	
	public void enterUserDetails(String firstName, String lastName, String postalCode) {
		WebElement fname = driver.findElement(firstNameLocator);
		WebElement lname = driver.findElement(lastNameLocator);
		WebElement pcname = driver.findElement(postalCodeNameLocator);
		Assert.assertTrue(fname.isDisplayed());
		Assert.assertTrue(lname.isDisplayed());
		Assert.assertTrue(pcname.isDisplayed());
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
		pcname.sendKeys(postalCode);

	}

	public void userEnterFullName(String firstName, String lastName) {
		WebElement fname = driver.findElement(firstNameLocator);
		WebElement lname = driver.findElement(lastNameLocator);
		Assert.assertTrue(fname.isDisplayed());
		Assert.assertTrue(lname.isDisplayed());
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
	}
	public void clickOnContinueButton() {
		driver.findElement(continueBtnLocator).click();
	}
	public void errorMessage(String errorMessage) {
		Assert.assertEquals(driver.findElement(errorMsgLocator).getText(), errorMessage); 
		
	}
	public String checkoutOverviewDisplayed() {
		return driver.findElement(checkoutOverviewLocator).getText();
	}
	public void clickOnFinishButton() {
		driver.findElement(finishLocator).click();
	}
	public String confirmationMsgDisplayed() {
		return driver.findElement(confirmationMsgLocator).getText();
	}
}
