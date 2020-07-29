package com.testinium.sample.cs.test.Page;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductListPage {
    public ProductListPage(WebDriver driver) {
    }
    public void selectProductByIndex(Integer index){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       //getElementsByXpath("//*[contains(@id, 'item-info-block')]").get(index).click();

    }


}
