package galleryApp;

import dataInput.DataStrings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.crypto.Data;

public class MyGalleriesPage {

    protected WebDriver driver;
    private final Logger log = LoggerFactory.getLogger(BasePage.class);
    DataStrings data = new DataStrings();


    @FindBy(linkText = "Test Galerija")
    WebElement galleryTitleNormal;
    @FindBy(linkText = "Test Galerija bez opisa")
    WebElement galleryTitleNoDesc;
    @FindBy(linkText = "Test Galerija 3 slike")
    WebElement galleryTitleThreePic;
    @FindBy(linkText = "Test Galerija 3 slike bez opisa")
    WebElement galleryTitleThreePicNoDesc;

    public MyGalleriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getNormalGalleryTitle() {
        log.info("Getting full gallery title");
        log.info("==========================================");
        return galleryTitleNormal.getText();
    }

    public String getNoDescGalleryTitle() {
        log.info("Getting gallery title with no description");
        log.info("==========================================");
        return galleryTitleNoDesc.getText();
    }

    public String getThreePicGalleryTitle() {
        log.info("Getting gallery title with 3 pictures with no description");
        log.info("==========================================");
        return galleryTitleThreePic.getText();
    }

    public String getNoDescThreePicGalleryTitle() {
        log.info("Getting gallery title with 3 pictures with no description");
        log.info("==========================================");
        return galleryTitleThreePicNoDesc.getText();
    }
}
