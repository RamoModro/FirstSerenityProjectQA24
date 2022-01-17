package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".category-products > .toolbar select[title^=Sort]")
    private WebElementFacade dropDown_SortBy;

    @FindBy(css = ".products-grid .item .price:not([id*='old']")
    private List<WebElementFacade> listOfProductsPrice;


    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }

    public void selectDropDownValue(){
        dropDown_SortBy.selectByVisibleText("Price");
    }

    public boolean isPriceAscending(){
        return getIntFromPrice(listOfProductsPrice.get(0).getText())
                <getIntFromPrice(listOfProductsPrice.get(listOfProductsPrice.size()-1).getText());

    }
}


