package com.saucedemo.stepDefinitions;

import com.saucedemo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class AddToCartProcessStepDefinitions extends BaseStep{

    @Given("the user logged in with valid credentials")
    public void user_logged_in_with_valid_credentials(){
        pages.loginPage().login();
    }

    @Given("the user is on the products page")
    public void user_is_on_the_products_page(){
        BrowserUtils.wait(1);
        assertEquals(pages.productsPage().getCurrentURL(), "https://www.saucedemo.com/inventory.html");
    }

    @When("the user add the {int} product to cart")
    public void user_add_the_product_to_cart(int productOrder){
        pages.productsPage().selectOneOfTheProducts(productOrder);
    }

    @When("the user click on cart symbol and go to cart page")
    public void user_click_on_cart_symbol_and_go_to_cart_page(){
        pages.productsPage().clickShoppingCart();
    }

    @Then("the user should verify that {int} product is displayed")
    public void user_should_verify_that_product_is_displayed(int quantity){
        assertEquals(pages.cartPage().getNumberOfProducts(), quantity);
    }

    @When("the user click on checkout button")
    public void user_click_on_checkout_button(){
        pages.cartPage().clickCheckoutButton();
    }

    @When("the user enters informations: First Name {string}, Last Name {string}, Zip Code {string}")
    public void user_enters_information(String firstName, String lastName, String zip) {
        pages.checkoutPage().setFirstNameBox(firstName);
        pages.checkoutPage().setLastNameBox(lastName);
        pages.checkoutPage().setPostalCodeBox(zip);
    }

    @Then("the user click on continue button")
    public void user_click_on_continue_button(){
        pages.checkoutPage().clickContinueButton();
    }

    @Then("the user click on finish button")
    public void user_click_on_finish_button(){
        pages.checkoutPage().clickFinishButton();
    }

    @When("the user verify the complete order message {string}")
    public void user_enters_address_information(String completeMessage){
        assertEquals(pages.checkoutPage().getHeadOfCompleteOrder(), completeMessage);
    }

}
