package galleryApp;

import driverInit.TestBase;
import galleryApp.BasePage;
import galleryApp.LoginPage;
import galleryApp.MainPage;
import galleryApp.MyGalleriesPage;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_8Logout extends TestBase {

    @Story("User logs out of the application")
    @Test
    public void testMyGalleries(){
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();
        MyGalleriesPage myGalleries = mainPage.visitMyGalleriesPage();

    }
}
