package homemade.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    private WebDriver driver;

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement entryTitle;

    public LoggedUserPage(WebDriver driver){

    }
}