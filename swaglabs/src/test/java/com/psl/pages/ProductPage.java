package com.psl.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.psl.common.BasePage;

public class ProductPage extends BasePage {

	public By productLocator = By.xpath("//span[@class=\"title\"]");
	public By productPriceLocator = By.className("inventory_item_price");
	public By productFilterLocator = By.className("product_sort_container");
	public By productNameLocator = By.className("inventory_item_name");

	public By menuLocator = By.cssSelector("#react-burger-menu-btn");
	public By menuAllItemsLocator = By.cssSelector("a#inventory_sidebar_link");
	public By menuAboutLocator = By.cssSelector("a#about_sidebar_link");
	public By menuLogoutLocator = By.cssSelector("a#logout_sidebar_link");
	public By menuResetAppStateLocator = By.cssSelector("a#reset_sidebar_link");
// About Page
	public By productsTabLocator = By.xpath("//*[@class= \"MuiBox-root css-0\"]//span[text()=\"Products\"]");
	public By solutionsTabLocator = By.xpath("//*[@class= \"MuiBox-root css-0\"]//span[text()=\"Solutions\"]");
	public By pricingTabLocator = By.xpath("//*[@class= \"MuiBox-root css-1x2l18i\"]//a//span");
	public By resourcesTabLocator = By.xpath("//*[@class= \"MuiBox-root css-0\"]//span[text()=\"Resources\"]");

	// single product add to cart
	public By addToCartBackpackLocator = By.cssSelector("#add-to-cart-sauce-labs-backpack");
	public By shoppingCartBadgeLocator = By.cssSelector(".shopping_cart_badge");
	public By shoopingCartLocatore = By.cssSelector("a.shopping_cart_link");
	// mutiple product add to cart
	public By addToCartBikeLightLocator = By.cssSelector("#add-to-cart-sauce-labs-bike-light");

	public String productsPageIsDisplayed() {
		return driver.findElement(productLocator).getText();
	}

	public String productsPriceInDollerSignPresent() {

		return driver.findElement(productPriceLocator).getText();

	}

	public void selectDropdownByNameInDescendingOrder() {
		// 3. filter the price from the dropdown in Price (low to high)
		driver.findElement(productFilterLocator).isDisplayed();

	}

	// products price in ascending order
	public void productsNameInDescendingOrder() {

		// 1. before filter capture the price
		List<WebElement> beforeFilterProductsName = driver.findElements(productNameLocator);
		// 2. get the list of the products
		ArrayList<String> beforeFilterProductsNameList = new ArrayList<>();
		for (WebElement n : beforeFilterProductsName) {
			beforeFilterProductsNameList.add(n.getText());

		}
		// 3. filter the name from the dropdown in Name (Z to A)
		Select dropdown = new Select(driver.findElement(productFilterLocator));
		dropdown.selectByVisibleText("Name (Z to A)");

		// 4. after filter capture the product name
		List<WebElement> afterFilterProductsName = driver.findElements(productNameLocator);
		// 5. get the list of the products
		ArrayList<String> afterFilterProductsNameList = new ArrayList<>();
		for (WebElement n : afterFilterProductsName) {
			afterFilterProductsNameList.add(n.getText());

		}
		// 6. sort the value in decending order and compare with the before filter
		// values/ assert the values
		Collections.sort(beforeFilterProductsNameList); // return the beforeFilterPriceList in sorting the form of
														// ascending order

		Collections.reverse(beforeFilterProductsNameList); // decending order

		Assert.assertEquals(beforeFilterProductsNameList, afterFilterProductsNameList);

	}

	public void selectDropdownByNameInAscendingOrder() {
		// 3. filter the price from the dropdown in Price (low to high)
		driver.findElement(productFilterLocator).isDisplayed();

	}

	// products price in ascending order
	public void productsNameInAscendingOrder() {

		// 1. before filter capture the price
		List<WebElement> beforeFilterProductsName = driver.findElements(productNameLocator);
		// 2. get the list of the products
		ArrayList<String> beforeFilterProductsNameList = new ArrayList<>();
		for (WebElement n : beforeFilterProductsName) {
			beforeFilterProductsNameList.add(n.getText());

		}
		// 3. filter the name from the dropdown in Name (A to Z)
		Select dropdown = new Select(driver.findElement(productFilterLocator));
		dropdown.selectByVisibleText("Name (A to Z)");

		// 4. after filter capture the product name
		List<WebElement> afterFilterProductsName = driver.findElements(productNameLocator);
		// 5. get the list of the products
		ArrayList<String> afterFilterProductsNameList = new ArrayList<>();
		for (WebElement n : afterFilterProductsName) {
			afterFilterProductsNameList.add(n.getText());

		}
		// 6. sort the value in decending order and compare with the before filter
		// values/ assert the values
		Collections.sort(beforeFilterProductsNameList); // return the beforeFilterPriceList in sorting the form of
														// ascending order

		Assert.assertEquals(beforeFilterProductsNameList, afterFilterProductsNameList);

	}

	public void selectDropdownByPriceInAscendingOrder() {
		// 3. filter the price from the dropdown in Price (low to high)
		driver.findElement(productFilterLocator).isDisplayed();

	}

