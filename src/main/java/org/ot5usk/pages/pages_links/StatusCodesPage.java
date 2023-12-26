package org.ot5usk.pages.pages_links;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatusCodesPage {

    private final SelenideElement CONTENT = $x("//div[@id='content']");

    public SelenideElement content() {
        return CONTENT;
    }
}
