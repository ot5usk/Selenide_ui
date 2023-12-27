package org.ot5usk.pages.windows;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WindowsPage {

    private static final String URL = "https://the-internet.herokuapp.com/windows";
    private final SelenideElement NEW_WINDOW_PAGE_LINK = $x("//a[@href='/windows/new']");

    public void openPage() {
        open(URL);
    }

    public String url() {
        return URL;
    }

    public SelenideElement newWindowPageLink() {
        return NEW_WINDOW_PAGE_LINK;
    }

    public NewWindowPage clickNewWindowPageLink() {
        newWindowPageLink().click();
        return new NewWindowPage();
    }
}
