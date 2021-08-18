package galleryApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateGalleryPage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);


    @FindBy(id = "title")
    WebElement galleryTitle;
    @FindBy(id = "description")
    WebElement galleryDescription;
    @FindBy(css = ".input-group.mb-3 > .form-control")
    WebElement imageInputAlone;
    @FindBy(css = "form div:nth-of-type(3) > [type]")
    WebElement imageAddButton;
    @FindBy(css = "div:nth-of-type(2) > .input-group.mb-3 > .form-control")
    WebElement imageInputTwo;
    @FindBy(css = "div:nth-of-type(3) > .input-group.mb-3 > .form-control")
    WebElement imageInputThree;
    @FindBy(css = "form > button:nth-of-type(1)")
    WebElement submitButton;


    public CreateGalleryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void titleInput(String data) {
        log.info("Typing the gallery title");
        log.info("==========================================");
        galleryTitle.sendKeys(data);
    }

    public void descInput(String data) {
        log.info("Typing the gallery description");
        log.info("==========================================");
        galleryDescription.sendKeys(data);
    }

    public void oneImageAdd(String data) {
        log.info("Adding one image url");
        log.info("==========================================");
        imageInputAlone.sendKeys(data);
    }

    public void addThreeImages(String data) {
        log.info("Adding three images");
        log.info("==========================================");
        imageInputAlone.sendKeys(data);
        imageAddButton.click();
        imageAddButton.click();
        imageInputTwo.sendKeys(data);
        imageInputThree.sendKeys(data);
    }

    public void clickSubmitButton() {
        log.info("Clicking submit button");
        log.info("==========================================");
        submitButton.click();
    }


}
