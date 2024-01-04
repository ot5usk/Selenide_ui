package org.ot5usk.ex_7_3_4.steps.pages_steps;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.AddRemoveElementsPageSteps;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.HorizontalSliderPageSteps;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.StatusCodesPageSteps;
import org.ot5usk.ex_7_3_4.pages.TheInternetHomePage;

public class TheInternetHomePageSteps {

    private final TheInternetHomePage page;
    private final TheInternetHomePageLinksSteps linksSteps;

    public TheInternetHomePageSteps() {
        this.page = new TheInternetHomePage();
        this.linksSteps = new TheInternetHomePageLinksSteps(page.links());
    }

    @Step("Получение XPaths всех ссылок домашней страницы")
    public TheInternetHomePageLinksSteps linksSteps() {
        return linksSteps;
    }

    @Step("Открытие домашней страницы")
    public void openHomePage() {
        page.openHomePage();
    }

    @Step("Переход на страницу: Add/Remove Elements")
    public AddRemoveElementsPageSteps goToAddRemoveElementsPageSteps() {
        return linksSteps().goToAddRemoveElementsPageSteps();
    }

    @Step("Переход на страницу: Horizontal Slider")
    public HorizontalSliderPageSteps goToHorizontalSliderPageSteps() {
        return linksSteps.goToHorizontalSliderPageSteps();
    }

    @Step("Переход на страницу: Status Codes")
    public StatusCodesPageSteps goToStatusCodesPageSteps() {
        return linksSteps.goToStatusCodesPageSteps();
    }
}
