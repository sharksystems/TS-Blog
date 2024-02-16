package drivers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;


public class Driver {

    private static String baseURL = "https://26.81.248.148";

    public static void startDriver () {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Selenide.open(baseURL);
    }
    public static void tearDownDriver () {
        Selenide.closeWebDriver();
    }

}
