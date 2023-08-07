package com.psl.stepdefinitions;

import org.testng.Assert;

import com.psl.common.BasePage;
import com.psl.pages.LoginPage;

import io.cucumber.java.en.*;


public class LoginStepDef extends BasePage  {

	LoginPage loginPage = new LoginPage();
	
	@Given("^User is on login page$")
	public void user_is_on_login_page(){
           loginPage.logoIsDisplayed();
	}

	@When("^User enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_and(String username, String password)  {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@When("^Click on login button$")
	public void click_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("Swag Labs title displayed after succesfully login$")
	public void title_displayed_after_succesfully_login()   {
	    Assert.assertTrue(loginPage.pageTitleIsDisplayed());
	}

	@Then("^Error message displayed after unsuccessful login$")
	public void error_message_displayed_after_unsuccessful_login() {
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
	    Assert.assertEquals(loginPage.errorMessageIsDisplayed(), expectedErrorMessage);
	}

}
