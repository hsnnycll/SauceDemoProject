package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//button[contains(@id, 'add-to-cart')]")
    private List<WebElement> addToCartButtonElements;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCart;


    public void selectOneOfTheProducts(int productOrder){
        addToCartButtonElements.get(productOrder).click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }

    public String getCurrentURL(){
        return Driver.getDriver().getCurrentUrl();
    }

}
