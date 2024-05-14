import Steps.ManageUser;
import bases.BaseTest;
import elements.Calendar;
import elements.Sidebar;
import org.testng.annotations.Test;
import pages.QuickPostPage;
import utilities.RandomUser;

import static enums.Tags.LIFESTYLE;


public class SmokeTest extends BaseTest {

    @Test
    public void registrationLogoutLogin() {
        RandomUser randomUser = new RandomUser();

        new ManageUser()
                .registerUser(randomUser.getUsername(), randomUser.getEmail(), randomUser.getPassword())
                .logout()
                .login(randomUser.getUsername(), randomUser.getPassword())
                .deleteUser(randomUser.getPassword());
    }

    @Test
    public void quickPostTest() {
        RandomUser randomUser = new RandomUser();
        ManageUser manageUser = new ManageUser();
        Sidebar sidebar = new Sidebar();

        manageUser.registerUser(randomUser.getUsername(), randomUser.getEmail(), randomUser.getPassword());
        sidebar.clickQuickPostBtn();

        new QuickPostPage()
                .enterPostTitle(faker.lorem().sentence(5))
                .enterPostContent(faker.lorem().paragraph(20))
                .clickCategorySelectField()
                .selectOption(LIFESTYLE.getName())
                .clickTagsSelectField()
                .selectOption(LIFESTYLE.getName())
                .clickPostSubmitBtn()
                .assertSuccessfulQuickPost();

        manageUser.deleteUser(randomUser.getPassword());
        sidebar.assertProfileBtnNotVisible();
    }

    @Test
    public void calendarTest() {
        Calendar calendar = new Calendar();
        calendar.navigateToDate();
    }
}
