package com.psl.stepdefinitions;

import org.testng.Assert;

import com.psl.pages.CartPage;
import com.psl.pages.CheckoutPage;

import io.cucumber.java.en.*;

public class CheckoutStepDef {

	CartPage cartPage = new CartPage();
	CheckoutPage checkoutPage = new CheckoutPage();

	@Then("Click on checkout")
	public void click_on_checkout() {
		cartPage.clickOnChcekoutButton();
	}

	@Then("user can see and enter the {string} {string} {string}")
	public void user_can_see_and_enter_the(String firstName, String lastName, String postalCode) {
		checkoutPage.enterUserDetails(firstName, lastName, postalCode);

	}

	@When("user enter the {string} {string}")
	public void user_enter_the(String firstName, String lastName) {
		checkoutPage.userEnterFullName(firstName, lastName);
	}

	@And("user click on continue")
	public void user_click_on_continue() {
		checkoutPage.clickOnContinueButton();
	}

	@Then("user see the error message as {string}")
	public void user_see_the_error_message_as(String errorMsg) {
		checkoutPage.errorMessage(errorMsg);
	}

	@Then("user enter the {string} {string} {string}")
	public void user_enter_the(String firstName, String lastName, String postalCode) {
		checkoutPage.enterUserDetails(firstName, lastName, postalCode);
	}

	@Then("user can see the checkout overview")
	public void user_can_see_the_checkout_overview() {
		Assert.assertEquals(checkoutPage.checkoutOverviewDisplayed(), "Checkout: Overview");
	}

	@When("user click on finish")
	public void user_click_on_finish() {
		checkoutPage.clickOnFinishButton();
	}

	@Then("Verify the order confirmation message should displayed")
	public void verify_the_order_confirmation_message_should_displayed() {
		Assert.assertEquals(checkoutPage.confirmationMsgDisplayed(), "Thank you for your order!");
	}

}
