package homemade.tests;

import homemade.models.Customer;
import homemade.pages.HomePage;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

    @Test
    public void BuyProductTest() {
        Customer customer = new Customer();
        customer.setFirstName("Pepino");
        customer.setLastName("Testowy");
        customer.setCompanyName("Tester&Tester");
        customer.setCountry("Poland");
        customer.setAddress1("Testowa 11");
        customer.setAddress2("Apt. 1");
        customer.setPostCode("12-121");
        customer.setCityName("Seul");
        customer.setPhone("111111111");
        customer.setEmail("test1@test.pl");
        customer.setOrderComments("No comments");


        new HomePage(driver).openShopPage().openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCartPage()
                .openAdressDetails()
                .fillAddressDetails(customer);



    }

}
