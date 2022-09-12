package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage slider = new P03_homePage();

    @When("Click on first Slider")
    public void firstSlider()
    {
        slider.sliders("1").click();
    }

    @Then("assert that relative product for first slider is opened and url is changed")
    public void assertFirstSliderUrl()
    {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }

    @When("Click on second Slider")
    public void secondSlider()
    {
        slider.sliders("2").click();
    }

    @Then("assert that relative product for second slider is opened and url is changed")
    public void assertSecondSliderUrl()
    {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
    }
}
