import dataInput.DataStrings;
import driverInit.TestBase;
import galleryApp.BasePage;
import galleryApp.CreateGalleryPage;
import galleryApp.LoginPage;
import galleryApp.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_MyGalleryCreatedGallery extends TestBase {

    private final Logger log = LoggerFactory.getLogger(Test_1Register.class);
    DataStrings data = new DataStrings();

    @Story("Logged in user creates a gallery with 3 images")
    @Test
    public void testCreateThreePicGallery(){
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();

    }
}
