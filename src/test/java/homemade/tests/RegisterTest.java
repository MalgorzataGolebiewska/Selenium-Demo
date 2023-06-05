package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        //given
        int randomNumber = (int) (Math.random() * 1000);
        String email = "tester" + randomNumber + "@test.pl";
        //when
        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData(email, "test@test.pl")
                .getDashboardLink();
        //then
        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void registerUserWithSameEmailTest() {
        //given
        //when
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUseInvalidData("test10@test.pl", "test@test.pl")
                .getError();
        //then
        //TODO strona czasami nie odpowiada, powinien sprawdzic to developer
        Assert.assertTrue(error.getText().contains("An account is already registered with your email address."));
    }

}
