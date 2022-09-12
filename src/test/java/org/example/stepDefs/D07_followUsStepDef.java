package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage selectIcon = new P03_homePage();

    @When("User select facebook icon")
    public void selectFacebook() throws InterruptedException {
        selectIcon.facebook().click();
        Thread.sleep(2000);
    }

    @Then("verify that facebook tap is open")
    public void verifyFaceTap()
    {
        ArrayList<String> taps =new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(taps.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(taps.get(0));

    }

    @When("User select twitter icon")
    public void selectTwitter() throws InterruptedException {
        selectIcon.twitter().click();
        Thread.sleep(2000);
    }

    @Then("verify that twitter tap is open")
    public void verifyTwitterTap()
    {
        ArrayList<String> taps =new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(taps.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(taps.get(0));
    }

    @When("User select rss icon")
    public void selectRss() throws InterruptedException {
        selectIcon.rss().click();
        Thread.sleep(2000);
    }
    @Then("verify that rss tap is open")
    public void verifyRssTap()
    {
        ArrayList<String> taps =new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(taps.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(taps.get(0));
    }

    @When("User select youtube icon")
    public void selectYoutube() throws InterruptedException {
        selectIcon.youtube().click();
        Thread.sleep(2000);
    }
    @Then("verify that youtube tap is open")
    public void verifyYoutubeTap()
    {
        ArrayList<String> taps =new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(taps.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(taps.get(0));
    }
}
