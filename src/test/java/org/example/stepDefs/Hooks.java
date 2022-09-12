package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public static void OpenBrowser()
    {
        //bridge
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        driver = new ChromeDriver();

        //browser configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // navigate to url
        driver.get("https://demo.nopcommerce.com/");

    }

    @After
    public static void exitBrowser() throws InterruptedException {
        //quit Browser
        Thread.sleep(3000);
        driver.quit();
    }

}
