package homemade.pages;

import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCart {

    @FindBy(partialLinkText = "Proceed to checkout")
            private WebElement proceedToCheckoutButton;
    private WebDriver driver;
    public OpenCart(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AddressDetailsPage openAdressDetails(){
        SeleniumHelper.waitForClicable(proceedToCheckoutButton,driver);
        proceedToCheckoutButton.click();
        return new AddressDetailsPage(driver);
    }
}
