package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{

  @Test
public void searchForProductTest(){
  loginSteps.navigateToHomePage();
  searchSteps.executeSearch("necklace");
  searchSteps.findAndOpenProduct("Silver Desert Necklace");
  searchSteps.executeSearch("necklace");
  searchSteps.findAndOpenProduct("LUDLOW SHEATH DRESS");
    }

    @Test
  public void searchByPriceTest(){
    loginSteps.navigateToHomePage();
    searchSteps.executeSearch("vase");
    searchSteps.sortProductByPrice();
    }
}
