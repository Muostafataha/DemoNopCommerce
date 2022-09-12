package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.example.pages.P05_categories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

 public class D05_hoverStepDef {
     WebElement category ;
     String subCategory;
     P03_homePage hover = new P03_homePage();
     P05_categories getPageTitle = new P05_categories();

    @Given("mouse hover at random main categories")
    public void hoverMainCat() throws InterruptedException {
        Random random = new Random();
        int index = random.nextInt(2);
        category = hover.mainCat().get(index);

        Actions mouseHover = new Actions(Hooks.driver);
        mouseHover.moveToElement(category).perform();
        //System.out.println(category.getText());
        Thread.sleep(1000);
    }

    @Then("Select random sub categories")
    public void selectRandomSubCat(){
        List<WebElement> sub = null;
        if (category.getText().contains("Computers"))
        {
            sub = hover.subCategories1();
        }
        else if (category.getText().contains("Electronics"))
        {
            sub = hover.subCategories2();
        }
        else if (category.getText().contains("Apparel"))
        {
            sub = hover.subCategories3();
        }

        int size = sub.size();
        Random random = new Random();
        int index = random.nextInt(size);
        WebElement sub_cat ;

        if(index == 0)
        {
            sub_cat = sub.get(1);
        }
        else
        {
            sub_cat = sub.get(index);
        }
        subCategory = sub_cat.getText();
        System.out.println(subCategory);
        sub_cat.click();
    }

    @And("verify that the page title is opened equal the sub category is selected")
     public void assertionPageTitle()
    {
        Assert.assertTrue(getPageTitle.pageTitle().getText().contains(subCategory));
    }

}
