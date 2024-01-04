package org.ot5usk.ex_7_3_4.pages.pages_links.buttons;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddRemoveElementsPageButtons {

    private final SelenideElement ADD_ELEMENT_BTN = $x("//button[text()='Add Element']");
    private final SelenideElement DELETE_ELEMENT_BTN = $x("//button[text()='Delete']");

    public SelenideElement addElementBtn() {
        return ADD_ELEMENT_BTN;
    }

    public SelenideElement deleteElementBtn() {
        return DELETE_ELEMENT_BTN;
    }
}
