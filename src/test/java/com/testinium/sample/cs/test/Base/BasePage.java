package com.testinium.sample.cs.test.Base;

import com.testinium.sample.cs.test.Page.HomePage;
import com.testinium.sample.cs.test.Page.LoginPage;
import com.testinium.sample.cs.test.Page.ProductListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public ProductListPage search(String keyword){
        setByXpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div/input", keyword);
        clickByXpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div/div[3]/a");

        return new ProductListPage(driver);

    }
    public LoginPage callLoginPage(){
        clickByClassname("profile-name");
        return new LoginPage(driver);
    }

    public HomePage callHomePage(){
        driver.get("https://www.ciceksepeti.com");
        return new HomePage(driver);
    }

    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }
    public void setByXpath(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(id)));
        element.clear();
        element.sendKeys(value);
    }


    public void clickByClassname(String classname){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        driver.findElement(By.className(classname)).click();
    }

    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@id, 'item-info-block')]"))));
    }

    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }
}
