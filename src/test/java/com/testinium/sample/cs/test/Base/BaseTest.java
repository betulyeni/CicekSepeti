package com.testinium.sample.cs.test.Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {


    protected WebDriver driver;

    @Before
    public void hazirla(){
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void bitir() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}