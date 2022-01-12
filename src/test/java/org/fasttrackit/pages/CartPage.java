package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade cartMessageParagraph;

    @FindBy(css = ".cart-totals-wrapper button > span > span")
    private WebElementFacade proceedToCheckoutButton;

    public String getCartMessageParagraph() {
        return cartMessageParagraph.getText();
    }
    public void clickProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }


}
