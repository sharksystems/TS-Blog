package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage extends BasePage {

    By deleteAccountBtn = By.xpath("//a[@data-tab='delete']");
    By deleteConfirmPasswordField = By.xpath("//input[@id='single_user_password']");
    By deleteSubmitBtn = By.xpath("//input[@id='um_account_submit_delete']");

    public MyAccountPage clickDeleteAccountBtn () {
        $(deleteAccountBtn).shouldBe(enabled).click();
        return this;
    }
    public MyAccountPage enterDeleteConfirmPassword (String password) {
        $(deleteConfirmPasswordField).shouldBe(visible).sendKeys(password);
        return this;
    }
    public MyAccountPage clickDeleteSubmitBtn () {
        $(deleteSubmitBtn).shouldBe(enabled).click();
        return this;
    }
}
