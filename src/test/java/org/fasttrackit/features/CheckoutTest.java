package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class CheckoutTest extends BaseTest{

    @Test
    public void placeOrder(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        cartSteps.navigateToCheckoutPage();
        cartSteps.prepareOrder();
        cartSteps.checkPrepareOrder("THANK YOU FOR YOUR PURCHASE!");
    }
}

