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
                .registerUser(email, "test@test.pl").getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(),"Dashboard");


    }
}
