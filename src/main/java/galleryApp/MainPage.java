package galleryApp;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);


    @FindBy(linkText = "Register")
    WebElement registerNavLink;
    @FindBy(linkText = "Create Gallery")
    WebElement createGalleryNavLink;
    @FindBy(linkText = "Login")
    WebElement loginNavLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Visit register page")
    public RegisterPage visitRegisterPage(){
        log.info("Visiting register page");
        log.info("==========================================");
        registerNavLink.click();
        return new RegisterPage(driver);
    }

    @Step("Visit Create Gallery Page")
    public CreateGalleryPage visitCreateGalleryPage(){
        log.info("Visiting Create Gallery Page");
        log.info("==========================================");
        createGalleryNavLink.click();

        return new CreateGalleryPage(driver);
    }

    @Step("Visit Login Page")
    public LoginPage visitLoginPage(){
        log.info("Visiting Login Page");
        log.info("==========================================");
        loginNavLink.click();
        return new LoginPage(driver);
    }
}