	// products price in ascending order
	public void productsPriceInAscendingOrder() {

		// 1. before filter capture the price
		List<WebElement> beforeFilterPrice = driver.findElements(productPriceLocator);

		// 2. remove the "$" symbol from the price then convert the string into double
		List<Double> beforeFilterPriceList = new ArrayList<>();
		for (WebElement price : beforeFilterPrice) {
			// price.getText()
			// price.getText().replace("$", "")
			// Double.valueOf(price.getText().replace("$", ""))
			beforeFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
		}

		// 3. filter the price from the dropdown in Price (low to high)
		Select dropdown = new Select(driver.findElement(productFilterLocator));
		dropdown.selectByVisibleText("Price (low to high)");
		// 4. after filter capture the price
		List<WebElement> afterFilterPrice = driver.findElements(productPriceLocator);
		// 5. remove the "$" symbol from the price then convert the string into double
		List<Double> afterFilterPriceList = new ArrayList<>();
		for (WebElement p : afterFilterPrice) {
			afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
		}
		// 6. sort the value in decending order and compare with the before filter
		// values/ assert the values
		Collections.sort(beforeFilterPriceList); // return the beforeFilterPriceList in sorting the form of ascending
													// order

		Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);

	}

	public void selectDropdownByPriceInDescendingOrder() {
		// 3. filter the price from the dropdown in Price (low to high)
		driver.findElement(productFilterLocator).isDisplayed();

	}

	// products price in scending order
	public void productsPriceInDescendingOrder() {

		// 1. before filter capture the price
		List<WebElement> beforeFilterPrice = driver.findElements(productPriceLocator);

		// 2. remove the "$" symbol from the price then convert the string into double
		List<Double> beforeFilterPriceList = new ArrayList<>();
		for (WebElement price : beforeFilterPrice) {
			// price.getText()
			// price.getText().replace("$", "")
			// Double.valueOf(price.getText().replace("$", ""))
			beforeFilterPriceList.add(Double.valueOf(price.getText().replace("$", "")));
		}

		// 3. filter the price from the dropdown in Price (high to low)
		Select dropdown = new Select(driver.findElement(productFilterLocator));
		dropdown.selectByVisibleText("Price (high to low)");
		// 4. after filter capture the price
		List<WebElement> afterFilterPrice = driver.findElements(productPriceLocator);
		// 5. remove the "$" symbol from the price then convert the string into double
		List<Double> afterFilterPriceList = new ArrayList<>();
		for (WebElement p : afterFilterPrice) {
			afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
		}
		// 6. sort the value in decending order and compare with the before filter
		// values/ assert the values
		Collections.sort(beforeFilterPriceList); // return the beforeFilterPriceList in sorting the form of ascending
													// order
		Collections.reverse(beforeFilterPriceList); // reverse the list beforeFilterPriceList

		Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);

	}

	// menu
	public void clickOnMenuTab() {
		driver.findElement(menuLocator).click();
	}

	public void allItemsInMenuTab(String allItems, String about, String logout, String resetAppStates) {
		String expectedAllItemsText = allItems;
		String expectedaboutText = about;
		String expectedlogoutText = logout;
		String expectedresetAppStatesText = resetAppStates;
		Assert.assertEquals(driver.findElement(menuAllItemsLocator).getText(), expectedAllItemsText);
		Assert.assertEquals(driver.findElement(menuAboutLocator).getText(), expectedaboutText);
		Assert.assertEquals(driver.findElement(menuLogoutLocator).getText(), expectedlogoutText);
		Assert.assertEquals(driver.findElement(menuResetAppStateLocator).getText(), expectedresetAppStatesText);
	}

	public void clickOnAboutTab() {
		driver.findElement(menuAboutLocator).click();
	}

	public void seeAllAboutPageTabs(String Products, String Solutions, String Pricing, String Resources) {
		String expectedAllItemsText = Products;
		String expectedaboutText = Solutions;
		String expectedlogoutText = Pricing;
		String expectedresetAppStatesText = Resources;
		Assert.assertEquals(driver.findElement(productsTabLocator).getText(), expectedAllItemsText);
		Assert.assertEquals(driver.findElement(solutionsTabLocator).getText(), expectedaboutText);
		Assert.assertEquals(driver.findElement(pricingTabLocator).getText(), expectedlogoutText);
		Assert.assertEquals(driver.findElement(resourcesTabLocator).getText(), expectedresetAppStatesText);
	}

	public void clickOnLogoutOption() {
		driver.findElement(menuLogoutLocator).click();
	}

// single product add to cart
	public void clickOnAddToCartBtnForOneItem() {
		driver.findElement(addToCartBackpackLocator).click();
	}

	public int shoppingCartIncrementToOne() {
		String badge = driver.findElement(shoppingCartBadgeLocator).getText();
		System.out.println("Integer.parseInt(badge)" + Integer.parseInt(badge));
		return Integer.parseInt(badge);

	}

	public void clickOnShoppingCartLink() {
		driver.findElement(shoopingCartLocatore).click();
	}

	// multiple products add to cart
	public void clickOnAddToCartBtnForMultipleItem() {
		driver.findElement(addToCartBackpackLocator).click();
		driver.findElement(addToCartBikeLightLocator).click();
	}

	public int shoppingCartIncrementedToMoreThanOne() {
		String badge = driver.findElement(shoppingCartBadgeLocator).getText();
		System.out.println("Integer.parseInt(badge)" + Integer.parseInt(badge));
		return Integer.parseInt(badge);

	}

}
