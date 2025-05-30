package yadroEduPage.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import yadroEduPage.helpers.Attach;

import java.util.Map;

import static com.codeborne.selenide.Selenide.localStorage;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    @BeforeAll
    public static void beforeAll() {

        Configuration.baseUrl = System.getProperty("baseUrl", "https://edu.yadro.com");
        Configuration.browserSize = System.getProperty("browserResolution", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
        Configuration.remote = System.getProperty("webDriverHost", "http://217.114.8.221:4444/wd/hub/");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("/static/images/impulse/logo.svg");
        localStorage().setItem("cookieAgreement", "true");

    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }


}
