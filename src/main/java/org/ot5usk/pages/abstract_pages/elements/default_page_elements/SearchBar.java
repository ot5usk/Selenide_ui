package org.ot5usk.pages.abstract_pages.elements.default_page_elements;

import io.qameta.allure.Step;
import org.ot5usk.pages.abstract_pages.CatalogPage;

public abstract class SearchBar {

    @Step("Ввод запроса в поисковую строку")
    public abstract SearchBar enterSearchQuery(String query);

    @Step("Нажатие кнопки выполнения введенного запроса")
    public abstract CatalogPage performSearchQuery();

    @Step("Поиск по запросу")
    public abstract CatalogPage search(String query);
}