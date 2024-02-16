package pages;

import lombok.Setter;
import org.openqa.selenium.By;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;

@Setter
public class BlogEntriesModule {

    String postDate;

    private final By blogEntryDate = By.xpath("//div[@class = 'blog-entry-date clr']");
    private final By blogEntryContent = By.xpath("//article//div[@class='blog-entry-content']");
    private final By specificBlogEntryDate = By.xpath(format("//div[@class='blog-entry-date clr'][contains(.,%s)]", postDate));

    public BlogEntriesModule assertAllPostDatesMatchSelection () {
         int datesFound = $$(blogEntryDate).size();
         int datesMatch = $$(specificBlogEntryDate).size();
        Assert.assertEquals(datesMatch, datesFound);
        return this;
    }
}
