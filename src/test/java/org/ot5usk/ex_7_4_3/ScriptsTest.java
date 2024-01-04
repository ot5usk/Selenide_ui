package org.ot5usk.ex_7_4_3;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.ex_7_4_3.steps.scripts.AlertsScript;
import org.ot5usk.ex_7_4_3.steps.scripts.FrameScript;
import org.ot5usk.ex_7_4_3.steps.scripts.WindowsScript;

public class ScriptsTest {

    @DisplayName("Взаимодействие с элементами внутри фрейма")
    @Description("Использование текстового редактора")
    @Test
    void testFrameScript() {
        new FrameScript().execute();
    }

    @DisplayName("Переключение между окнами браузера")
    @Description("Осуществление перехода на новое окно и назад")
    @Test
    void testWindowsScript() {
        new WindowsScript().execute();
    }

    @DisplayName("Взаимодействие со всплывающими уведомлениями")
    @Description("На странице появился текст You entered: Hello World")
    @Test
    void testAlertsScript() {
        new AlertsScript().execute();
    }
}