package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {

    public ProductPage productPage;
    public LoginPage loginPage;
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public SearchResultsPage searchResultsPage;
    public OrderPage orderPage;

    @Step
    public void navigateToAdminHomePage() {
        getDriver().get(EnvConstants.ADMIN_BASE_URL);
    }

    @Step
        public void navigateToHomePage(){
            getDriver().get(EnvConstants.BASE_URL);
    }
}
