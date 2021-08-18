package galleryApp;

import dataInput.DataStrings;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);
    DataStrings data = new DataStrings();

    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "form > .btn.btn-custom")
    WebElement submitButton;
    @FindBy(linkText = "Logout")
    WebElement logoutNavLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserInputForLogin() {
        log.info("Entering user data and clicking submit button");
        log.info("==========================================");
        email.sendKeys(data.email);
        password.sendKeys(data.password);
        submitButton.click();
    }
    @Step("Logging out")
    public void loggingOut(){
        logoutNavLink.click();
    }


}
