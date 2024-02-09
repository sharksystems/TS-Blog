package pages;

import bases.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class RegisterPage extends BasePage {

    final By usernameField = By.id("user_login-742");
    final By emailField = By.id("user_email-742");
    final By passwordField = By.id("user_password-742");
    final By confirmPasswordField = By.id("confirm_user_password-742");
    final By submitBtn = By.id("um-submit-btn");
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
        $(submitBtn).click();
        return this;
    }

    public RegisterPage clickFormLoginBtn () {
        $(loginFormBtn).click();
        return this;
    }
}
