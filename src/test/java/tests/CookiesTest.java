package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.UserinyerfaceGamePage;
import static org.testng.Assert.assertTrue;

public class CookiesTest extends BaseTest {
    MainPage mainPage;
    UserinyerfaceGamePage userinyerfaceGamePage;
    @Test
    void acceptCookies() {
        mainPage = new MainPage();

        assertTrue(mainPage.state().isDisplayed(),
                "Welcome page is open.");

        mainPage.clickOnNextPageLink();

        userinyerfaceGamePage = new UserinyerfaceGamePage();

        assertTrue(userinyerfaceGamePage.state().isDisplayed(),
                "Game page is open.");

        userinyerfaceGamePage.getCookiesForm().acceptCookies();

        assertTrue(userinyerfaceGamePage.getCookiesForm().state().waitForNotDisplayed(),
                "Form is closed, some updates made");
    }
}
