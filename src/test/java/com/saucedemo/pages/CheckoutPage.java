package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(id = "first-name")
    private WebElement firstNameBox;

    @FindBy(id = "last-name")
    private WebElement lastNameBox;

    @FindBy(id = "postal-code")
    private WebElement postalCodeBox;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    private WebElement headOfCompleteOrder;

    public void setFirstNameBox(String firstName){
        firstNameBox.sendKeys(firstName);
    }

    public void setLastNameBox(String lastName){
        lastNameBox.sendKeys(lastName);
    }

    public void setPostalCodeBox(String postalCode){
        postalCodeBox.sendKeys(postalCode);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickFinishButton(){
        finishButton.click();
    }

    public String getHeadOfCompleteOrder(){
        return headOfCompleteOrder.getText();
    }
}
