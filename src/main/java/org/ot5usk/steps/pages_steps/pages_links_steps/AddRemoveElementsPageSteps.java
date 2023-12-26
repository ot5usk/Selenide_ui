package org.ot5usk.steps.pages_steps.pages_links_steps;

import io.qameta.allure.Step;
import org.ot5usk.pages.pages_links.AddRemoveElementsPage;
import org.ot5usk.pages.pages_links.buttons.AddRemoveElementsPageButtons;
import org.ot5usk.steps.pages_steps.pages_links_steps.buttons_steps.AddRemoveElementsPageButtonsSteps;

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
