package pages;

import bases.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends BasePage {

    By settingsMenuBtn = By.xpath("//i[@class = 'um-faicon-cog']");
    By myAccountMenuOption = By.xpath("//a[@class = 'real_url' and contains (., 'My Account')]");

    public ProfilePage clickSettingsMenuBtn () {
        $(settingsMenuBtn).shouldBe(visible).click();
        return this;
    }
    public ProfilePage clickMyAccountMenuOption () {
        $(myAccountMenuOption).shouldBe(visible).click();
        return this;
    }
}
