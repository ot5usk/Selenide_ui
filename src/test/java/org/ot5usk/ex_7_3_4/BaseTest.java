package org.ot5usk.ex_7_3_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.ot5usk.ex_7_3_4.steps.pages_steps.TheInternetHomePageSteps;

import static com.codeborne.selenide.Selenide.sleep;

public class BaseTest {

    public static TheInternetHomePageSteps homePageSteps;
    private static long timeoutValue = 2500;

    @BeforeAll
    static void openHomePage() {
        homePageSteps = new TheInternetHomePageSteps();
        homePageSteps.openHomePage();
        Configuration.timeout = timeoutValue;
    }

    @BeforeEach
    void pause() {
        sleep(timeoutValue += 250);
    }
}
