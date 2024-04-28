package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.lang.String.format;

public class QuickPostPage {

    private final By postTitleField = By.xpath("//input[@name='postdata-1-post-title']");
    private final By postEditorFirstParagraph = By.xpath("//body[@id='tinymce']//p");
    private final By postCategorySelect = By.xpath("//div[@class = 'forminator-field' and contains(.,'Category *')]//span[@class = 'selection']");
    private final By postTagsSelect = By.xpath("//div[@class = 'forminator-field' and contains(.,'Tags *')]//span[@class = 'selection']");
    private final By postSubmitBtn = By.xpath("//button[@class='forminator-button forminator-button-submit']");
    private final By postSubmitSuccessMsg = By.xpath("//div[@class = 'forminator-response-message forminator-show forminator-success']");

    private final SelenideElement editorFrame = $(By.xpath("//iframe"));

    public QuickPostPage enterPostTitle (String title) {
        $(postTitleField).shouldBe(visible).sendKeys(title);
        return this;
    }
    public QuickPostPage enterPostContent (String content) {
        switchTo().frame(editorFrame);
        $(postEditorFirstParagraph).shouldBe(visible).sendKeys(content);
        switchTo().defaultContent();
        return this;
    }
    public QuickPostPage clickCategorySelectField () {
        $(postCategorySelect).shouldBe(visible).click();
        return this;
    }
    public QuickPostPage clickTagsSelectField () {
        $(postTagsSelect).shouldBe(visible).click();
        return this;
    }
    public QuickPostPage selectOption (String option) {
        $(By.xpath(format("//li[@role='option' and contains(.,'%s')]", option))).click();
        return this;
    }
    public QuickPostPage clickPostSubmitBtn () {
        $(postSubmitBtn).shouldBe(visible).click();
        return this;
    }
    public QuickPostPage assertSuccessfulQuickPost () {
        $(postSubmitSuccessMsg).shouldBe(visible);
        return this;
    }

}
