package org.ot5usk.ex_7_4_3.pages.alerts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class JsAlertsPageButtons {

    private final SelenideElement JS_ALERT_BTN = $x("//button[@onclick='jsAlert()']");
    private final SelenideElement JS_CONFIRM_BTN = $x("//button[@onclick='jsConfirm()']");
    private final SelenideElement JS_PROMPT_BTN = $x("//button[@onclick='jsPrompt()']");

    public void clickJsAlertBtn() {
        JS_ALERT_BTN.click();
    }

    public void clickJsConfirmBtn() {
        JS_CONFIRM_BTN.click();
    }

    public void clickJsPromptBtn() {
        JS_PROMPT_BTN.click();
    }


}
