package org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_3_4.pages.pages_links.HorizontalSliderPage;

public class HorizontalSliderPageSteps {

    private final HorizontalSliderPage page;

    public HorizontalSliderPageSteps(HorizontalSliderPage page) {
        this.page = page;
    }

    @Step("Получение XPath слайдера")
    public SelenideElement slider() {
        return page.slider();
    }
}
