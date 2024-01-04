package org.ot5usk.ex_7_3_4.pages;

import static com.codeborne.selenide.Selenide.open;

public class TheInternetHomePage {

    private static final String URL = "https://the-internet.herokuapp.com/";
    private final TheInternetHomePageLinks links;

    public TheInternetHomePage() {
        links = new TheInternetHomePageLinks();
    }

    public TheInternetHomePageLinks links() {
        return links;
    }

    public void openHomePage() {
        open(URL);
    }
}