package com.psl.stepdefinitions;

import org.testng.Assert;

import com.psl.common.BasePage;
import com.psl.pages.LoginPage;
import com.psl.pages.ProductPage;

import io.cucumber.java.en.*;

public class ProductsStepDef extends BasePage {
	LoginPage loginPage = new LoginPage();
	ProductPage productPage = new ProductPage();

	@Given("User is logged in")
	public void user_is_logged_in() {
		loginPage.userLogin();
	}

	@When("User on the products page")
	public void user_on_the_products_page() {
		Assert.assertEquals(productPage.productsPageIsDisplayed(), "Products");
	}

	@Then("verify the products price should be present with a doller sign")
	public void verify_the_products_price_should_be_present_with_a_doller_sign() {
		Assert.assertTrue(productPage.productsPriceInDollerSignPresent().contains("$"));
	}

	@When("User click on sorting option by name in descending order")
	public void user_click_on_sorting_option_by_name_in_descending_order() {
		productPage.selectDropdownByNameInDescendingOrder();
	}

	@Then("Verify the products are sorted by name in descending order")
	public void verify_the_products_are_sorted_by_name_in_descending_order() {
		productPage.productsNameInDescendingOrder();
	}

	@When("User click on sorting option by name in ascending order")
	public void user_click_on_sorting_option_by_name_in_ascending_order() {
		productPage.selectDropdownByNameInAscendingOrder();
	}

	@Then("Verify the products are sorted by name in ascending order")
	public void verify_the_products_are_sorted_by_name_in_ascending_order() {
		productPage.selectDropdownByNameInAscendingOrder();
	}

	@When("User click on sorting option by price in ascending order")
	public void user_click_on_sorting_option_by_price_in_ascending_order() {
		productPage.selectDropdownByPriceInAscendingOrder();
	}

	@Then("Verify the products are sorted by price in ascending order")
	public void verify_the_products_are_sorted_by_price_in_ascending_order() {

		productPage.productsPriceInAscendingOrder();
	}

	@When("User click on sorting option by price in descending order")
	public void user_click_on_sorting_option_by_price_in_descending_order() {
		productPage.selectDropdownByPriceInDescendingOrder();
	}

	@Then("Verify the products are sorted by price in descending order")
	public void verify_the_products_are_sorted_by_price_in_descending_order() {
		productPage.productsPriceInDescendingOrder();
	}

}
