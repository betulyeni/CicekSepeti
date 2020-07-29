package com.testinium.sample.cs.test;

import com.testinium.sample.cs.test.Base.BaseTest;
import com.testinium.sample.cs.test.Page.HomePage;
import com.testinium.sample.cs.test.Page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class CicekSepetiTest extends BaseTest {
@Test
    public void  test(){
    new HomePage(driver);
    new LoginPage(driver).login("bet***@outlook.com","******");
    new HomePage(driver).search("papatya");}
    @Test
    public void searchTest(){

        new HomePage(driver)
                .callLoginPage()
                .login("bet***@outlook.com","******")
                .search("papatya")
                .selectProductByIndex(0);
    }
}

