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
    private final By adminSiteBtn = By.xpath("//li[@id = 'wp-admin-bar-site-name']");

    public Sidebar clickProfileBtn() {
        $(profileBtn).shouldBe(visible).click();
        return this;
    }

    public Sidebar clickRegisterBtn() {
        $(registerBtn).click();
        return this;
    }

    public Sidebar clickLoginBtn() {
        $(loginBtn).shouldBe(visible).click();
        return this;
    }

    public Sidebar clickQuickPostBtn() {
        $(quickPostBtn).shouldBe(visible).click();
        return this;
    }

    public Sidebar clickLogoutBtn() {
        $(logoutBtn).shouldBe(visible).click();
        return this;
    }
    public Sidebar clickAdminBtn() {
        $(adminSiteBtn).shouldBe(visible).click();
        return this;
    }

    public Sidebar assertProfileBtnNotVisible() {
        Assert.assertFalse($(profileBtn).isDisplayed());
        return this;
    }
}
