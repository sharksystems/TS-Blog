
import org.testng.annotations.Test;
import pages.*;
import utilities.RandomUser;


public class SmokeTest extends BaseTest {

    @Test
    public void registrationLogoutLogin () {

        RandomUser user = new RandomUser();

        HomePage homePage = new HomePage();
        homePage.clickLoginBtn();
        new LoginPage().clickRegisterFormBtn();
        new RegisterPage()
                .enterUserName(user.getUsername())
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword())
                .enterConfirmPassword(user.getPassword())
                .clickRegisterSubmitBtn()
                .clickLogoutBtn();
        homePage.clickLoginBtn();
        new LoginPage()
                .enterUsername(user.getUsername())
                .enterPassword(user.getPassword())
                .clickLoginSubmitBnt();
        homePage.clickProfileBtn();
        new ProfilePage()
                .clickSettingsMenuBtn()
                .clickMyAccountMenuOption();
        new MyAccountPage()
                .clickDeleteAccountBtn()
                .enterDeleteConfirmPassword(user.getPassword())
                .clickDeleteSubmitBtn()
                .assertProfileBtnNotVisible();

    }

}
