package Steps;
import elements.Sidebar;
import pages.*;
import utilities.RandomUser;

public class ManageUser {

    String username;
    String email;
    String password;

    public ManageUser () {
        var user = new RandomUser();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public void registerUser () {

        new Sidebar().clickLoginBtn();
        new LoginPage().clickRegisterFormBtn();
        new RegisterPage()
                .enterUserName(username)
                .enterEmail(email)
                .enterPassword(password)
                .enterConfirmPassword(password)
                .clickRegisterSubmitBtn();
    }

    public void login () {

        new Sidebar().clickLoginBtn();
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLoginSubmitBnt();
    }

    public void logout () {
        new Sidebar().clickLogoutBtn();
    }

    public void deleteUser () {
        new Sidebar().clickProfileBtn();
        new ProfilePage()
                .clickSettingsMenuBtn()
                .clickMyAccountMenuOption();
        new DeleteAccountModule()
                .clickDeleteAccountBtn()
                .fillPasswordField(password)
                .clickSubmitBtn();
    }

}
