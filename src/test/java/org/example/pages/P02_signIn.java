package org.example.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_signIn {

    public WebElement loginPage()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailField()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement PasswordField()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn()
    {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public String getUrl()
    {
        return Hooks.driver.getCurrentUrl();
    }
    public boolean myAccount()
    {
        return Hooks.driver.findElement(By.className("ico-account")).isDisplayed();
    }
    public WebElement unSuccessesMassage()
    {
        return Hooks.driver.findElement(By.className("message-error"));
    }


}
