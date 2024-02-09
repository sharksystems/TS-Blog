package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DeleteAccountModule {

    By deleteAccountBtn = By.xpath("//a[@data-tab='delete']");
    By deleteConfirmPasswordField = By.xpath("//input[@id='single_user_password']");
    By deleteSubmitBtn = By.xpath("//input[@id='um_account_submit_delete']");

    public DeleteAccountModule clickDeleteAccountBtn () {
        $(deleteAccountBtn).shouldBe(enabled).click();
        return this;
    }
    public DeleteAccountModule fillPasswordField (String password) {
        $(deleteConfirmPasswordField).shouldBe(visible).sendKeys(password);
        return this;
    }
    public DeleteAccountModule clickDeleteSubmitBtn () {
        $(deleteSubmitBtn).shouldBe(enabled).click();
        return this;
    }
}
