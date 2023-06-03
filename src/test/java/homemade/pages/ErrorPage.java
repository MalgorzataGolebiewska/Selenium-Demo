package homemade.pages;

import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorPage {

    @FindBy(xpath = "//body/p[2]")
    private WebElement errorTitle;

    @FindBy(xpath = "//p[4]/a")
    private WebElement backUrl;

    private WebDriver driver;

    public ErrorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getErrorTitle() {
        SeleniumHelper.waitForElementToBeVisible(driver, errorTitle);
        System.out.println(errorTitle.getText());
        return errorTitle;
    }

    public ArticleContainer getBackUrl() {
        SeleniumHelper.waitForClickable(backUrl, driver);
        backUrl.click();
        return new ArticleContainer(driver);
    }
}
