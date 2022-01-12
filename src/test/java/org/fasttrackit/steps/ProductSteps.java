package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.OrderPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class ProductSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;



    @Step
    public void addProductToCart() {
        productPage.clickColorButton();
        productPage.clickSizeButton();
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkAddToCart(String expected) {
        String message = cartPage.getCartMessageParagraph();
        Assert.assertEquals(expected, message);
}}
