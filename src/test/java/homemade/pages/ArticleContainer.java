package homemade.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleContainer {

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement entryTitleText;

    @FindBy(xpath = "//div/span[text()='Published ']")
    private WebElement publishedText;

    private WebDriver driver;

    public ArticleContainer(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getEntryTitleText() {
                return entryTitleText;
    }

    public WebElement getPublishedText() {
                return publishedText;
    }

}