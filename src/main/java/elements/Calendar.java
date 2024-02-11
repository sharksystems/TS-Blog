package elements;

import org.openqa.selenium.By;
import pages.BlogEntriesModule;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static utilities.DateFormat.*;

public class Calendar {
    /*
     Locale format : 01-08-2016
     Calendar heading format: August 2016
     Post Format: August 1, 2016
     */

    LocalDate date = LocalDate.of(2016, 8, 1);
    String monthYear = date.format(MMMM_YYYY);
    String day = date.format(D);
    String monthDayYear = date.format(MMMM_D_YYYY);

    By calendarHeadingDate = By.xpath("//table[@id ='wp-calendar']//caption");
    By calendarDayBtn = By.xpath(String.format("(//table[@id ='wp-calendar']//td[contains(., %s)])[1]", day));
    By calendarNextBtn = By.xpath("//span[@class = 'wp-calendar-nav-next']");
    By calendarPrevBtn = By.xpath("//span[@class = 'wp-calendar-nav-prev']");

    public Calendar clickNextBtn () {
        $(calendarNextBtn).click();
        return this;
    }
    public Calendar clickPrevBtn () {
        $(calendarPrevBtn).shouldBe(visible).click();
        return this;
    }
    public Calendar clickDayBtn () {
        $(calendarDayBtn).click();
        return this;
    }
    public Calendar scrollToCalendar () {
        $(calendarPrevBtn).scrollTo();
        return this;
    }

    public Calendar countAndComparePosts () {
        BlogEntriesModule blogEntriesModule = new BlogEntriesModule();
        blogEntriesModule.setPostDate(monthDayYear);
        blogEntriesModule.assertAllPostDatesMatchSelection();
        return this;
    }

    String calendarDate = $(calendarHeadingDate).innerText();
    YearMonth calendarYearMonth = YearMonth.parse(calendarDate, MMMM_YYYY);
    Month calendarMonth = calendarYearMonth.getMonth();
    int calendarYear = calendarYearMonth.getYear();
    LocalDate parsedCalendarDate = LocalDate.of(calendarYear, calendarMonth, 1);

    public Calendar navigateToDate () {

        boolean dateMatch = false;
        while (!dateMatch) {

            if (date.isBefore(parsedCalendarDate)) {
                clickPrevBtn();
            } else if (date.isAfter(parsedCalendarDate)) {
                clickNextBtn();
            } else {
                dateMatch = true;
                clickDayBtn();
                countAndComparePosts();
            }
            // Update calendarDate after each button click
            this.calendarDate = $(calendarHeadingDate).innerText();
            this.calendarYearMonth = YearMonth.parse(calendarDate, MMMM_YYYY);
            this.calendarMonth = calendarYearMonth.getMonth();
            this.calendarYear = calendarYearMonth.getYear();
            this.parsedCalendarDate = LocalDate.of(calendarYear, calendarMonth, 1);
            }
        return this;
    }
}
