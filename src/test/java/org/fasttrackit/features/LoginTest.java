package org.fasttrackit.features;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("ramona.mo@mailinator.com","123456");
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn("Ramona Mo");
    }
}
