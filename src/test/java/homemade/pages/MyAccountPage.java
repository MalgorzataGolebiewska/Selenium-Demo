package homemade.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {


    @FindBy(id = "reg_email")
    private WebElement regEmailInput;

    @FindBy(id = "reg_password")
    private WebElement regPassInput;

    @FindBy(name = "register")
    private WebElement registerButton;

    private WebDriver driver;
    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUser(String email, String password) {
        regEmailInput.sendKeys(email);
        regPassInput.sendKeys(password);
        registerButton.click();
        return new LoggedUserPage(driver);
    }
}
