package org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.buttons_steps.AddRemoveElementsPageButtonsSteps;
import org.ot5usk.ex_7_3_4.pages.pages_links.AddRemoveElementsPage;
import org.ot5usk.ex_7_3_4.pages.pages_links.buttons.AddRemoveElementsPageButtons;

public class AddRemoveElementsPageSteps {

    private final AddRemoveElementsPage page;
    private final AddRemoveElementsPageButtonsSteps buttonsSteps;

    public AddRemoveElementsPageSteps(AddRemoveElementsPage page) {
        this.page = page;
        this.buttonsSteps = new AddRemoveElementsPageButtonsSteps(new AddRemoveElementsPageButtons());
    }

    @Step("Получение XPaths всех кнопок страницы")
    public AddRemoveElementsPageButtonsSteps buttonsSteps() {
        return buttonsSteps;
    }

    @Step("Нажатие на кнопку добавления элемента")
    public void addElement() {
        page.addElement();
    }

    @Step("Нажатие на кнопку удаления элемента")
    public void deleteElement() {
        page.deleteElement();
    }
}
