package org.ot5usk.ex_7_3_4.pages.pages_links;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.ex_7_3_4.pages.pages_links.buttons.AddRemoveElementsPageButtons;

public class AddRemoveElementsPage {

    private final AddRemoveElementsPageButtons buttons;

    public AddRemoveElementsPage() {
        buttons = new AddRemoveElementsPageButtons();
    }

    public SelenideElement addElementBtn() {
        return buttons.addElementBtn();
    }

    public SelenideElement deleteElementBtn() {
        return buttons.deleteElementBtn();
    }

    public void addElement() {
        addElementBtn().click();
    }

    public void deleteElement() {
        deleteElementBtn().click();
    }
}
