package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.OrderPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps {


    @Step
    public void navigateToCart(){
        homePage.clickOnCartIcon();
        homePage.clickOnViewShoppingCartLink();

    }

    @Step
    public void clickAddProductToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void navigateToCheckoutPage() {
        cartPage.clickProceedToCheckout();
    }

    @Step
    public void prepareOrder() {
        checkoutPage.clickShipToThisAddressButton();
        checkoutPage.clickAddressContinueButton();
        checkoutPage.clickFreeShippingButton();
        checkoutPage.clickShoppingContinueButton();
        checkoutPage.clickCashOnDeliveryContinueButton();
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void checkPrepareOrder(String expected) {
        String message = orderPage.getOrderConfirmationMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }
}
