package homemade.pages;

import homemade.models.Customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressDetailsPage {

    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lasNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "billing_country")
    private WebElement countrySelect;

    @FindBy(id = "billing_address_1")
    private WebElement streetAddressInput;

    @FindBy(id = "billing_address_2")
    private WebElement streetAddressSecondInput;

    @FindBy(id = "billing_city")
    private WebElement townInput;

    @FindBy(id = "billing_state")
    private WebElement stateInput;

    @FindBy(id = "billing_postcode")
    private WebElement postCodeInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "billing_email")
    private WebElement emailInput;

    @FindBy(id = "order_comments")
    private WebElement orderCommentsInput;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    private WebDriver driver;
    public AddressDetailsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public OrderDetailsPage fillAddressDetails(Customer customer){
        firstNameInput.sendKeys(customer.getFirstName());
        lasNameInput.sendKeys(customer.getLastName());
        companyNameInput.sendKeys(customer.getCompanyName());
        Select country = new Select(countrySelect);
        country.selectByVisibleText(customer.getCountry());
        streetAddressInput.sendKeys(customer.getAddress1());
        streetAddressSecondInput.sendKeys(customer.getAddress2());
        townInput.sendKeys(customer.getCityName());
        postCodeInput.sendKeys(customer.getPostCode());
        phoneInput.sendKeys(customer.getPhone());
        emailInput.sendKeys(customer.getEmail());
        orderCommentsInput.sendKeys(customer.getOrderComments());
        placeOrderButton.click();
        return new OrderDetailsPage(driver);
    }


}
