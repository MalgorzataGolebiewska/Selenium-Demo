package homemade.tests;

import homemade.utils.DriverFactory;
import homemade.utils.SeleniumHelper;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

@Slf4j
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
    }

    @AfterMethod
    public void screenShot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                SeleniumHelper.getScreenshot(driver);
                log.error("Test failed, screenshot captured");
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        tearDown();
    }

    public void tearDown() {
        driver.quit();
    }

}

