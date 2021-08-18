package galleryApp;

import driverInit.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

@Epic("Logging into the app")
public class Test_2Login extends TestBase {

    @Story("User logs into gallery app")
    @Description("User uses valid credentials to login")
    @Test
    public void testLogin(){
        BasePage basePage = new BasePage(driver);
        MainPage mainPage = basePage.visitUrl();
        LoginPage loginPage = mainPage.visitLoginPage();
        loginPage.enterUserInputForLogin();
    }
}
