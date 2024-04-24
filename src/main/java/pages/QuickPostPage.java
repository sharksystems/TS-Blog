package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class QuickPostPage {

    final By postTitleField = By.xpath("//input[@name='postdata-1-post-title']");
    final By postEditorFirstParagraph = By.xpath("//body[@id='tinymce']//p");
    final By postCategorySelect = By.xpath("//div[@class = 'forminator-field' and contains(.,'Category *')]//select");
    final By postTagsSelect = By.xpath("//div[@class = 'forminator-field' and contains(.,'Tags *')]//select");
    final By postSubmitBtn = By.xpath("//button[@class='forminator-button forminator-button-submit']");

    SelenideElement editorFrame = $(By.xpath("//iframe"));

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
    public QuickPostPage selectPostCategory (String category) {
        $(postCategorySelect).shouldBe(visible).selectOptionContainingText(category);
        return this;
    }
    public QuickPostPage selectPostTags (String tag) {
        $(postTagsSelect).shouldBe(visible).selectOptionContainingText(tag);
        return this;
    }
    public QuickPostPage clickPostSubmitBtn () {
        $(postSubmitBtn).shouldBe(visible).click();
        return this;
    }

}
