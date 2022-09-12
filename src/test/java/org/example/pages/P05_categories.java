package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_categories {

    public WebElement pageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}
