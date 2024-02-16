package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    final By usernameField = By.id("username-743");
    final By passwordField = By.id("user_password-743");
    final By loginBtn = By.xpath("//input[@id='um-submit-btn'][@value = 'Login']");
    final By registerFormBtn = By.xpath("//a[@class='um-button um-alt' and contains(.,'Register')]");

    public LoginPage enterUsername (String username) {
        $(usernameField).shouldBe(visible).sendKeys(username);
        return this;
    }
    public LoginPage enterPassword (String password) {
        $(passwordField).shouldBe(visible).sendKeys(password);
        return this;
    }
    public void clickLoginSubmitBnt (){
        $(loginBtn).shouldBe(enabled).click();
    };
    public LoginPage clickRegisterFormBtn (){
        $(registerFormBtn).shouldBe(enabled).click();
        return this;
    };

}
