package com.saucedemo.utilities;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;

public class Pages {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    public Pages() {
        this.loginPage = new LoginPage();
        this.productsPage = new ProductsPage();
        this.cartPage = new CartPage();
        this.checkoutPage = new CheckoutPage();
    }

    public LoginPage loginPage() {
        return loginPage;
    }

    public ProductsPage productsPage() {
        return productsPage;
    }

    public CartPage cartPage() {
        return cartPage;
    }

    public CheckoutPage checkoutPage() {
        return checkoutPage;
    }
}
