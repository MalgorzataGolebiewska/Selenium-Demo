package homemade.tests;

import homemade.models.Customer;
import homemade.pages.HomePage;
import homemade.pages.OpenCart;
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
        //test czasami nie dziala, ze wzgledu na niepoprawne dzialanie przycisku "Place Order", do sprawdzenia po stronie developera

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 1");
    }

    @Test
    public void BuyProductTestByButton() {
        OpenCart openCart = new HomePage(driver)
                .openShopPageByButton()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage();


        Assert.assertEquals(openCart.getCartTotals().getText(), "Cart totals");
    }

}
