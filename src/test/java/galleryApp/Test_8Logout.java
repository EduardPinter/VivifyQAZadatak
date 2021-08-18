package galleryApp;

import driverInit.TestBase;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_8Logout extends TestBase {

    @Story("User logs out of the application")
    @Test
    public void testLogout() {
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();
        loginPage.loggingOut();

    }
}
