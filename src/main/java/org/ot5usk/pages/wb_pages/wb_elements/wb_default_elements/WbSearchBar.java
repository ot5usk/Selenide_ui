package org.ot5usk.pages.wb_pages.wb_elements.wb_default_elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.ot5usk.pages.abstract_pages.CatalogPage;
import org.ot5usk.pages.abstract_pages.Page;
import org.ot5usk.pages.abstract_pages.elements.default_page_elements.SearchBar;
import org.ot5usk.pages.wb_pages.WbCatalogPage;

import java.util.Objects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WbSearchBar extends SearchBar {

    private final SelenideElement searchInput = $("#searchInput");
    private final SelenideElement performSearchQueryBtn = $("#applySearchBtn");
    private static String searchQuery;
    private static String tempQuery;



    @Override
    @Step("Ввод запроса в поисковую строку")
    public SearchBar enterSearchQuery(String query) {
        if (query.isEmpty()) {
            return this;
        }
        searchQuery = query;
        $(searchInput).clear();
        $(searchInput).shouldBe(visible).sendKeys(query);
        return this;
    }

    @Override
    @Step("Нажатие кнопки выполнения введенного запроса")
    public CatalogPage performSearchQuery() {
        CatalogPage catalogPage = new WbCatalogPage(WbCatalogPage.URL);
        if (tempQuery == null || !Objects.equals(tempQuery, searchQuery)) {
            tempQuery = searchQuery;
            $(performSearchQueryBtn).should(visible).click();
            catalogPage.setUrl(Page.determineCurrentUrl());
        } else {
            $(searchInput).shouldBe(visible).sendKeys(Keys.ENTER);
        }
        return catalogPage;
    }

    @Override
    @Step("Поиск по запросу")
    public CatalogPage search(String query) {
        enterSearchQuery(query);
        return performSearchQuery();
    }
}