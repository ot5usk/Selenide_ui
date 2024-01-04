package org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.buttons_steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.pages.pages_links.buttons.AddRemoveElementsPageButtons;

public class AddRemoveElementsPageButtonsSteps {

    private final AddRemoveElementsPageButtons buttons;

    public AddRemoveElementsPageButtonsSteps(AddRemoveElementsPageButtons buttons) {
        this.buttons = buttons;
    }

    @Step("Получение XPath кнопки добавления элемента")
    public SelenideElement addElementBtn() {
        return buttons.addElementBtn();
    }

    @Step("Получение XPath кнопки удаления элемента")
    public SelenideElement deleteElementBtn() {
        return buttons.deleteElementBtn();
    }
}
