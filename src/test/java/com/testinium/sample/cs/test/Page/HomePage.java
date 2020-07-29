package com.testinium.sample.cs.test.Page;

import com.testinium.sample.cs.test.Base.BasePage;
import org.openqa.selenium.WebDriver;

 public class HomePage extends BasePage {

     public HomePage(WebDriver driver) {
         super(driver);
         driver.get("https://www.ciceksepeti.com");
         clickByClassname("js-load-complete");
     }


 }