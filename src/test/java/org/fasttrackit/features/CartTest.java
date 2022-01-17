package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{

        @Test
        public void addToCartTest(){
            loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
            searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
            cartSteps.clickAddProductToCart();
    }

    @Test
    public void checkCartTotalSummaryTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("HERALD GLASS VASE");
        cartSteps.clickAddProductToCart();
        searchSteps.searchAndSelectProduct("SWING TIME EARRINGS");
        cartSteps.clickAddProductToCart();
        cartSteps.navigateToCart();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();

    }
}
