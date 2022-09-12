package org.example.pages;

import org.example.stepDefs.D05_hoverStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {

    public Select currencies()
    {
        Select euro = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        return euro;
    }
    public List<WebElement> euroSymbolAssertion()
    {
        List<WebElement> euro_Symbol = Hooks.driver.findElements(By.className("actual-price"));
        return euro_Symbol;
    }

    public List<WebElement> mainCat()
    {
        List<WebElement> mainCat = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li"));
        return mainCat;
    }

    public List<WebElement> subCategories1()
    {
        List<WebElement> subCat1= Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//ancestor::a[@href=\"/computers\"]//ancestor::li//ancestor::a"));
        return subCat1;
    }
    public List<WebElement> subCategories2()
    {
        List<WebElement> subCat= Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//ancestor::a[@href=\"/electronics\"]//ancestor::li//ancestor::a"));
        return subCat;
    }
    public List<WebElement> subCategories3()
    {
        List<WebElement> subCat= Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//ancestor::a[@href=\"/apparel\"]//ancestor::li//ancestor::a"));
        return subCat;
    }

    public WebElement facebook()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitter()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rss()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtube()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public List<WebElement> htcWishlist()
    {
        List<WebElement> htc = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        return htc;
    }
    public WebElement successMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlistButton()
    {
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement sliders(String num)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }
}
