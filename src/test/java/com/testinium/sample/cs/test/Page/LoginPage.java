package com.testinium.sample.cs.test.Page;
import com.testinium.sample.cs.test.Base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public HomePage login(String username, String password){
            clickByXpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/a/span[1]");
            clickByXpath("/html/body/div[4]/div[1]/div/div[2]/div[2]/nav/ul/li[2]/div/div/ul/li[1]/a");
            setById("EmailLogin", username);
            setById("Password", password);
            clickByXpath("/html/body/main/div/div[1]/div/form[1]/div[6]/button");
            return new HomePage(driver);
        }


}
