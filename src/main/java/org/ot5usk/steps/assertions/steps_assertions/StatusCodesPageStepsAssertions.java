package org.ot5usk.steps.assertions.steps_assertions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.steps.assertions.AssertionsHeap;
import org.ot5usk.steps.pages_steps.pages_links_steps.StatusCodesPageSteps;

public class StatusCodesPageStepsAssertions extends AssertionsHeap {

    public StatusCodesPageSteps pageSteps;

    public StatusCodesPageStepsAssertions(StatusCodesPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка текста ссылки на страницу код 200")
    public void checkLinkTextToCode200Page() {
        SelenideElement linkToCode200Page = pageSteps.contentListItem(0);
        checkElementText("200", linkToCode200Page);
    }

    @Step("Проверка атрибута href ссылки на страницу код 200")
    public void checkLinkHrefToCode200Page() {
        SelenideElement linkToCode200Page = pageSteps.tagAContentListItem(0);
        checkElementHref("https://the-internet.herokuapp.com/status_codes/200", linkToCode200Page);
    }
}