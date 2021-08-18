package driverInit;

import extensions.DriverQuit;
import extensions.GetTestName;
import extensions.TestFailed;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@ExtendWith(GetTestName.class)
@ExtendWith(DriverQuit.class)
@ExtendWith(TestFailed.class)

public class TestBase {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(TestBase.class);

    @BeforeEach
    public void initializeWebDriver() throws IOException {
        log.info("Initializing the driver....");
        log.info("==========================================");
        String property = System.getProperty("browser", "chrome");

        switch (property.toLowerCase()) {
            case "chrome":
                log.info("Chrome was chosen!");
                getChromeDriver();
                break;
            case "firefox":
                log.info("Firefox was chosen!");
                getFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Unsupported browser! Will not start any browser!");
        }

    }


    public void getChromeDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void getFirefoxDriver() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}

