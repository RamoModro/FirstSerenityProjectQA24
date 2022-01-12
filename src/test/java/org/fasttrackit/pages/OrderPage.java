package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrderPage extends PageObject {

    @FindBy(css = ".sub-title")
    private WebElementFacade confirmOrderMessage;

    public String getOrderConfirmationMessage() {
        return confirmOrderMessage.getText();
    }
}
