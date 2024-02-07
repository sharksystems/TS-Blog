package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    final By profileBtn = By.xpath("//span[@class='text-wrap'][contains(.,'Profile')]");
    final By loginBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Login')]");
    final By registerBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Register')]");
    final By quickPostBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Quick Post')]");
    final By logoutBtn = By.xpath("//span[@class='text-wrap'][contains(.,'Logout')]");


    public BasePage clickProfileBtn () {
        $(profileBtn).shouldBe(visible).click();
        return this;
    }
    public BasePage clickRegisterBtn () {
        $(registerBtn).click();
        return this;
    }
    public BasePage clickLoginBtn () {
        $(loginBtn).shouldBe(visible).click();
        return this;
    }
    public BasePage clickQuickPostBtn () {
        $(quickPostBtn).shouldBe(visible).click();
        return this;
    }
    public BasePage clickLogoutBtn () {
        $(logoutBtn).shouldBe(visible).click();
        return this;
    }
    public BasePage assertProfileBtnNotVisible () {
        Assert.assertFalse($(profileBtn).isDisplayed());
        return this;
    }



}
