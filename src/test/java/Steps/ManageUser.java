package Steps;
import elements.Sidebar;
import pages.*;

public class ManageUser {

    public ManageUser registerUser(String username, String email, String password) {
        new Sidebar().clickLoginBtn();
        new LoginPage().clickRegisterFormBtn();
        new RegisterPage()
                .enterUserName(username)
                .enterEmail(email)
                .enterPassword(password)
                .enterConfirmPassword(password)
                .clickRegisterSubmitBtn();
        return this;
    }

    public ManageUser login(String username, String password) {
        new Sidebar().clickLoginBtn();
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLoginSubmitBnt();
        return this;
    }

    public ManageUser logout() {
        new Sidebar().clickLogoutBtn();
        return this;
    }

    public ManageUser deleteUser(String password) {
        new Sidebar().clickProfileBtn();
        new ProfilePage()
                .clickSettingsMenuBtn()
                .clickMyAccountMenuOption();
        new DeleteAccountModule()
                .clickDeleteAccountBtn()
                .fillPasswordField(password)
                .clickSubmitBtn();
        return this;
    }
}
