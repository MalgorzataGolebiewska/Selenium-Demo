package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test
    public void HomePageTest() {

        WebElement designYourOwnSpace = new HomePage(driver)
                .getDesignYourOwnSpace();




    }
}
