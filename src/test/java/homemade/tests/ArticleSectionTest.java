package homemade.tests;

import homemade.pages.ArticleContainer;
import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArticleSectionTest extends BaseTest {

    @Test
    public void ArticleSectionTest() {

        ArticleContainer articleContainer = new HomePage(driver)
                .getSecondPostLink();

        Assert.assertEquals(articleContainer.getPublishedText().getText(),"by admin|Published January 18, 2019");
    }
}
