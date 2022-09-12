package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_search {

    public WebElement searchFiled()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }
    public List<WebElement> countProd()
    {
        List<WebElement> productCount = Hooks.driver.findElements(By.className("product-item"));
        return productCount;
    }
    public List<WebElement> verifySearchResult()
    {
        List<WebElement> searchResult = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
        return searchResult ;
    }
    public WebElement productRes()
    {
        return Hooks.driver.findElement(By.className("product-item"));
    }
    public WebElement skuAssertion()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
    }
}
