package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_signIn;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class D02_signInStepDef {
    P02_signIn login_Page = new P02_signIn();


    // valid data
    @Given("user go to login page")
    public void loginPage()
    {
        login_Page.loginPage().click();
    }

    @And("user login with valid email and password")
    public void validEmail()
    {
        login_Page.emailField().sendKeys("test@example.com");
        login_Page.PasswordField().sendKeys("P@ssw0rd");
    }

    @Then("user press on login button")
    public void loginBtn()
    {
        login_Page.loginBtn().click();
    }
    @And("verify signIn successes")
    public void verifyLoginSuccesses()
    {
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals(login_Page.getUrl(),"https://demo.nopcommerce.com/");
        softAssertion.assertTrue(login_Page.myAccount());
        softAssertion.assertAll();
    }

    @And("user login with Invalid email and password")
    public void inValidEmail()
    {
        login_Page.emailField().sendKeys("invalid@gmail.com");
        login_Page.PasswordField().sendKeys("invalid");
    }

    @And("verify signIn is not successes")
    public void verifyLoginFail()
    {
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertTrue(login_Page.unSuccessesMassage().getText().contains("Login was unsuccessful"));
        String color = login_Page.unSuccessesMassage().getCssValue("color");
        String colorHex = Color.fromString(color).asHex();
        softAssertion.assertTrue(colorHex.contains("#e4434b"));
        softAssertion.assertAll();
    }
}
