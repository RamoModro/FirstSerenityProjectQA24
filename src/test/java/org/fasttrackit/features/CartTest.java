package org.fasttrackit.features;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.junit.Test;

public class CartTest extends BaseTest{

        @Test
        public void addToCartTest(){
            loginSteps.doLogin("cosmin@fasttrackit.org","123456");
            searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
            cartSteps.clickAddProductToCart();
    }}
