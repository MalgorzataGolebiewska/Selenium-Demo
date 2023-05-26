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

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElement errors;

    private WebDriver driver;
    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUserValidData(String email, String password) {
        registerUser(email, password);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage registerUseInvalidData(String email, String password) {
        registerUser(email, password);
        return this;
    }

    private void registerUser(String email, String password){
        regEmailInput.sendKeys(email);
        regPassInput.sendKeys(password);
        registerButton.click();
    }

    public WebElement getError(){
        return errors;}
}
