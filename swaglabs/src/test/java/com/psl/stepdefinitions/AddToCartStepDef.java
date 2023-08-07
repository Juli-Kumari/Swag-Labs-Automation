package com.psl.stepdefinitions;

import org.testng.Assert;

import com.psl.pages.CartPage;
import com.psl.pages.ProductPage;

import io.cucumber.java.en.*;

public class AddToCartStepDef {

	ProductPage productPage = new ProductPage();
	CartPage cartPage = new CartPage();

	@When("User click on add to cart button for one product")
	public void user_click_on_add_to_cart_button_for_one_product() {
	   productPage.clickOnAddToCartBtnForOneItem();
	}

	@Then("Confirm the cart updated item count to one")
	public void confirm_the_cart_updated_item_count_to_one() {
	   Assert.assertEquals(productPage.shoppingCartIncrementToOne(), 1);
	}

	@When("Click on shopping cart")
	public void click_on_shopping_cart() {
	   productPage.clickOnShoppingCartLink();
	}

	@Then("User see that one Product is added to the cart")
	public void user_see_that_one_product_is_added_to_the_cart() {
	   Assert.assertEquals( cartPage.singleProductName(), "Sauce Labs Backpack");
	}

	@When("User click on add to cart button for more than one product")
	public void user_click_on_add_to_cart_button_for_more_than_one_product() {
	   productPage.clickOnAddToCartBtnForMultipleItem();
	}

	@Then("Confirm the cart updated item count should increase")
	public void confirm_the_cart_updated_item_count_should_increase() {
		Assert.assertEquals(productPage.shoppingCartIncrementedToMoreThanOne(), 2);
	}

	@Then("User see that multiple product is added to the cart")
	public void user_see_that_multiple_product_is_added_to_the_cart() {
		 Assert.assertEquals( cartPage.singleProductName(), "Sauce Labs Backpack");
		 Assert.assertEquals( cartPage.mutipleProductName(), "Sauce Labs Bike Light");
	}


}
