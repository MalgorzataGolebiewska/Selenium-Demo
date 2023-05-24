package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
                .registerUser("test@test12.pl", "test@test.pl").getEntryTitle();

        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(),"My account");


    }
}
