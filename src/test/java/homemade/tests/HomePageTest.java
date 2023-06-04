package homemade.tests;

import homemade.models.Customer;
import homemade.pages.ContactUsSection;
import homemade.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void HomePageTest() {

        HomePage homePage = new HomePage(driver);

        WebElement text2 = homePage.getDesignYourOwnSpace();
        WebElement logo1 = homePage.getChartLineLogo();
        WebElement logo2 = homePage.getAwardLogo();
        WebElement logo3 = homePage.getClockLogo();
        WebElement text3 = homePage.getHighPerformanceText();
        WebElement text4 = homePage.getIndustryLeaderText();
        WebElement text5 = homePage.getDeliversOnTimeText();
        WebElement text6 = homePage.getNimbleCe9c67ba2a1cText();
        WebElement text7 = homePage.getNimble6e96a4095315Text();
        WebElement text8 = homePage.getNimbleB547e4fe7ec6Text();
        WebElement text9 = homePage.getContactUsText();
        WebElement text10 = homePage.getNimbleName357955861();


        Assert.assertEquals(homePage.getSuspendisseLectusText().getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.");
        Assert.assertEquals(text2.getText(), "Design your own space");
        Assert.assertTrue(logo1.isDisplayed());
        Assert.assertTrue(logo2.isDisplayed());
        Assert.assertTrue(logo3.isDisplayed());
        Assert.assertEquals(text3.getText(), "High performances");
        Assert.assertEquals(text4.getText(), "Industry leader");
        Assert.assertEquals(text5.getText(), "Delivers on time");
        Assert.assertEquals(text6.getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(text7.getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(text8.getText(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        Assert.assertEquals(text9.getText(), "CONTACT US");
        Assert.assertEquals(text10.getText(), "Test Data *");
    }

    @Test
    public void ContactUs() {
        Customer customer = new Customer();

        HomePage contactUsSection = new ContactUsSection(driver)
                .fillContactUsSection(customer);

        Assert.assertEquals(contactUsSection.getRespondText().getText(), "It is demo page! We are not sending emails!");
    }
}
