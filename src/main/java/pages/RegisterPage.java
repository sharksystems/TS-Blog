package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class RegisterPage extends BasePage {

    final By usernameField = By.xpath("//input[@id='user_login-742']");
    final By emailField = By.xpath("//input[@id='user_email-742']");
    final By passwordField = By.xpath("//input[@id='user_password-742']");
    final By confirmPasswordField = By.xpath("//input[@id='confirm_user_password-742']");
    final By registerSubmitBtn = By.xpath("//input[@id='um-submit-btn'][@value='Register']");
    final By loginFormBtn = By.xpath("//a[@class='um-button um-alt' and contains(.,'Login')]");

    public RegisterPage enterUserName (String username) {
        $(usernameField).shouldBe(visible).sendKeys(username);
        return this;
    }

    public RegisterPage enterEmail (String email) {
        $(emailField).shouldBe(visible).sendKeys(email);
        return this;
    }

    public RegisterPage enterPassword (String password) {
        $(passwordField).shouldBe(visible).sendKeys(password);
        return this;
    }

    public RegisterPage enterConfirmPassword (String password) {
        $(confirmPasswordField).shouldBe(visible).sendKeys(password);
        return this;
    }

    public RegisterPage clickRegisterSubmitBtn () {
        $(registerSubmitBtn).shouldBe(visible).click();
        return this;
    }
    public RegisterPage clickFormLoginBtn () {
        $(loginFormBtn).shouldBe(visible).click();
        return this;
    }

}
