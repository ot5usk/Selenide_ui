package org.ot5usk.ex_7_4_3.pages.alerts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class JsAlertsPage {

    private static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";
    private final JsAlertsPageButtons BUTTONS = new JsAlertsPageButtons();
    private final SelenideElement RESULT = $x("//p[@id='result']");

    public void openPage() {
        open(URL);
    }

    public void clickJsAlertBtn() {
        BUTTONS.clickJsAlertBtn();
    }

    public void clickJsConfirmBtn() {
        BUTTONS.clickJsConfirmBtn();
    }

    public void clickJsPromptBtn() {
        BUTTONS.clickJsPromptBtn();
    }

    public String acceptAlert() {
        return confirm();
    }

    public void dismissAlert() {
        dismiss();
    }

    public void enterTextIntoAlert(String text) {
        prompt(text);
    }

    public String getPageTextResult() {
        return RESULT.getText();
    }
}
