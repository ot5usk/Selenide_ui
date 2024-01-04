package org.ot5usk.ex_7_4_3.pages.windows;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.closeWindow;

public class NewWindowPage {

    private static final String URL = "https://the-internet.herokuapp.com/windows/new";
    private static final SelenideElement EXAMPLE = $x("//div[@class='example']");

    public String url() {
        return URL;
    }

    public String getExampleText() {
        return EXAMPLE.getText();
    }

    public void closePage() {
        closeWindow();
    }
}
