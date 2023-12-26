package org.ot5usk.pages;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.pages.pages_links.*;

import static com.codeborne.selenide.Selenide.$x;

public class TheInternetHomePageLinks {

    private final SelenideElement ADD_REMOVE_ELEMENTS_PAGE_LINK = $x("//a[text()='Add/Remove Elements']");
    private final SelenideElement STATUS_CODES_PAGE_LINK = $x("//a[text()='Status Codes']");
    private final SelenideElement HORIZONTAL_SLIDER_PAGE_LINK = $x("//a[text()='Horizontal Slider']");

    public SelenideElement addRemoveElementsPageLink() {
        return ADD_REMOVE_ELEMENTS_PAGE_LINK;
    }

    public SelenideElement statusCodesPageLink() {
        return STATUS_CODES_PAGE_LINK;
    }

    public SelenideElement horizontalSliderPageLink() {
        return HORIZONTAL_SLIDER_PAGE_LINK;
    }

    public AddRemoveElementsPage goToAddRemoveElementsPage() {
        addRemoveElementsPageLink().click();
        return new AddRemoveElementsPage();
    }

    public StatusCodesPage goToStatusCodesPage() {
        statusCodesPageLink().click();
        return new StatusCodesPage();
    }

    public HorizontalSliderPage goToHorizontalSliderPage() {
        horizontalSliderPageLink().click();
        return new HorizontalSliderPage();
    }
}
