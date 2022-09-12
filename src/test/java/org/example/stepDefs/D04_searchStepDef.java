package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P04_search;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef {
    P04_search search = new P04_search();

    @Given("^user enter \"([^\"]*)\" in search par$")
    public void enterProductName(String product_name)
    {
        search.searchFiled().sendKeys(product_name);
        search.searchButton().click();
    }

    @Then("verify the url")
    public void verifyUrl ()
    {
        SoftAssert verifyUrlSoft = new SoftAssert();
        verifyUrlSoft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        verifyUrlSoft.assertAll();
    }

    @And("Find number of product in search page")
    public void cuntNumOfProd()
    {
        int Size = search.countProd().size();
        System.out.println(Size);
    }

    @And("^verify that the search result contain \"([^\"]*)\"$")
    public void verifySearchRes(String product_name)
    {
        SoftAssert SearchResSoft = new SoftAssert();
        for (WebElement i : search.verifySearchResult())
        {
            SearchResSoft.assertTrue(i.getText().toLowerCase(Locale.ROOT).contains(product_name));
            SearchResSoft.assertAll();
            System.out.println(i.getText());
        }

    }

    @Given("^user enter \"([^\"]*)\" for product in search par$")
    public void enterProductSku(String product_sku)
    {
        search.searchFiled().sendKeys(product_sku);
        search.searchButton().click();
    }

    @Then("select product from search result")
    public void productResultSelect()
    {
        search.productRes().click();
    }

    @And("^verify that the \"([^\"]*)\" is appear in product page$")
    public void skuAssertion(String product_sku)
    {
        Assert.assertTrue(search.skuAssertion().getText().contains(product_sku));
    }

}
