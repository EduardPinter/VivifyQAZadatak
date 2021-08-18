package galleryApp;

import driverInit.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_1Register extends TestBase {

    private final Logger log = LoggerFactory.getLogger(Test_1Register.class);


    @Story("User registers into gallery app")
    @Description("User uses valid credentials to register onto the app")
    @Test
    public void testRegisterUser(){
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        RegisterPage registerPage = mainPage.visitRegisterPage();
        registerPage.fillOutRegisterForm();

    }
}
