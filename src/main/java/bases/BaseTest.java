package bases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import drivers.Driver;

public abstract class BaseTest {

    @BeforeMethod
    public void openDriver () {
        Driver.startDriver();
    }

    @AfterMethod
    public void closeDriver () {
        Driver.tearDownDriver();
    }

}
