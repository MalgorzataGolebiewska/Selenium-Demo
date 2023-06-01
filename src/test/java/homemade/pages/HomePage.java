package homemade.pages;

import homemade.utils.SeleniumHelper;
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

    @FindBy(xpath = "//*[contains(text(), 'Design your')]")
    private WebElement designYourOwnSpace;

    @FindBy(xpath = "//div/p[1]")
    private WebElement suspendisseLectusText;

    @FindBy(xpath = "//*[@class='fas fa-chart-line']")
    private WebElement chartLineLogo;

    @FindBy(xpath = "//*[@class='fas fa-award']")
    private WebElement awardLogo;

    @FindBy(xpath = "//*[@class='far fa-clock']")
    private WebElement clockLogo;

    @FindBy(xpath = "//h3[text()='High performances']")
    private WebElement highPerformanceText;

    @FindBy(xpath = "//h3[text()='Industry leader']")
    private WebElement industryLeaderText;

    @FindBy(xpath = "//h3[text()='Delivers on time']")
    private WebElement deliversOnTimeText;

    @FindBy(xpath = "//div[@data-sek-id='__nimble__ce9c67ba2a1c']")
    private WebElement nimbleCe9c67ba2a1cText;

    @FindBy(xpath = "//div[@data-sek-id='__nimble__6e96a4095315']")
    private WebElement nimble6e96a4095315Text;

    @FindBy(xpath = "//div[@data-sek-id='__nimble__b547e4fe7ec6']")
    private WebElement nimbleB547e4fe7ec6Text;

    @FindBy(xpath = "//h2[text()='CONTACT US']")
    private WebElement contactUsText;

    @FindBy(xpath = "//div/label[@for='nimble_name357955861']")
    private WebElement nimbleName357955861;

    @FindBy(id = "sek-form-respond")
    private WebElement respondText;

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

    public WebElement getSuspendisseLectusText() {
        SeleniumHelper.waitForElementToBeVisible(driver, suspendisseLectusText);
        System.out.println(suspendisseLectusText.getText());
        return suspendisseLectusText;
    }

    public WebElement getChartLineLogo() {
        return chartLineLogo;
    }

    public WebElement getAwardLogo() {
        return awardLogo;
    }

    public WebElement getClockLogo() {
        return clockLogo;
    }

    public WebElement getHighPerformanceText() {
        System.out.println(highPerformanceText.getText());
        return highPerformanceText;
    }

    public WebElement getIndustryLeaderText() {
        System.out.println(industryLeaderText.getText());
        return industryLeaderText;
    }

    public WebElement getDeliversOnTimeText() {
        System.out.println(deliversOnTimeText.getText());
        return deliversOnTimeText;
    }

    public WebElement getNimbleCe9c67ba2a1cText() {
        System.out.println(nimbleCe9c67ba2a1cText.getText());
        return nimbleCe9c67ba2a1cText;
    }

    public WebElement getNimble6e96a4095315Text() {
        System.out.println(nimble6e96a4095315Text.getText());
        return nimble6e96a4095315Text;
    }

    public WebElement getNimbleB547e4fe7ec6Text() {
        System.out.println(nimbleB547e4fe7ec6Text.getText());
        return nimbleB547e4fe7ec6Text;
    }

    public WebElement getContactUsText() {
        System.out.println(contactUsText.getText());
        return contactUsText;
    }

    public WebElement getNimbleName357955861() {
        return nimbleName357955861;
    }

    public WebElement getRespondText() {
        System.out.println(respondText.getText());
        return respondText;
    }
}
