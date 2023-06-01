package homemade.pages;

import homemade.models.Customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsSection {
    @FindBy(id = "nimble_name357955861")
    private WebElement nimbleNameInput;

    @FindBy(id = "nimble_email357955861")
    private WebElement nimbleEmailInput;

    @FindBy(id = "nimble_message357955861")
    private WebElement nimbleMessage;

    @FindBy(id = "nimble_submit357955861")
    private WebElement nimbleButton;


    WebDriver driver;

    public ContactUsSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HomePage fillContactUsSection(Customer customer) {
        nimbleNameInput.sendKeys(customer.getFirstName());
        nimbleEmailInput.sendKeys(customer.getEmail());
        nimbleMessage.sendKeys(customer.getContactUsMessage());
        nimbleButton.click();
        return new HomePage(driver);
    }
}
