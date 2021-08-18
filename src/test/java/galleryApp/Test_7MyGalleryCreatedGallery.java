package galleryApp;

import dataInput.DataStrings;
import driverInit.TestBase;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_7MyGalleryCreatedGallery extends TestBase {

    private final Logger log = LoggerFactory.getLogger(Test_1Register.class);
    DataStrings data = new DataStrings();

    @Story("Checking if galleries previously created are present in My Galleries Page")
    @Test
    public void testMyGalleries() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();
        MyGalleriesPage myGalleries = mainPage.visitMyGalleriesPage();
        Assertions.assertEquals(data.galleryTitle, myGalleries.getNormalGalleryTitle());
        Assertions.assertEquals(data.galleryTitleNoDesc, myGalleries.getNoDescGalleryTitle());
        Assertions.assertEquals(data.galleryTitleThreePicture, myGalleries.getThreePicGalleryTitle());
        Assertions.assertEquals(data.galleryTitleThreePictureNoDesc, myGalleries.getNoDescThreePicGalleryTitle());

    }
}
