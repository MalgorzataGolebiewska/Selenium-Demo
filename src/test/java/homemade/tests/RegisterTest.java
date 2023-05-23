package homemade.tests;

import homemade.pages.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        new HomePage(driver).openMyAccountPage()
                .registerUser("test@test11.pl", "test@test.pl");


    }
}
