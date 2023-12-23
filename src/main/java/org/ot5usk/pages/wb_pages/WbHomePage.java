package org.ot5usk.pages.wb_pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.abstract_pages.HomePage;
import org.ot5usk.pages.wb_pages.wb_elements.wb_default_elements.WbDefaultPageElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WbHomePage extends HomePage {

    public static final String URL = "https://www.wildberries.ru";
    private static final SelenideElement MUST_BE_LOADED = $x("//div[contains(@class, 'main-page')]"); //dynamic

    public WbHomePage() {
        super.setUrl(URL);
        super.setDefaultPageElements(new WbDefaultPageElements());
    }

    @Override
    @Step("Откртыие главной страницы Wb")
    public WbHomePage openPage() {
        open(URL);
        MUST_BE_LOADED.shouldBe(visible);
        return this;
    }
}
