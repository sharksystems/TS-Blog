
import bases.BaseTest;
import com.codeborne.selenide.Selenide;
import elements.Calendar;
import elements.Sidebar;
import org.testng.annotations.Test;
import pages.*;
import utilities.RandomUser;


public class SmokeTest extends BaseTest {
    Sidebar sidebar = new Sidebar();

    @Test
    public void registrationLogoutLogin() {
        var user = new RandomUser();

        sidebar.clickLoginBtn();

        new LoginPage().clickRegisterFormBtn();

        new RegisterPage()
                .enterUserName(user.getUsername())
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword())
                .enterConfirmPassword(user.getPassword())
                .clickRegisterSubmitBtn();

        sidebar.clickLogoutBtn()
                .clickLoginBtn();

        new LoginPage()
                .enterUsername(user.getUsername())
                .enterPassword(user.getPassword())
                .clickLoginSubmitBnt();

        sidebar.clickProfileBtn();

        new ProfilePage()
                .clickSettingsMenuBtn()
                .clickMyAccountMenuOption();

        new DeleteAccountModule()
                .clickDeleteAccountBtn()
                .fillPasswordField(user.getPassword())
                .clickSubmitBtn();

        sidebar.assertProfileBtnNotVisible();
    }
    @Test
    public void calendarTest () {
        Calendar calendar = new Calendar();
        calendar.navigateToDate();
    }
}
