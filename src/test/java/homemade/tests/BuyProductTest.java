package homemade.tests;

import homemade.models.Customer;
import homemade.pages.HomePage;
import homemade.pages.OpenCart;
import homemade.pages.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void buyProductTest() {
        //given
        Customer customer = new Customer();
        customer.setEmail("testerski@testy.pl");
        //when
        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage()
                .openAdressDetails()
                .fillAddressDetails(customer);
        //TODO test czasami nie dziala, ze wzgledu na niepoprawne dzialanie przycisku "Place Order", do sprawdzenia po stronie developera
        //then
        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 1");
    }

    @Test
    public void buyProductTestByButton() {
        //given
        //when
        OpenCart openCart = new HomePage(driver)
                .openShopPageByButton()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage();
        //then
        Assert.assertEquals(openCart.getCartTotals().getText(), "Cart totals");
    }

}
