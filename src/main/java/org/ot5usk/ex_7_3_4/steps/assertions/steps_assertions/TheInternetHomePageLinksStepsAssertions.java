package org.ot5usk.ex_7_3_4.steps.assertions.steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.steps.pages_steps.TheInternetHomePageLinksSteps;
import org.ot5usk.ex_7_3_4.steps.assertions.AssertionsHeap;

public class TheInternetHomePageLinksStepsAssertions extends AssertionsHeap {

    private final TheInternetHomePageLinksSteps linksSteps;

    public TheInternetHomePageLinksStepsAssertions(TheInternetHomePageLinksSteps linksSteps) {
        this.linksSteps = linksSteps;
    }

    @Step("Проверка видимости ссылки на страницу Add/Remove Elements")
    public void addRemoveElementsPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.addRemoveElementsPageLinkSteps());
    }

    @Step("Проверка видимости ссылки на страницу Horizontal Slider")
    public void horizontalSliderPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.horizontalSliderPageLinkSteps());
    }

    @Step("Проверка видимости ссылки на страницу Status Codes")
    public void statusCodesPageLinkStepsIsVisible() {
        elementIsVisible(linksSteps.statusCodesPageLinkSteps());
    }
}
