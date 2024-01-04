package org.ot5usk.ex_7_4_3.steps.assertions;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.ex.AlertNotFoundError;
import io.qameta.allure.Step;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlertsAsserts {

    @Step("Проверка текста в алерте")
    public static void checkAlertText(String expectedText, String actualText) {
        assertEquals(expectedText, actualText);
    }

    @Step("Проверка закрытия алерта")
    public static void checkAlertClosing() {
        assertThrows(AlertNotFoundError.class, Selenide::confirm);
    }

    @Step("Проверка появления текста на странице")
    public static void checkResultText(String actualText) {
        assertEquals("You entered: Hello World", actualText);
    }
}
