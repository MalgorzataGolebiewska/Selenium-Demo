package homemade.tests;

import homemade.models.Customer;
import homemade.pages.HomePage;
import homemade.pages.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void BuyProductTest() {
        Customer customer = new Customer();
        customer.setEmail("testerski@testy.pl");

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage()
                .openAdressDetails()
                .fillAddressDetails(customer);

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(),"Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(),"Java Selenium WebDriver × 1");
    }
}
