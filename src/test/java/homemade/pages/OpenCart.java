package homemade.pages;

import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCart {

    @FindBy(partialLinkText = "Proceed to checkout")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//div/h2[text()='Cart totals']")
    private WebElement cartTotals;

    private final WebDriver driver;

    public OpenCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AddressDetailsPage openAdressDetails() {
        SeleniumHelper.waitForClickable(proceedToCheckoutButton, driver);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }

    public WebElement getCartTotals() {
        return cartTotals;
    }

}
