package org.ot5usk.pages.abstract_pages.elements.default_page_elements;

import io.qameta.allure.Step;
import lombok.Setter;

@Setter
public abstract class DefaultPageElements {

    private ChangeCity changeCity;
    private SearchBar searchBar;
    private NavigationBar navigationBar;

    public ChangeCity changeCity() {
        return changeCity;
    }

    @Step("Определение поисковой строки")
    public SearchBar searchBar() {
        return searchBar;
    }

    public NavigationBar navigationBar() {
        return navigationBar;
    }
}
