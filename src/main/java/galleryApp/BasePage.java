package galleryApp;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Visiting the Page url")
    public MainPage visitUrl() {
        log.info("Visiting the Page url");
        log.info("==========================================");
        driver.get("https://gallery-app.vivifyideas.com/");
        return new MainPage(driver);
    }

}