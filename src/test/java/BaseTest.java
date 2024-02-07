import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class BaseTest {

    @BeforeMethod
    public void openDriver () {
        Driver.startDriver();
    }

    @AfterMethod
    public void closeDriver () {
        Driver.tearDownDriver();
    }

}
