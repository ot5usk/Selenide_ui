package org.ot5usk.ex_7_3_4.steps.assertions.steps_assertions;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.AddRemoveElementsPageSteps;
import org.ot5usk.ex_7_3_4.steps.assertions.AssertionsHeap;

public class AddRemoveElementsPageStepsAssertions extends AssertionsHeap {

    AddRemoveElementsPageSteps pageSteps;

    public AddRemoveElementsPageStepsAssertions(AddRemoveElementsPageSteps pageSteps) {
        this.pageSteps = pageSteps;
    }

    @Step("Проверка видимости кнопки добавления элемента")
    public void addElementBtnIsVisible() {
        elementIsVisible(pageSteps.buttonsSteps().addElementBtn());
    }

    @Step("Проверка невидимости кнопки удаления элемента")
    public void deleteElementBtnIsInvisible() {
        elementIsInvisible(pageSteps.buttonsSteps().deleteElementBtn());
    }

    @Step("Проверка появления кнопки удаления элемента")
    public void deleteElementBtnIsAppear() {
        elementIsAppear(pageSteps.buttonsSteps().deleteElementBtn());
    }

    @Step("Проверка исчезновения кнопки удаления элемента")
    public void deleteElementBtnIsDisappear() {
        elementIsDisappear(pageSteps.buttonsSteps().deleteElementBtn());
    }
}
