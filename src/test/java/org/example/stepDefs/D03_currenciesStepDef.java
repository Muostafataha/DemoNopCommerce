package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {

    P03_homePage currencies = new P03_homePage();
    @Then("User select Euro currency from dropdown list")
    public void selectEuro()
    {
        currencies.currencies().selectByVisibleText("Euro");
    }
    @And("verify euro symbol is shown in 4 product in display")
    public void verifyEuroSymbol()
    {

        for (WebElement i : currencies.euroSymbolAssertion())
        {
            Assert.assertTrue(i.getText().contains("€"));
            //System.out.println(i.getText());
        }

    }
}
