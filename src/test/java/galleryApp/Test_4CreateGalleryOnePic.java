package galleryApp;

import dataInput.DataStrings;
import driverInit.TestBase;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_4CreateGalleryOnePic extends TestBase {

    private final Logger log = LoggerFactory.getLogger(Test_1Register.class);
    DataStrings data = new DataStrings();

    @Story("Logged in user creates a gallery with description")
    @Test
    public void testCreateGalleryWithDesc() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();
        CreateGalleryPage createGalleryPage = mainPage.visitCreateGalleryPage();
        createGalleryPage.titleInput(data.galleryTitle);
        createGalleryPage.descInput(data.galleryDescription);
        createGalleryPage.oneImageAdd(data.galleryLinkPicturePng);
        createGalleryPage.clickSubmitButton();
    }
}
