package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class P06_wishlist {
    public String quantity()
    {
        return Hooks.driver.findElement(By.className("qty-input")).getAttribute("value");
    }
}
