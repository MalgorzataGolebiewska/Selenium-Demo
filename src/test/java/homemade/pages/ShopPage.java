package homemade.pages;

import homemade.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

    private WebDriver driver;
    public ShopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProduct(String title) {
        By productXpath = By.xpath("//h2[text()='" + title + "']");
        SeleniumHelper.waitForLocator(productXpath, driver);
        driver.findElement(productXpath).click();
        return new ProductPage(driver);
    }
}
