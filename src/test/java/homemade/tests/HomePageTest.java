package homemade.tests;

import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test
    public void HomePageTest() {

        HomePage homePage = new HomePage(driver);
        WebElement text1 = homePage.getSuspendisseLectusText();
        WebElement text2 = homePage.getDesignYourOwnSpace();
        WebElement logo1 = homePage.getChartLineLogo();
        WebElement logo2 = homePage.getAwardLogo();
        WebElement logo3 = homePage.getClockLogo();
        WebElement text3 = homePage.getHighPerformanceText();
        WebElement text4 = homePage.getIndustryLeaderText();
        WebElement text5 = homePage.getDeliversOnTimeText();


        Assert.assertEquals(text1.getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.");
        Assert.assertEquals(text2.getText(), "Design your own space");
        Assert.assertTrue(logo1.isDisplayed());
        Assert.assertTrue(logo2.isDisplayed());
        Assert.assertTrue(logo3.isDisplayed());
        Assert.assertEquals(text3.getText(), "High performances");
        Assert.assertEquals(text4.getText(), "Industry leader");
        Assert.assertEquals(text5.getText(), "Delivers on time");
    }

}
