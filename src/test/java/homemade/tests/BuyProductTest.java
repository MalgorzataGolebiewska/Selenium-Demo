package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void BuyProductTest() {

        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage()
                .openAdressDetails();



    }

}
