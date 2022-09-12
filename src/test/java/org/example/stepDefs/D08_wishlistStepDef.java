package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P06_wishlist;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.print.attribute.SetOfIntegerSyntax;
import java.awt.*;
import java.time.Duration;

public class D08_wishlistStepDef {
    P03_homePage wishlist = new P03_homePage();
    P06_wishlist quantity_w = new P06_wishlist();

    @When("user click the wishlist button for HTC")
    public void htcWishlist() throws InterruptedException {
        wishlist.htcWishlist().get(2).click();
        Thread.sleep(500);
    }

    @Then("verify that success message is appear")
    public void successMessageSoft()
    {
        SoftAssert successAssertion = new SoftAssert();
        successAssertion.assertTrue(wishlist.successMessage().getText().contains("The product has been added to your "));
        String color = wishlist.successMessage().getCssValue("background-color");
        String colorHex = Color.fromString(color).asHex();
        successAssertion.assertEquals(colorHex,"#4bb07a");
        successAssertion.assertAll();
    }

    @And("click on wishlist button after successes message is disappear")
    public void wishlistButton()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(wishlist.successMessage()));
        wishlist.wishlistButton().click();

    }

    @Then("check that the quantity is bigger than 0")
    public void verifyQuantity()
    {
        int quantityInt = Integer.parseInt(quantity_w.quantity());
        Assert.assertTrue(quantityInt>0);
    }
}
