package homemade.tests;

import homemade.models.Customer;
import homemade.pages.HomePage;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void BuyProductTest() {
        Customer customer = new Customer();
        customer.setEmail("testerski@testy.pl");

        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage()
                .openAdressDetails()
                .fillAddressDetails(customer);



    }

}
