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
    private WebElement nimbleFirstText;

    @FindBy(xpath = "//div[@data-sek-id='__nimble__6e96a4095315']")
    private WebElement nimbleSecondText;

    @FindBy(xpath = "//div[@data-sek-id='__nimble__b547e4fe7ec6']")
    private WebElement nimbleThirdText;

    @FindBy(xpath = "//h2[text()='CONTACT US']")
    private WebElement contactUsText;

    @FindBy(xpath = "//div/label[@for='nimble_name873983543']")
    private WebElement nimbleFourthText;

    @FindBy(id = "sek-form-respond")
    private WebElement respondText;

    @FindBy(xpath = "//a[@href='http://seleniumdemo.com/?p=41']")
    private WebElement secondPostLink;

    @FindBy(xpath = "//h1[@class='navbar-brand col-auto ']")
    private WebElement homePageBar;

    private final WebDriver driver;

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
        return designYourOwnSpace;
    }

    public WebElement getSuspendisseLectusText() {
        SeleniumHelper.waitForElementToBeVisible(driver, suspendisseLectusText);
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
        return highPerformanceText;
    }

    public WebElement getIndustryLeaderText() {
        return industryLeaderText;
    }

    public WebElement getDeliversOnTimeText() {
        return deliversOnTimeText;
    }

    public WebElement getNimbleFirstText() {
        return nimbleFirstText;
    }

    public WebElement getNimbleSecondText() {
        return nimbleSecondText;
    }

    public WebElement getNimbleThirdText() {
        return nimbleThirdText;
    }

    public WebElement getContactUsText() {
        return contactUsText;
    }

    public WebElement getNimbleFourthText() {
        return nimbleFourthText;
    }

    public WebElement getRespondText() {
        return respondText;
    }

    public ArticleContainer openArticleContainerPage() {
        SeleniumHelper.waitForClickable(secondPostLink, driver);
        secondPostLink.click();
        return new ArticleContainer(driver);
    }

    public WebElement getHomePageBar() {
        return homePageBar;
    }

}
