package com.saucedemo.pages;

import com.saucedemo.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInputBox;

    @FindBy(id = "password")
    private WebElement passwordInputBox;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessageElement;

    public void setUsernameInputBox(String username){
        usernameInputBox.sendKeys(username);
    }

    public void setPasswordInputBox(String password){
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public void login(){
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");
        usernameInputBox.sendKeys(usernameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }
}
