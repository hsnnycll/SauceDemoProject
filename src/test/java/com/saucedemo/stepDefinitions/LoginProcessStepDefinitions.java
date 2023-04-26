package com.saucedemo.stepDefinitions;

import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginProcessStepDefinitions extends BaseStep{

    @Given("the user is on the login page")
    public void user_is_on_the_login_page(){
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        BrowserUtils.wait(1);
    }

    @When("the user enters username {string}")
    public void user_enters_username(String usernameValue){
        pages.loginPage().setUsernameInputBox(usernameValue);
    }

    @When("the user enters password {string}")
    public void user_enters_password(String passwordValue){
        pages.loginPage().setPasswordInputBox(passwordValue);
    }

    @When("the user clicks on the login")
    public void user_clicks_loginButton(){
        pages.loginPage().clickLoginButton();
    }

    @Then("the user should be logged in")
    public void user_should_be_logged_in(){
        BrowserUtils.wait(1);
        assertEquals(pages.productsPage().getCurrentURL(), "https://www.saucedemo.com/inventory.html");
    }


    @Then("the user should not be able to login and see error message {string}")
    public void user_should_not_be_able_to_login_and_see_error_message(String errorMessage){
        assertEquals(pages.loginPage().getErrorMessage(), errorMessage);
    }
}
