package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @FindBy(css = ".swatch-label > img")
    private WebElementFacade colorButton;

    @FindBy(css = "#swatch81 > span.swatch-label")
    private WebElementFacade sizeButton;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    public void clickColorButton() {
        clickOn(colorButton);
    }

    public void clickSizeButton() {
        clickOn(sizeButton);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
}
