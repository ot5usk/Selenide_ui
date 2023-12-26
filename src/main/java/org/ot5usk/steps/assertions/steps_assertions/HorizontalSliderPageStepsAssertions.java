package org.ot5usk.steps.assertions.steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.assertions.AssertionsHeap;
import org.ot5usk.steps.pages_steps.pages_links_steps.HorizontalSliderPageSteps;

public class HorizontalSliderPageStepsAssertions extends AssertionsHeap {

    private final HorizontalSliderPageSteps pageSteps;

    public HorizontalSliderPageStepsAssertions(HorizontalSliderPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка значения слайдера")
    public void checkSliderValue() {
        checkElementValue("0",pageSteps.slider());
    }
}
