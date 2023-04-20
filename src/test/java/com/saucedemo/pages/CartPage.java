package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(xpath = "//div[@class='cart_item']")
    List<WebElement> cartItem;

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public int getNumberOfProducts(){
        return cartItem.size();
    }

}
