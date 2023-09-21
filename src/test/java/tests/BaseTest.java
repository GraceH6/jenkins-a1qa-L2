package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import configs.EnvironmentConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    public Browser getBrowser() {
        return AqualityServices.getBrowser();
    }

    @BeforeMethod
    void setUp() {
        getBrowser().goTo(EnvironmentConfig.getBaseUrl());
    }

    @AfterMethod
    void tearDown() {
        if (getBrowser().isStarted())
            getBrowser().quit();
    }
}
