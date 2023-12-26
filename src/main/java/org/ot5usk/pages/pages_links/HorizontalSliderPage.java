package org.ot5usk.pages.pages_links;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HorizontalSliderPage {

    private final SelenideElement SLIDER = $x("//input[@type='range']");

    public SelenideElement slider() {
        return SLIDER;
    }
}
