package org.ot5usk.ex_7_4_3.steps.pages_steps.windows_steps;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_3.pages.windows.NewWindowPage;

public class NewWindowPageSteps {

    private final NewWindowPage newWindowPage;

    public NewWindowPageSteps(NewWindowPage newWindowPage) {
        this.newWindowPage = newWindowPage;
    }

    @Step("Получение url страницы")
    public String url() {
        return newWindowPage.url();
    }

    @Step("Получение текста страницы")
    public String getExampleText() {
        return newWindowPage.getExampleText();
    }

    @Step("Закрытие страницы")
    public void closePage() {
        newWindowPage.closePage();
    }
}
