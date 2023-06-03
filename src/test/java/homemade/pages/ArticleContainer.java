package homemade.pages;

import homemade.models.Customer;
import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleContainer {

    @FindBy(xpath = "//a/span[text()='Uncategorized']")
    private WebElement UncategorizedSpan;

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement entryTitleText;

    @FindBy(xpath = "//div/span[text()='Published ']")
    private WebElement publishedText;

    @FindBy(xpath = "//div[@class='czr-wp-the-content']")
    private WebElement postContentText;

    @FindBy(xpath = "//header/h3[@class='related-posts_title col']")
    private WebElement relatedPostText;

    @FindBy(id = "reply-title")
    private WebElement LeaveCommentText;

    @FindBy(xpath = "//p[@class='comment-notes']")
    private WebElement emailNotes;

    @FindBy(xpath = "//p/label[@for='comment']")
    private WebElement commentLabel;

    @FindBy(id = "comment")
    private WebElement commentInput;

    @FindBy(xpath = "//p/label[@for='author']")
    private WebElement authorCommentLabel;

    @FindBy(id = "author")
    private WebElement authorCommentInput;

    @FindBy(xpath = "//p[@class='comment-form-email czr-focus']")
    private WebElement emailCommentLabel;

    @FindBy(id = "email")
    private WebElement emailCommentInput;
    @FindBy(xpath = "//p/label[@for='url']")
    private WebElement urlCommentLabel;

    @FindBy(id = "url")
    private WebElement urlCommentInput;

    @FindBy(id = "submit")
    private WebElement submitCommentButton;

    @FindBy(xpath = "//h1[@class='navbar-brand col-auto ']")
    private WebElement homePageBar;

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

    public WebElement getUncategorizedSpan() {
        SeleniumHelper.waitForElementToBeVisible(driver, UncategorizedSpan);
        return UncategorizedSpan;
    }

    public WebElement getPostContentText() {
        return postContentText;
    }

    public WebElement getRelatedPostText() {
        return relatedPostText;
    }

    public WebElement getLeaveCommentText() {
        return LeaveCommentText;
    }

    public WebElement getEmailNotes() {
        return emailNotes;
    }

    public WebElement getCommentLabel() {
        return commentLabel;
    }

    public WebElement getCommentInput() {
        return commentInput;
    }

    public WebElement getAuthorCommentLabel() {
        return authorCommentLabel;
    }

    public WebElement getAuthorCommentInput() {
        return authorCommentInput;
    }

    public WebElement getEmailCommentLabel() {
        return emailCommentLabel;
    }

    public WebElement getEmailCommentInput() {
        return emailCommentInput;
    }

    public WebElement getUrlCommentLabel() {
        return urlCommentLabel;
    }

    public WebElement getUrlCommentInput() {
        return urlCommentInput;
    }

    public WebElement getHomePageBar() {
        return homePageBar;
    }

    public WebElement getSubmitCommentButton() {
        SeleniumHelper.waitForClickable(submitCommentButton, driver);
        return submitCommentButton;
    }

    public ArticleContainer fillCommentSection(Customer customer) {
        commentInput.sendKeys(customer.getCommentTextSection());
        authorCommentInput.sendKeys(customer.getFirstName());
        emailCommentInput.sendKeys(customer.getEmail());
        urlCommentInput.sendKeys(customer.getWebsiteCommentSection());
        submitCommentButton.click();
        return new ArticleContainer(driver);
    }

    public ErrorPage clickSubmitAndGoToErrorPage() {
        submitCommentButton.click();
        return new ErrorPage(driver);
    }

    public ArticleContainer fillErrorComment(Customer customer) {
        commentInput.sendKeys(customer.getCommentTextSection());
        authorCommentInput.sendKeys(customer.getFirstName());
        emailCommentInput.sendKeys(customer.getEmail());
        urlCommentInput.sendKeys(customer.getWebsiteCommentSection());
        return this;
    }
}


