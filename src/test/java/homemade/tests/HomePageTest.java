package homemade.tests;

import homemade.models.Customer;
import homemade.pages.ContactUsSection;
import homemade.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void homePageTest() {
        //given
        //when
        HomePage homePage = new HomePage(driver);
        //then
        Assert.assertEquals(homePage.getSuspendisseLectusText().getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.");
        Assert.assertEquals(homePage.getDesignYourOwnSpace().getText(), "Design your own space");
        Assert.assertTrue(homePage.getChartLineLogo().isDisplayed());
        Assert.assertTrue(homePage.getAwardLogo().isDisplayed());
        Assert.assertTrue(homePage.getClockLogo().isDisplayed());
        Assert.assertEquals(homePage.getHighPerformanceText().getText(), "High performances");
        Assert.assertEquals(homePage.getIndustryLeaderText().getText(), "Industry leader");
        Assert.assertEquals(homePage.getDeliversOnTimeText().getText(), "Delivers on time");
        Assert.assertEquals(homePage.getNimbleFirstText().getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(homePage.getNimbleSecondText().getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(homePage.getNimbleThirdText().getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(homePage.getContactUsText().getText(), "CONTACT US");
        Assert.assertEquals(homePage.getNimbleFourthText().getText(), "Test Data *");
    }

    @Test
    public void contactUs() {
        //given
        //when
        HomePage contactUsSection = new ContactUsSection(driver)
                .fillContactUsSection(new Customer());
        //then
        Assert.assertEquals(contactUsSection.getRespondText().getText(), "It is demo page! We are not sending emails!");
    }

}
