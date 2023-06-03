package homemade.tests;

import homemade.models.Customer;
import homemade.pages.ArticleContainer;
import homemade.pages.ErrorPage;
import homemade.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArticleSectionTest extends BaseTest {

    @Test
    public void ArticleSectionTest() {

        Customer customer = new Customer();

        ArticleContainer articleContainer = new HomePage(driver)
                .getSecondPostLink()
                .fillCommentSection(customer);

        Assert.assertEquals(articleContainer.getUncategorizedSpan().getText(), "UNCATEGORIZED");
        Assert.assertEquals(articleContainer.getEntryTitleText().getText(), "Second post");
        Assert.assertEquals(articleContainer.getPublishedText().getText(), "by admin|Published January 18, 2019");
        Assert.assertEquals(articleContainer.getPostContentText().getText(), "Second post");
        Assert.assertEquals(articleContainer.getRelatedPostText().getText(), "YOU MAY ALSO LIKE");
        Assert.assertEquals(articleContainer.getLeaveCommentText().getText(), "Leave a comment");
        Assert.assertEquals(articleContainer.getEmailNotes().getText(), "Your email address will not be published. Required fields are marked *");
        Assert.assertEquals(articleContainer.getCommentLabel().getText(), "COMMENT");
        Assert.assertEquals(articleContainer.getCommentInput().getText(), "");
        Assert.assertEquals(articleContainer.getAuthorCommentLabel().getText(), "NAME\n*");
        Assert.assertEquals(articleContainer.getAuthorCommentInput().getText(), "");
        Assert.assertEquals(articleContainer.getEmailCommentLabel().getText(), "EMAIL\n*");
        Assert.assertEquals(articleContainer.getEmailCommentInput().getText(), "");
        Assert.assertEquals(articleContainer.getUrlCommentLabel().getText(), "WEBSITE");
        Assert.assertEquals(articleContainer.getUrlCommentInput().getText(), "");
    }

    @Test
    public void CommentSectionInvalidEmail() {
        Customer customer = new Customer();
        customer.setEmail("lllllll");

        ArticleContainer articleContainer = new HomePage(driver)
                .getSecondPostLink()
                .fillErrorComment(customer);
        ErrorPage errorPage = articleContainer.clickSubmitAndGoToErrorPage();
        //#TODO czy to poprawne podejscie?
        String errorMessage = errorPage.getErrorTitle().getText();
        articleContainer = errorPage.getBackUrl();

        Assert.assertEquals(errorMessage, "ERROR: please enter a valid email address.");
        Assert.assertEquals(articleContainer.getHomePageBar().getText(), "Selenium Demo Page");
    }

    @Test
    public void CommentSectionInvalidWebsite() {
        Customer customer = new Customer();
        customer.setWebsiteCommentSection("123+*%$# ");

        ArticleContainer articleContainer = new HomePage(driver)
                .getSecondPostLink()
                .fillErrorComment(customer);
        ErrorPage errorPage = articleContainer.clickSubmitAndGoToErrorPage();
        //#TODO czy to poprawne podejscie?
        String errorMessage = errorPage.getErrorTitle().getText();
        articleContainer = errorPage.getBackUrl();

        Assert.assertEquals(errorMessage, "");
        Assert.assertEquals(articleContainer.getHomePageBar().getText(), "Selenium Demo Page");


    }
}

