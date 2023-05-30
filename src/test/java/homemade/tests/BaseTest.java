package homemade.tests;

import homemade.utils.DriverFactory;
import homemade.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
    }

    @AfterMethod

    public void screenShot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                SeleniumHelper.getScreenshot(driver);
                System.out.println("Test failed, screenshot captured");
            } catch(Exception e) {
                e.getMessage();
            }
        }
    }

    public void tearDown() {
            driver.quit();
        }
    }

