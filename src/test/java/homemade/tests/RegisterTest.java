package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int randomNumber = (int) (Math.random() * 1000);
        String email = "tester" + randomNumber + "@test.pl";

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUserValidData(email, "test@test.pl").getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");


    }

    @Test
    public void registerUserWithSameEmailTest() {

        WebElement error = new HomePage(driver).openMyAccountPage()
                .registerUseInvalidData("test1@test.pl", "test@test.pl").getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address."));


    }
}
