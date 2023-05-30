package homemade.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//span[text()='Shop']")
    private WebElement shopLink;

    @FindBy(xpath = "//div/a[@class='sek-btn box-shadow push-effect']")
    private WebElement shopButton;

    @FindBy(xpath = "//div[@class='sek-module-inner']")
    private WebElement designYourOwnSpace;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage openMyAccountPage() {
        myAccountLink.click();
        return new MyAccountPage(driver);

    }
    public ShopPage openShopPage() {
        shopLink.click();
        return new ShopPage(driver);

    }

    public ShopPage openShopPageByButton() {
        shopButton.click();
        return new ShopPage(driver);
    }

    public WebElement getDesignYourOwnSpace() {
        System.out.println(designYourOwnSpace.getText());
        return designYourOwnSpace;
    }


}
