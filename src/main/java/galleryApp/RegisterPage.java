package galleryApp;

import dataInput.DataStrings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RegisterPage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);
    DataStrings dataStrings = new DataStrings();


    @FindBy(id = "first-name")
    WebElement firstNameInput;
    @FindBy(id = "last-name")
    WebElement lastNameInput;
    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "password-confirmation")
    WebElement passwordConfirmation;
    @FindBy(className = "form-check-input")
    WebElement termsAndConditions;
    @FindBy(css = "form > .btn.btn-custom")
    WebElement submitButton;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillOutRegisterForm() {
        log.info("Filling out the registration form");
        log.info("==========================================");
        firstNameInput.sendKeys(dataStrings.firstName);
        lastNameInput.sendKeys(dataStrings.lastName);
        emailInput.sendKeys(dataStrings.email);
        password.sendKeys(dataStrings.password);
        passwordConfirmation.sendKeys(dataStrings.passwordConf);
        termsAndConditions.click();
        submitButton.click();

    }


}
