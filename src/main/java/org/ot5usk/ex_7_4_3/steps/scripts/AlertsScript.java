package org.ot5usk.ex_7_4_3.steps.scripts;

import org.ot5usk.ex_7_4_3.steps.pages_steps.alerts_steps.JsAlertsPageSteps;

import static org.ot5usk.ex_7_4_3.steps.assertions.AlertsAsserts.*;

public class AlertsScript {

    private final JsAlertsPageSteps jsAlertsPageSteps = new JsAlertsPageSteps();

    public void execute() {
        String alertText = jsAlertsPageSteps.openPage().clickJsAlertBtn().acceptAlert();
        checkAlertText("I am a JS Alert", alertText);
        checkAlertClosing();
        jsAlertsPageSteps.clickJsConfirmBtn().dismissAlert();
        checkAlertClosing();
        jsAlertsPageSteps.clickJsPromptBtn().enterTextIntoAlert("Hello World");
        checkResultText(jsAlertsPageSteps.getPageTextResult());
    }
}
