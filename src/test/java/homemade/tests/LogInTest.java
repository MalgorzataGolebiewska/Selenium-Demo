package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test10@test.pl", "test@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void LogInWithInvalidDataTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test6@test.pl", "testtest.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."), "Expected error doesn't match");
    }

    @Test
    public void SeleniumDemoBarClickableTest() {
        HomePage pageBar = new HomePage(driver)
                .openMyAccountPage()
                .openHomePage();

        Assert.assertEquals(pageBar.getHomePageBar().getText(), "Selenium Demo Page");
    }
}