package elements;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Sidebar {
    private final By profileBtn = By.xpath("//span[@class='text-wrap'][contains(.,'Profile')]");
    private final By loginBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Login')]");
    private final By registerBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Register')]");
    private final By quickPostBtn = By.xpath("//span[@class='text-wrap' and contains(.,'Quick Post')]");
    private final By logoutBtn = By.xpath("//span[@class='text-wrap'][contains(.,'Logout')]");
    private final By adminSiteBtn = By.id("wp-admin-bar-site-name");

    public void clickProfileBtn() {
        $(profileBtn).shouldBe(visible).click();
    }

    public void clickRegisterBtn() {
        $(registerBtn).click();
    }

    public void clickLoginBtn() {
        $(loginBtn).shouldBe(visible).click();
    }

    public void clickQuickPostBtn() {
        $(quickPostBtn).shouldBe(visible).click();
    }

    public void clickLogoutBtn() {
        $(logoutBtn).shouldBe(visible).click();
    }
    public void clickAdminBtn() {
        $(adminSiteBtn).shouldBe(visible).click();
    }

    public void assertProfileBtnNotVisible() {
        Assert.assertFalse($(profileBtn).isDisplayed());
    }
}
