package org.ot5usk.ex_7_3_4.steps.pages_steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.AddRemoveElementsPageSteps;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.HorizontalSliderPageSteps;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.StatusCodesPageSteps;
import org.ot5usk.ex_7_3_4.pages.TheInternetHomePageLinks;

public class TheInternetHomePageLinksSteps {

    private final TheInternetHomePageLinks links;

    public TheInternetHomePageLinksSteps(TheInternetHomePageLinks links) {
        this.links = links;
    }

    @Step("Получение XPath ссылки на страницу Add/Remove Elements")
    public SelenideElement addRemoveElementsPageLinkSteps() {
        return links.addRemoveElementsPageLink();
    }

    @Step("Получение XPath ссылки на страницу Status Codes")
    public SelenideElement statusCodesPageLinkSteps() {
        return links.statusCodesPageLink();
    }

    @Step("Получение XPath ссылки на страницу Horizontal Slider")
    public SelenideElement horizontalSliderPageLinkSteps() {
        return links.horizontalSliderPageLink();
    }

    @Step("Нажатие на ссылку: Add/Remove Elements")
    public AddRemoveElementsPageSteps goToAddRemoveElementsPageSteps() {
        return new AddRemoveElementsPageSteps(links.goToAddRemoveElementsPage());
    }

    @Step("Нажатие на ссылку: Horizontal Slider")
    public HorizontalSliderPageSteps goToHorizontalSliderPageSteps() {
        return new HorizontalSliderPageSteps(links.goToHorizontalSliderPage());
    }

    @Step("Нажатие на ссылку: Status Codes")
    public StatusCodesPageSteps goToStatusCodesPageSteps() {
        return new StatusCodesPageSteps(links.goToStatusCodesPage());
    }
}
