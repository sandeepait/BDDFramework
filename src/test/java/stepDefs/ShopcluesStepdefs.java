package stepDefs;

import commonPackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CurtainsPage;
import pages.HomePage;

public class ShopcluesStepdefs extends BaseClass {
	
	HomePage hm;
	CurtainsPage cp;
	BaseClass base = new BaseClass();
	
	@Given("I am on the shopclues website")
	public void i_am_on_the_shopclues_website() {
		base.launchURL();
	}

	@When("I hover over the {string}")
	public void i_hover_over_the_productCategory(String productCategory) {
		hm = new HomePage(BaseClass.driver);
		hm.clickDontAllow();
		hm.hoverOverTheProductCategory(productCategory);
	}

	@When("I click on the {string}")
	public void i_click_on_the_product(String product) {
		hm.clickOnTheProductLink(product);
	}

	@When("I click on the first product")
	public void i_click_on_the_first_product() {
		cp = new CurtainsPage(BaseClass.driver);
		cp.clickOnfirstProduct();
		cp.switchToBuyTab();
	}

	@Then("I click on the add to cart and verify that product has been added to the cart")
	public void i_click_on_the_add_to_cart_and_verify_that_product_has_been_added_to_the_cart() {
		cp.waitForInvisibilityOfPriceMessage();
		cp.clickOnAddToCart();
		cp.verifProductAddedMsg();
		base.tearDown();
	}

}
