package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();


    @Given("User go to register page")
    public void goToRegisterPage ()
    {
        register.registerBtn().click();
    }

    @And("User select gender type")
    public void selectGender()
    {
        register.selectGend().click();
    }

    @And("User enter first name and last name")
    public void enterName()
    {
        register.firstName().sendKeys("automation");
        register.lastName().sendKeys("tester");
    }

    @And("User enter date of birth")
    public void enterDate()
    {
        register.dayOfBirth().selectByValue("4");
        register.monthOfBirth().selectByValue("7");
        register.yearOfBirth().selectByValue("1996");
    }

    @And("User enter email")
    public void enterEmail()
    {
        register.enterEmail().sendKeys("test@example.com");
    }

    @And("User fill password fields")
    public void enterPassword()
    {
        register.firstPassField().sendKeys("P@ssw0rd");
        register.confirmPassField().sendKeys("P@ssw0rd");
    }

    @Then("User click register")
    public void registerClick()
    {
        register.registerClick().click();
    }

    @And("Validate that registration is successes")
    public void regSoftAss()
    {
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertTrue(register.assertionRegistration().contains("Your registration completed"));
        softAssertion.assertTrue(register.assertColor().contains("rgba(76, 177, 124, 1)"));
        softAssertion.assertAll();
                
    }
}
