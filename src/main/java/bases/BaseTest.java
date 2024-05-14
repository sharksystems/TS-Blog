package bases;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import drivers.Driver;

public abstract class BaseTest {

    protected final Faker faker = new Faker();

    @BeforeMethod
    protected void openDriver () {
        Driver.startDriver();
    }

    @AfterMethod
    protected void closeDriver () {
        Driver.tearDownDriver();
    }
}
