package com.psl.pages;



import org.openqa.selenium.By;

import com.psl.common.BasePage;

public class CartPage extends BasePage {

	public By productBagPackNameLocator = By.cssSelector("a#item_4_title_link");
	public By productBikeLightNameLocator = By.cssSelector("a#item_0_title_link");

	public By checkoutLocator = By.cssSelector("button#checkout");
	
	public String singleProductName() {
		return driver.findElement(productBagPackNameLocator).getText();

	}

	public String mutipleProductName() {
		return driver.findElement(productBikeLightNameLocator).getText();
	}
	public void clickOnChcekoutButton() {
		driver.findElement(checkoutLocator).click();
	}
}
