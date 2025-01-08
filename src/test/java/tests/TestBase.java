package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static constants.Constants.BASE_URL;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = BASE_URL;
        Configuration.pageLoadStrategy = "eager";

    }

    @BeforeEach
    void setupTest() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
