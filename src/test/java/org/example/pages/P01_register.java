package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement selectGend()
    {
        return Hooks.driver.findElement(By.cssSelector("input[value=\"M\"]"));
    }
    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"FirstName\"]"));
    }
    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.cssSelector("input[name=\"LastName\"]"));
    }
    public Select dayOfBirth()
    {
        Select daySelect = new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]")));
        return daySelect;
    }
    public Select monthOfBirth()
    {
        Select monthSelect = new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]")));
        return monthSelect;
    }
    public Select yearOfBirth()
    {
        Select yearSelect = new Select(Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]")));
        return yearSelect;
    }
    public WebElement enterEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement firstPassField()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassField()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerClick()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public String assertionRegistration()
    {
        return Hooks.driver.findElement(By.className("result")).getText();
    }
    public String assertColor()
    {
        return Hooks.driver.findElement(By.className("result")).getCssValue("color");
    }
}
