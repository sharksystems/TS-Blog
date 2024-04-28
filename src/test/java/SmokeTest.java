
import Steps.ManageUser;
import bases.BaseTest;
import elements.Calendar;
import elements.Sidebar;
import enums.Categories;
import enums.Tags;
import org.testng.annotations.Test;
import pages.*;
import utilities.RandomContent;
import utilities.RandomUser;


public class SmokeTest extends BaseTest {

    @Test
    public void registrationLogoutLogin() {

        ManageUser manageUser = new ManageUser();
        manageUser.registerUser();
        manageUser.logout();
        manageUser.login();
        manageUser.deleteUser();
    }

    @Test
    public void quickPostTest() {

        ManageUser manageUser = new ManageUser();
        Sidebar sidebar = new Sidebar();
        var content = new RandomContent();

        manageUser.registerUser();

        sidebar.clickQuickPostBtn();

        new QuickPostPage()
                .enterPostTitle(content.getPostTitle())
                .enterPostContent(content.getPostContent())
                .clickCategorySelectField()
                .selectOption(Categories.LIFESTYLE.getName())
                .clickTagsSelectField()
                .selectOption(Tags.LIFESTYLE.getName())
                .clickPostSubmitBtn()
                .assertSuccessfulQuickPost();

        manageUser.deleteUser();
        sidebar.assertProfileBtnNotVisible();

    }

    @Test
    public void calendarTest () {
        Calendar calendar = new Calendar();
        calendar.navigateToDate();
    }
}
